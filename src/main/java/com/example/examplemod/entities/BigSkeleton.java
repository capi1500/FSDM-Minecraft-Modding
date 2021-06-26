package com.example.examplemod.entities;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.monster.SkeletonEntity;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

public class BigSkeleton extends SkeletonEntity{
	public BigSkeleton(EntityType<? extends SkeletonEntity> type, World world){
		super(type, world);
		this.experienceValue = 20;
	}
	
	public static AttributeModifierMap.MutableAttribute createBigSkeletonAttributes(){
		return BigSkeleton.registerAttributes()
				.createMutableAttribute(Attributes.MAX_HEALTH, 30)
				.createMutableAttribute(Attributes.ATTACK_DAMAGE, 15)
				.createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.3);
	}
}
