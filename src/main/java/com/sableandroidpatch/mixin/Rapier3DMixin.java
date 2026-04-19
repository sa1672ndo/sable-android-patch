package com.sa1672ndo.sableandroidpatch.mixin;

import dev.ryanhcode.sable.physics.impl.rapier.Rapier3D;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

@Mixin(Rapier3D.class)
public class Rapier3DMixin {
    @Overwrite
    private static void loadLibrary() {
        try (InputStream is = com.sa1672ndo.sableandroidpatch.SableAndroidPatch.class.getResourceAsStream("/natives/sable-rapier/sable_rapier_aarch64_android.so")){
            if (is == null) {
                throw new RuntimeException("Sable Android Patch broke, or it's corrupted.");
            }
            Path tempFile = Files.createTempFile("sable_rapier_natives", null);
            Files.copy(is, tempFile, StandardCopyOption.REPLACE_EXISTING);
            System.load(tempFile.toAbsolutePath().toString());
            Rapier3DAccessor.setEnabled(true);
            } 
            catch (Throwable t) 
            {
            Rapier3DAccessor.setEnabled(false);
            t.printStackTrace();
        }
    }
}