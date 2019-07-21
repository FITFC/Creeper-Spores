package io.github.ladysnake.creeperspores.common;

import io.github.ladysnake.creeperspores.CreeperSpores;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectType;

public class CreeperSporeEffect extends StatusEffect {
    public CreeperSporeEffect(StatusEffectType type, int color) {
        super(type, color);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return duration == 1;
    }

    @Override
    public void applyUpdateEffect(LivingEntity affected, int amplifier) {
        CreeperlingEntity spawn = new CreeperlingEntity(CreeperSpores.CREEPERLING, affected.world);
        spawn.setPosition(affected.x, affected.y, affected.z);
        affected.world.spawnEntity(spawn);
    }
}