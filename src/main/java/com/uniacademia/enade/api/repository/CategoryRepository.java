package com.uniacademia.enade.api.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.uniacademia.enade.api.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

	@Transactional
	void deleteById(Long id);

	@Transactional(readOnly = true)
	List<Category> findAll();

	@Transactional(readOnly = true)
	Optional<Category> findById(Long id);

	@Transactional(readOnly = true)
	Page<Category> findAll(Pageable pageable);
}
