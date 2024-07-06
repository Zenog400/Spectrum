package de.dafuqs.spectrum.blocks.mob_head.models;


import de.dafuqs.spectrum.blocks.mob_head.*;
import net.minecraft.client.model.*;
import net.minecraft.client.render.entity.model.*;

public class ChickenHeadModel extends SpectrumHeadModel {

    public ChickenHeadModel(ModelPart root) {
        super(root);
    }

    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
    
        ModelPartData head = modelPartData.addChild(
                EntityModelPartNames.HEAD,
                ModelPartBuilder.create().uv(0, 0).cuboid(-2.0F, -6.0F, -1.5F, 4.0F, 6.0F, 3.0F),
                ModelTransform.NONE
        );
        
        head.addChild(
                EntityModelPartNames.BEAK,
                ModelPartBuilder.create().uv(14, 0).cuboid(-2.0F, -4.0F, -3.5F, 4.0F, 2.0F, 2.0F),
                ModelTransform.NONE
        );
        head.addChild(
                "red_thing",
                ModelPartBuilder.create().uv(14, 4).cuboid(-1.0F, -2.0F, -2.5F, 2.0F, 2.0F, 2.0F),
                ModelTransform.NONE
        );

        return TexturedModelData.of(modelData, 64, 32);
    }

}