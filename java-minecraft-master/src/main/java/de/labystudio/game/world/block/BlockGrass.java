package de.labystudio.game.world.block;

import de.labystudio.game.util.EnumBlockFace;

public class BlockGrass extends Block {

    public BlockGrass(int id, int textureSlot) {
        super(id, textureSlot);
    }

    @Override
    public int getTextureForFace(EnumBlockFace face) {
        switch (face) {
            case TOP:
                return this.textureSlotId;
            case BOTTOM:
                return this.textureSlotId + 6;
            case WEST:
                return this.textureSlotId + 0;
            case NORTH:
                return this.textureSlotId + 5;
            case EAST:
                return this.textureSlotId + 7;
            case SOUTH:
                return this.textureSlotId + 4;
            default:
                return this.textureSlotId + 3;
        }
    }
}
