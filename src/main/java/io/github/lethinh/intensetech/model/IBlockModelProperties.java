/**
* Created by Le Thinh
*/

package io.github.lethinh.intensetech.model;

import io.github.lethinh.intensetech.model.definition.FlatModelBlockDefinition;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public interface IBlockModelProperties {

	@SideOnly(Side.CLIENT)
	FlatModelBlockDefinition getModelDefinition();

	@SideOnly(Side.CLIENT)
	String getTexture();

	@SideOnly(Side.CLIENT)
	boolean isUvLock();

	@SideOnly(Side.CLIENT)
	boolean isSmooth();

	@SideOnly(Side.CLIENT)
	boolean isGui3d();

	@SideOnly(Side.CLIENT)
	boolean isAmbientOcclusion();

}
