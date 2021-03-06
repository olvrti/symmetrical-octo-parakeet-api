package me.olvrti.api.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.olvrti.api.domain.Category;
import me.olvrti.api.repositories.CategoryRepository;
import me.olvrti.api.services.exceptions.ObjectNotFoundException;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;

	public Category findById(Integer id) {
		Optional<Category> obj = repository.findById(id);

		return obj.orElseThrow(() -> new ObjectNotFoundException("Object not found! " + id));
	}
}
