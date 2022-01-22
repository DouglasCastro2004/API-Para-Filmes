package Projetovg.API.REST.repository;

import Projetovg.API.REST.controller.model.MoviesModel;
import org.springframework.data.repository.CrudRepository;

public interface MoviesRepository extends CrudRepository <MoviesModel, Integer> {

}
