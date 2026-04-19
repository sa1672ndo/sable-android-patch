package com.sa1672ndo.sableandroidpatch.mixin;

import dev.ryanhcode.sable.physics.impl.rapier.Rapier3D;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(Rapier3D.class)
public interface Rapier3DAccessor {
    @Accessor("ENABLED")
    static void setEnabled(boolean value) {
        throw new AssertionError();
    }
}
