package my.project.hotelmanagement.service;

import my.project.hotelmanagement.entity.ServiceEntity;

import java.util.List;

public interface ServiceService {
    public ServiceEntity saveService(ServiceEntity serviceEntity);
    public List<ServiceEntity> getAllService();
    public ServiceEntity getServiceByID(int id);
    public void updateService(ServiceEntity serviceEntity);
    public void deleteService(ServiceEntity serviceEntity);
}
