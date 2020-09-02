package prismatic.tridenttweaks.mixins;

import net.minecraft.enchantment.ImpalingEnchantment;
import net.minecraft.entity.EntityGroup;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(ImpalingEnchantment.class)
public class ImpalingMixin {
    /**
     * @author PrismaticYT
     */
    @Overwrite
    public float getAttackDamage(int level, EntityGroup group) {
        return (float)level * 2.5F;
    }
}
