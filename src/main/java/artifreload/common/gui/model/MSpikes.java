package artifreload.common.gui.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;


public class MSpikes extends ModelBase {

//fields
ModelRenderer Base;
ModelRenderer SpikeLower2;
ModelRenderer SpikeUpper2;
ModelRenderer SpikeLower4;
ModelRenderer SpikeUpper4;
ModelRenderer SpikeLower1;
ModelRenderer SpikeUpper1;
ModelRenderer SpikeLower3;
ModelRenderer SpikeUpper3;

public SpikesModel()
{
	textureWidth = 64;
	textureHeight = 32;

	Base = new ModelRenderer(this, 0, 0);
	Base.addBox(0F, 0F, 0F, 16, 1, 16);
	Base.setRotationPoint(-8F, 8F, -8F);
	Base.setTextureSize(64, 32);
	Base.mirror = true;
	setRotation(Base, 0F, 0F, 0F);

	SpikeLower2 = new ModelRenderer(this, 32, 17);
	SpikeUpper2 = new ModelRenderer(this, 24, 17);
	SpikeLower2.addBox(-2F, 0F, -2F, 4, 5, 4);
	SpikeLower2.setRotationPoint(-4F, 14F, 4F);
	SpikeLower2.setTextureSize(64, 32);
	SpikeLower2.mirror = true;
	setRotation(SpikeLower2, 0F, 0F, 0F);
	SpikeUpper2.addBox(-1F, 0F, -1F, 2, 8, 2);
	SpikeUpper2.setRotationPoint(-4F, 22F, 4F);
	SpikeUpper2.setTextureSize(64, 32);
	SpikeUpper2.mirror = true;
	setRotation(SpikeUpper2, 0F, 0F, 0F);
	SpikeLower4 = new ModelRenderer(this, 0, 17);
	SpikeLower4.addBox(0F, 0F, 0F, 4, 5, 4);
	SpikeLower4.setRotationPoint(2F, 14F, -2F);
	SpikeLower4.setTextureSize(64, 32);
	SpikeLower4.mirror = true;
	setRotation(SpikeLower4, 0F, 0F, 0F);
	SpikeUpper4 = new ModelRenderer(this, 16, 17);
	SpikeUpper4.addBox(0F, 0F, 0F, 2, 8, 2);
	SpikeUpper4.setRotationPoint(3F, 22F, -3F);
	SpikeUpper4.setTextureSize(64, 32);
	SpikeUpper4.mirror = true;
	setRotation(SpikeUpper4, 0F, 0F, 0F);
	SpikeLower1 = new ModelRenderer(this, 0, 17);
	SpikeLower1.addBox(-2F, 0F, -2F, 4, 5, 4);
	SpikeLower1.setRotationPoint(-4F, 14F, -4F);
	SpikeLower1.setTextureSize(64, 32);
	SpikeLower1.mirror = true;
	setRotation(SpikeLower1, 0F, 0F, 0F);
	SpikeUpper1 = new ModelRenderer(this, 16, 17);
	SpikeUpper1.addBox(-1F, 0F, -1F, 2, 8, 2);
	SpikeUpper1.setRotationPoint(-4F, 22F, -4F);
	SpikeUpper1.setTextureSize(64, 32);
	SpikeUpper1.mirror = true;
	setRotation(SpikeUpper1, 0F, 0F, 0F);
	SpikeLower3 = new ModelRenderer(this, 0, 17);
	SpikeLower3.addBox(-2F, 0F, -2F, 4, 5, 4);
	SpikeLower3.setRotationPoint(4F, 14F, 4F);
	SpikeLower3.setTextureSize(64, 32);
	SpikeLower3.mirror = true;
	setRotation(SpikeLower3, 0F, 0F, 0F);
	SpikeUpper3 = new ModelRenderer(this, 16, 17);
	SpikeUpper3.addBox(-1F, 0F, -1F, 2, 8, 2);
	SpikeUpper3.setRotationPoint(4F, 22F, 4F);
	SpikeUpper3.setTextureSize(64, 32);
	SpikeUpper3.mirror = true;
	setRotation(SpikeUpper3, 0F, 0F, 0F);
}

public void render(TileEntity te, double x, double y, double z) {
	TileEntitySpikes es = (TileEntitySpikes)te;
	GL11.glPushMatrix();
	GL11.glTranslatef((float)x + 0.5f, (float)y - 0.5f, (float)z + 0.5f);
	//GL11.glScalef(0.5f, 0.5f, 0.5f);
	//FMLClientHandler.instance().getClient().renderEngine.bindTexture(es.getModelTexture());
	ResourceLocation rl = new ResourceLocation(es.getModelTexture());
	FMLClientHandler.instance().getClient().renderEngine.bindTexture(rl);
	this.render();
	GL11.glPopMatrix();
}

private void render() {
	setRotation(SpikeLower1, 3.1415F, 0, 0);
	setRotation(SpikeLower2, 3.1415F, 0, 0);
	setRotation(SpikeLower3, 3.1415F, 0, 0);
	setRotation(SpikeLower4, 3.1415F, 0, 0);
	setRotation(SpikeUpper1, 3.1415F, 0, 0);
	setRotation(SpikeUpper2, 3.1415F, 0, 0);
	setRotation(SpikeUpper3, 3.1415F, 0, 0);
	setRotation(SpikeUpper4, 3.1415F, 0, 0);
	Base.render(0.0625F);
	SpikeLower1.render(0.0625F);
	SpikeLower2.render(0.0625F);
	SpikeLower3.render(0.0625F);
	SpikeLower4.render(0.0625F);
	SpikeUpper1.render(0.0625F);
	SpikeUpper2.render(0.0625F);
	SpikeUpper3.render(0.0625F);
	SpikeUpper4.render(0.0625F);
}

private void setRotation(ModelRenderer model, float x, float y, float z)
{
	model.rotateAngleX = x;
	model.rotateAngleY = y;
	model.rotateAngleZ = z;
}
}

