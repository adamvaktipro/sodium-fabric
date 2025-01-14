package me.jellysquid.mods.sodium.client.util.math;

import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Quaternion;
import net.minecraft.util.math.Vec3f;
import org.spongepowered.asm.mixin.Shadow;

public interface Matrix3fExtended {
    /**
     * Applies the specified rotation to this matrix in-place.
     *
     * @param quaternion The quaternion to rotate this matrix by
     */
    void rotate(Quaternion quaternion);

    int computeNormal(Direction dir);

    float transformVecX(float x, float y, float z);

    float transformVecY(float x, float y, float z);

    float transformVecZ(float x, float y, float z);

    default float transformVecX(Vec3f dir) {
        return this.transformVecX(dir.getX(), dir.getY(), dir.getZ());
    }

    default float transformVecY(Vec3f dir) {
        return this.transformVecY(dir.getX(), dir.getY(), dir.getZ());
    }

    default float transformVecZ(Vec3f dir) {
        return this.transformVecZ(dir.getX(), dir.getY(), dir.getZ());
    }

    float getA00();

    float getA10();

    float getA20();

    float getA01();

    float getA11();

    float getA21();

    float getA02();

    float getA12();

    float getA22();
}
