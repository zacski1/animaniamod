package com.animania.client.models.goats;

import com.animania.common.entities.goats.EntityKidKiko;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.math.MathHelper;

public class ModelKidKiko extends ModelBase
{	
	private float headRotationAngleX;
	public ModelRenderer HeadNode = new ModelRenderer(this, 0, 0);

	ModelRenderer Body;
	ModelRenderer Butt;
	ModelRenderer Tail;
	ModelRenderer BackLeg_L;
	ModelRenderer BackLeg_R;
	ModelRenderer FrontLeg_L;
	ModelRenderer FrontLeg_R;
	ModelRenderer Neck;
	ModelRenderer Head;
	ModelRenderer Ear_R;
	ModelRenderer Ear2_R;
	ModelRenderer Ear_L;
	ModelRenderer Ear2_L;
	ModelRenderer Bud_R;
	ModelRenderer Mouth;
	ModelRenderer Snout3;
	ModelRenderer Nose;
	ModelRenderer Snout1;
	ModelRenderer Snout2;
	ModelRenderer Bud_L;

	public ModelKidKiko()
	{
		this(0.0f);
	}

	public ModelKidKiko(float par1)
	{
		Body = new ModelRenderer( this, 81, 5 );
		Body.setTextureSize( 128, 128 );
		Body.addBox( -5F, -5F, -6.5F, 10, 14, 13);
		Body.setRotationPoint( 0F, 7F, 2F );
		Butt = new ModelRenderer( this, 71, 40 );
		Butt.setTextureSize( 128, 128 );
		Butt.addBox( -4.5F, -6.5F, 0F, 9, 13, 18);
		Butt.setRotationPoint( 0F, 9.428168F, 6.806662F );
		Tail = new ModelRenderer( this, 38, 10 );
		Tail.setTextureSize( 128, 128 );
		Tail.addBox( -1.5F, -5F, -1.5F, 3, 8, 3);
		Tail.setRotationPoint( 0F, 4.09654F, 24.71124F );
		BackLeg_L = new ModelRenderer( this, 47, 28 );
		BackLeg_L.setTextureSize( 128, 128 );
		BackLeg_L.addBox( -1.5F, -3F, -2.5F, 3, 18, 5);
		BackLeg_L.setRotationPoint( 5F, 10.20634F, 18.82309F );
		BackLeg_R = new ModelRenderer( this, 47, 28 );
		BackLeg_R.setTextureSize( 128, 128 );
		BackLeg_R.addBox( -1.5F, -3F, -2.5F, 3, 18, 5);
		BackLeg_R.setRotationPoint( -5F, 10.20634F, 18.82309F );
		FrontLeg_L = new ModelRenderer( this, 62, 4 );
		FrontLeg_L.setTextureSize( 128, 128 );
		FrontLeg_L.addBox( -1.5F, -2F, -2F, 3, 16, 4);
		FrontLeg_L.setRotationPoint( 4F, 11.71951F, -1.424363F );
		FrontLeg_R = new ModelRenderer( this, 62, 4 );
		FrontLeg_R.setTextureSize( 128, 128 );
		FrontLeg_R.addBox( -1.5F, -2F, -2F, 3, 16, 4);
		FrontLeg_R.setRotationPoint( -4F, 11.71951F, -1.424363F );
		
		HeadNode = new ModelRenderer(this, 85, 78);
		HeadNode.setTextureSize(128, 128);
		HeadNode.addBox(0F, 0F, 0F, 0, 0, 0);
		HeadNode.setRotationPoint(0F, 8.730923F, -1.162896F);

		Neck = new ModelRenderer(this, 85, 78);
		Neck.setTextureSize(128, 128);
		Neck.addBox(-2F, -4F, -14.5F, 4, 8, 15);
		Neck.setRotationPoint(0F, 0F, 0F);

		Head = new ModelRenderer( this, 9, 60 );
		Head.setTextureSize( 128, 128 );
		Head.addBox( -3F, -3.5F, -7.5F, 6, 7, 7);
		Head.setRotationPoint( 0F, -1.888433F - 8.730923F, -6.00844F + 1.162896F );

		Ear_R = new ModelRenderer( this, 60, 84 );
		Ear_R.setTextureSize( 128, 128 );
		Ear_R.addBox( -4F, -1F, -0.5F, 4, 2, 1);
		Ear_R.setRotationPoint( -2.5F, -2.991261F - 8.730923F, -9.441189F  + 1.162896F);
		Ear2_R = new ModelRenderer( this, 49, 80 );
		Ear2_R.setTextureSize( 128, 128 );
		Ear2_R.addBox( -2.5F, -0.5F, -0.5F, 1, 1, 1);
		Ear2_R.setRotationPoint( -4.761655F, -3.719296F - 8.730923F, -10.21893F  + 1.162896F);
		Ear_L = new ModelRenderer( this, 60, 84 );
		Ear_L.setTextureSize( 128, 128 );
		Ear_L.addBox( 0F, -1F, -0.5F, 4, 2, 1);
		Ear_L.setRotationPoint( 2.5F, -2.991261F - 8.730923F, -9.441189F + 1.162896F );
		Ear2_L = new ModelRenderer( this, 49, 80 );
		Ear2_L.setTextureSize( 128, 128 );
		Ear2_L.addBox( 1.5F, -0.5F, -0.5F, 1, 1, 1);
		Ear2_L.setRotationPoint( 4.761655F, -3.719296F - 8.730923F, -10.21893F + 1.162896F );
		Bud_R = new ModelRenderer( this, 38, 64 );
		Bud_R.setTextureSize( 128, 128 );
		Bud_R.addBox( -1.5F, -0.5F, -1.5F, 3, 1, 3);
		Bud_R.setRotationPoint( -1.8F, -4.996187F - 8.730923F, -8.97186F  + 1.162896F);
		Mouth = new ModelRenderer( this, 8, 111 );
		Mouth.setTextureSize( 128, 128 );
		Mouth.addBox( -1.5F, -0.5F, -5.5F, 3, 1, 6);
		Mouth.setRotationPoint( 0F, 2.542599F - 8.730923F, -10.98598F + 1.162896F );
		Snout3 = new ModelRenderer( this, 9, 86 );
		Snout3.setTextureSize( 128, 128 );
		Snout3.addBox( -1.5F, 0F, -5F, 3, 2, 5);
		Snout3.setRotationPoint( 0F, -1.519526F - 8.730923F, -13.70106F  + 1.162896F);
		Nose = new ModelRenderer( this, 40, 91 );
		Nose.setTextureSize( 128, 128 );
		Nose.addBox( -1F, 0F, 0F, 2, 2, 2);
		Nose.setRotationPoint( 0F, 1.600178F - 8.730923F, -18.27188F + 1.162896F );
		Snout1 = new ModelRenderer( this, 11, 76 );
		Snout1.setTextureSize( 128, 128 );
		Snout1.addBox( -1.5F, 0F, -5.5F, 3, 2, 6);
		Snout1.setRotationPoint( -0.01F, -2.721825F - 8.730923F, -14.04308F  + 1.162896F);
		Snout2 = new ModelRenderer( this, 10, 96 );
		Snout2.setTextureSize( 128, 128 );
		Snout2.addBox( -2F, -0.5F, -5F, 4, 3, 6);
		Snout2.setRotationPoint( 0F, 0.07593727F - 8.730923F, -13.10778F  + 1.162896F);
		Bud_L = new ModelRenderer( this, 38, 64 );
		Bud_L.setTextureSize( 128, 128 );
		Bud_L.addBox( -1.5F, -0.5F, -1.5F, 3, 1, 3);
		Bud_L.setRotationPoint( 1.8F, -4.996187F - 8.730923F, -8.97186F + 1.162896F );

		this.HeadNode.addChild(Head);
		this.HeadNode.addChild(Neck);
		this.HeadNode.addChild(Ear_R);
		this.HeadNode.addChild(Ear2_R);
		this.HeadNode.addChild(Ear_L);
		this.HeadNode.addChild(Ear2_L);
		this.HeadNode.addChild(Bud_R);
		this.HeadNode.addChild(Bud_L);
		this.HeadNode.addChild(Mouth);
		this.HeadNode.addChild(Snout1);
		this.HeadNode.addChild(Snout2);
		this.HeadNode.addChild(Snout3);

	}

