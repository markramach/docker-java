package com.github.dockerjava.core.command;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.List;

import com.github.dockerjava.api.command.ListImageHistoryCmd;
import com.github.dockerjava.api.command.LayerHistory;
import com.github.dockerjava.api.exception.NotFoundException;

/**
 * Inspect the details of an image.
 */
public class ListImageHistoryCmdImpl extends AbstrDockerCmd<ListImageHistoryCmd, List<LayerHistory>> implements
    ListImageHistoryCmd {

    private String imageId;

    public ListImageHistoryCmdImpl(ListImageHistoryCmd.Exec exec, String imageId) {
        super(exec);
        withImageId(imageId);
    }

    @Override
    public String getImageId() {
        return imageId;
    }

    @Override
    public ListImageHistoryCmd withImageId(String imageId) {
        checkNotNull(imageId, "imageId was not specified");
        this.imageId = imageId;
        return this;
    }

    /**
     * @throws NotFoundException
     *             No such image
     */
    @Override
    public List<LayerHistory> exec() throws NotFoundException {
        return super.exec();
    }
}
