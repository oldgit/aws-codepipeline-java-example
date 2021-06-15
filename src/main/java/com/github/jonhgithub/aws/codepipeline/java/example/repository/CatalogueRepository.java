package com.github.jonhgithub.aws.codepipeline.java.example.repository;

import com.github.jonhgithub.aws.codepipeline.java.example.model.CatalogueItem;
import org.springframework.data.repository.reactive.ReactiveSortingRepository;
import reactor.core.publisher.Mono;

public interface CatalogueRepository extends ReactiveSortingRepository<CatalogueItem, Long> {

    Mono<CatalogueItem> findBySku(String sku);
}