	public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale)
	{
		this.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entityIn);
		Body.rotateAngleX = -0.08726646F;
		Butt.rotateAngleX = 0.01847221F;
		Tail.rotateAngleX = -0.6475495F;
		BackLeg_L.rotateAngleX = 0.01847221F;
		BackLeg_R.rotateAngleX = 0.01847221F;
		Neck.rotateAngleX = -0.9705301F;
		Head.rotateAngleX = 0.2771511F;
		Ear_R.rotateAngleX = 0.3975939F;
		Ear_R.rotateAngleY = -0.2030238F;
		Ear_R.rotateAngleZ = 0.321354F;
		Ear2_R.rotateAngleX = 0.397594F;
		Ear2_R.rotateAngleY = -0.2030239F;
		Ear2_R.rotateAngleZ = 0.3213542F;
		Ear_L.rotateAngleX = 0.3975939F;
		Ear_L.rotateAngleY = 0.2030238F;
		Ear_L.rotateAngleZ = -0.321354F;
		Ear2_L.rotateAngleX = 0.397594F;
		Ear2_L.rotateAngleY = 0.2030239F;
		Ear2_L.rotateAngleZ = -0.3213542F;
		Bud_R.rotateAngleX = 0.1493225F;
		Bud_R.rotateAngleY = -0.1260779F;
		Bud_R.rotateAngleZ = -0.09751795F;
		Mouth.rotateAngleX = 0.2771511F;
		Snout3.rotateAngleX = 0.6541421F;
		Nose.rotateAngleX = 0.4028149F;
		Snout1.rotateAngleX = 1.100248F;
		Snout2.rotateAngleX = 0.4028149F;
		Bud_L.rotateAngleX = 0.1493225F;
		Bud_L.rotateAngleY = 0.1260779F;
		Bud_L.rotateAngleZ = 0.09751794F;

		this.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entityIn);

		Body.render(scale);
		Butt.render(scale);
		Tail.render(scale);
		BackLeg_L.render(scale);	
		BackLeg_R.render(scale);
		FrontLeg_L.render(scale);
		FrontLeg_R.render(scale);  
		HeadNode.render(scale);
		

	}

	@Override
	public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float p_78086_2_, float p_78086_3_, float partialTickTime)
	{
		super.setLivingAnimations(entitylivingbaseIn, p_78086_2_, p_78086_3_, partialTickTime);

		this.HeadNode.rotationPointY = + 7.75F + ((EntityKidKiko)entitylivingbaseIn).getHeadRotationPointY(partialTickTime) * 6.0F;
		this.headRotationAngleX = ((EntityKidKiko)entitylivingbaseIn).getHeadRotationAngleX(partialTickTime);

	}

	@Override
	public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity scale)
	{
		float f6 = 180F / (float) Math.PI;

		//this.Body.rotateAngleX = (float) Math.PI / 2F;

		this.HeadNode.rotateAngleX = par5 / (180F / (float) Math.PI);
		this.HeadNode.rotateAngleY = par4 / (180F / (float) Math.PI);
		this.HeadNode.rotateAngleX = this.headRotationAngleX;

		//this.Tail.rotateAngleX = (float) Math.PI / 2F;
		this.Tail.rotateAngleY = MathHelper.sin(par3 * 3.141593F * 0.05F) * MathHelper.sin(par3 * 3.141593F * .03F * 0.05F) * 0.15F * 3.141593F;

		this.BackLeg_L.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
		this.BackLeg_R.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float) Math.PI) * 1.4F * par2;
		this.FrontLeg_L.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float) Math.PI) * 1.4F * par2;
		this.FrontLeg_R.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
	}

}