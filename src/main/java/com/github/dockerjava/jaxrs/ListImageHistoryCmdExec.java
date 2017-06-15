package com.github.dockerjava.jaxrs;

import java.util.List;

import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.github.dockerjava.api.command.ListImageHistoryCmd;
import com.github.dockerjava.api.command.LayerHistory;
import com.github.dockerjava.core.DockerClientConfig;

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
        return webResource.request().accept(MediaType.APPLICATION_JSON).get(new GenericType<List<LayerHistory>>() { });
    }

}
