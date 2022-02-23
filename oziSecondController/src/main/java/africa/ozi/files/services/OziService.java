package africa.ozi.files.services;

import africa.ozi.files.dtos.requests.OziRequest;
import africa.ozi.files.dtos.responses.OziResponse;

public interface OziServices {
    OziResponse createOzi (OziRequest oziRequest);
}
