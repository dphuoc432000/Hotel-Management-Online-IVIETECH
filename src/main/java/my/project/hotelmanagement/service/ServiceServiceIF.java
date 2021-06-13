package my.project.hotelmanagement.service;

import my.project.hotelmanagement.entity.ServiceEntity;
import my.project.hotelmanagement.repository.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceServiceIF implements ServiceService{
    @Autowired
    ServiceRepository serviceRepository;
    @Override
    public ServiceEntity saveService(ServiceEntity serviceEntity) {
        return serviceRepository.save(serviceEntity);
    }

    @Override
    public List<ServiceEntity> getAllService() {
        return (List<ServiceEntity>) serviceRepository.findAll();
    }

    @Override
    public ServiceEntity getServiceByID(int id) {
        Optional<ServiceEntity> opt = serviceRepository.findById(id);
        if(opt.isPresent())
            return opt.get();
        return null;
    }

    @Override
    public void updateService(ServiceEntity serviceEntity) {
        serviceRepository.save(serviceEntity);
    }

    @Override
    public void deleteService(ServiceEntity serviceEntity) {
        serviceRepository.delete(serviceEntity);
    }
}
