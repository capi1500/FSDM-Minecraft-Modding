package com.example.examplemod.items;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SuperSword extends SwordItem{
	public SuperSword(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builderIn){
		super(tier, attackDamageIn, attackSpeedIn, builderIn);
	}
	
	@Override
	public boolean hitEntity(ItemStack stack, LivingEntity target, LivingEntity attacker){
		super.hitEntity(stack, target, attacker);
		
		target.setFire(3);
		target.setInvisible(true);
		target.setNoGravity(true);
		
		ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
		
		scheduledExecutorService.schedule(
				() -> {
					target.setInvisible(false);
					target.setNoGravity(false);
				},
				3,
				TimeUnit.SECONDS
		);
		
		return true;
	}
}
