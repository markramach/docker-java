package com.github.dockerjava.api.command;

import java.util.List;

import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;

import com.github.dockerjava.api.exception.NotFoundException;

/**
 * Inspect the details of an image.
 */
public interface ListImageHistoryCmd extends SyncDockerCmd<List<LayerHistory>> {

    @CheckForNull
    String getImageId();

    ListImageHistoryCmd withImageId(@Nonnull String imageId);

    /**
     * @throws NotFoundException
     *             No such image
     */
    @Override
    List<LayerHistory> exec() throws NotFoundException;

    interface Exec extends DockerCmdSyncExec<ListImageHistoryCmd, List<LayerHistory>> {
    }

}
