/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.service;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author PC
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(models.service.ActorFacadeREST.class);
        resources.add(models.service.ActorPeliculaFacadeREST.class);
        resources.add(models.service.AdminFacadeREST.class);
        resources.add(models.service.AlquilerFacadeREST.class);
        resources.add(models.service.DirectorFacadeREST.class);
        resources.add(models.service.FormatoFacadeREST.class);
        resources.add(models.service.GeneroFacadeREST.class);
        resources.add(models.service.PeliculaFacadeREST.class);
        resources.add(models.service.SexoFacadeREST.class);
        resources.add(models.service.SocioFacadeREST.class);
    }
    
}
