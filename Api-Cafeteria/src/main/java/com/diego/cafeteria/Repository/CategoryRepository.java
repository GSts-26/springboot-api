
package com.diego.cafeteria.Repository;

import com.diego.cafeteria.Models.Entities.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *Esta clase define la interfaz que se usara para comunicare con los metodos de la base de datos
 * @author Diego Rincon
 */
public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {

}
