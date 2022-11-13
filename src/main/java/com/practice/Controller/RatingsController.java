package com.practice.Controller;

import com.practice.Resources.Ratings;
import com.practice.Resources.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/rating")
public class RatingsController {

        @RequestMapping("/{userId}")
        public UserRating getUserRatingList(@PathVariable("userId") String userId){

                List<Ratings> ratingList = Arrays.asList(
                        new Ratings("1",1,5),
                        new Ratings("1",2,4),
                        new Ratings("1",5,2),
                        new Ratings("2",1,5),
                        new Ratings("2",2,4),
                        new Ratings("2",3,3),
                        new Ratings("3",1,2),
                        new Ratings("3",3,5),
                        new Ratings("3",4,1)

                );
                UserRating userRating = new UserRating();
                userRating.setUserRatings(ratingList.stream().
                        filter(rating ->rating.getUserId().equalsIgnoreCase(userId)).collect(Collectors.toList()));
                return userRating;
        }

}
