package com.ss.editor.ui.controller.model.node.physics.shape;

import com.jme3.bullet.collision.shapes.CylinderCollisionShape;
import com.ss.editor.Messages;
import com.ss.editor.ui.Icons;
import javafx.scene.image.Image;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * The implementation of node to show {@link CylinderCollisionShape}.
 *
 * @author JavaSaBr
 */
public class CylinderCollisionShapeModelNode extends CollisionShapeModelNode<CylinderCollisionShape> {

    /**
     * Instantiates a new Cylinder collision shape model node.
     *
     * @param element  the element
     * @param objectId the object id
     */
    public CylinderCollisionShapeModelNode(@NotNull final CylinderCollisionShape element, final long objectId) {
        super(element, objectId);
    }

    @Nullable
    @Override
    public Image getIcon() {
        return Icons.CYLINDER_16;
    }

    @NotNull
    @Override
    public String getName() {
        return Messages.MODEL_FILE_EDITOR_NODE_CYLINDER_COLLISION_SHAPE;
    }
}
