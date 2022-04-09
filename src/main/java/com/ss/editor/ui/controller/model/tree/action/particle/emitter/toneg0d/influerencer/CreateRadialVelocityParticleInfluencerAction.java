package com.ss.editor.ui.controller.model.tree.action.particle.emitter.toneg0d.influerencer;

import com.ss.editor.model.undo.editor.ModelChangeConsumer;
import com.ss.editor.ui.controller.tree.AbstractNodeTree;
import com.ss.editor.ui.controller.tree.node.ModelNode;

import org.jetbrains.annotations.NotNull;

import tonegod.emitter.Messages;
import tonegod.emitter.ParticleEmitterNode;
import tonegod.emitter.influencers.ParticleInfluencer;
import tonegod.emitter.influencers.impl.RadialVelocityInfluencer;

/**
 * The action to create a {@link RadialVelocityInfluencer} for a {@link ParticleEmitterNode}.
 *
 * @author JavaSaBr
 */
public class CreateRadialVelocityParticleInfluencerAction extends AbstractCreateParticleInfluencerAction {

    /**
     * Instantiates a new Create radial velocity particle influencer action.
     *
     * @param nodeTree the node tree
     * @param node     the node
     */
    public CreateRadialVelocityParticleInfluencerAction(@NotNull final AbstractNodeTree<ModelChangeConsumer> nodeTree, @NotNull final ModelNode<?> node) {
        super(nodeTree, node);
    }

    @NotNull
    @Override
    protected String getName() {
        return Messages.PARTICLE_INFLUENCER_RADIAL_VELOCITY;
    }

    @NotNull
    @Override
    protected ParticleInfluencer createInfluencer() {
        return new RadialVelocityInfluencer();
    }
}
