# Sable android patch
<a href="https://github.com/sa1672ndo/sable-android-patch"><img src="./src/main/resources/icon.png" width="125"/></a>

<p style="text-align: left;">
    <a href="https://modrinth.com/mod/sable-android-patch"><img src="https://cdn.jsdelivr.net/npm/@intergrav/devins-badges@3/assets/cozy/available/modrinth_vector.svg" alt="Modrinth" style="margin: 5px 5px;"></a>
    <a href="https://www.curseforge.com/minecraft/mc-mods/sable-android-patch"><img src="https://cdn.jsdelivr.net/npm/@intergrav/devins-badges@3/assets/cozy/available/curseforge_vector.svg" alt="Curseforge" style="margin: 5px 5px;"></a>
</p>

Allows you to run sable on android by modifying it's `loadLibrary` method to load android native included in this patch mod.

Android sable_rapier native source code can be found here: https://github.com/aksksklskdamkwkskskd-del/sable_android

# Build instruction

- Download the repo manually or with `git` 
- Install [jdk21](https://adoptium.net/temurin/releases/?version=21&os=any&arch=any)
- Open your terminal/cmd
- Move to the repo's folder with the `cd` command
- Run `./gradlew build` on linux, or `gradlew.bat build` on windows
- Get the jar from `./build/libs/` if it was successfully compiled

Or just use github actions. 
