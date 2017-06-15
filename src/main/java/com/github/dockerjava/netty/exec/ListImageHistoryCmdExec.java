package com.github.dockerjava.netty.exec;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.type.TypeReference;
import com.github.dockerjava.api.command.ListImageHistoryCmd;
import com.github.dockerjava.api.command.LayerHistory;
import com.github.dockerjava.core.DockerClientConfig;
import com.github.dockerjava.netty.MediaType;
import com.github.dockerjava.netty.WebTarget;

public class ListImageHistoryCmdExec extends AbstrSyncDockerCmdExec<ListImageHistoryCmd, List<LayerHistory>> implements
    ListImageHistoryCmd.Exec {

    private static final Logger LOGGER = LoggerFactory.getLogger(ListImageHistoryCmdExec.class);

    public ListImageHistoryCmdExec(WebTarget baseResource, DockerClientConfig dockerClientConfig) {
        super(baseResource, dockerClientConfig);
    }

    @Override
    protected List<LayerHistory> execute(ListImageHistoryCmd command) {
        WebTarget webResource = getBaseResource().path("/images/{id}/history").resolveTemplate("id", command.getImageId());

        LOGGER.trace("GET: {}", webResource);

        return webResource.request().accept(MediaType.APPLICATION_JSON).get(new TypeReference<List<LayerHistory>>() { });
    }

}
