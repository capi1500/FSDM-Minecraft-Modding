package com.example.examplemod.entities;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.SkeletonRenderer;
import net.minecraft.entity.monster.AbstractSkeletonEntity;
import org.lwjgl.opengl.GL11;

public class BigSkeletonRenderer extends SkeletonRenderer{
	public BigSkeletonRenderer(EntityRendererManager renderManagerIn){
		super(renderManagerIn);
	}
	
	@Override
	protected void preRenderCallback(AbstractSkeletonEntity entitylivingbaseIn, MatrixStack matrixStackIn, float partialTickTime){
		super.preRenderCallback(entitylivingbaseIn, matrixStackIn, partialTickTime);
		GL11.glScalef(2, 2, 2);
	}
}
