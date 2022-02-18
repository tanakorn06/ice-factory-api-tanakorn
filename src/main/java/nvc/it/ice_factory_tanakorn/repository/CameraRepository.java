package nvc.it.ice_factory_tanakorn.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import nvc.it.ice_factory_tanakorn.model.Camera;

public interface CameraRepository extends MongoRepository<Camera,String> {
    
}
