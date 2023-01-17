package com.ismart.movieservice.repository;

import com.ismart.movieservice.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Integer>{

//    List<Review> findByMovieId(Integer id);

}
