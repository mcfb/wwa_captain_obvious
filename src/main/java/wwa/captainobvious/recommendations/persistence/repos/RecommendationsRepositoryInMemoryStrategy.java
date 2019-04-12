package wwa.captainobvious.recommendations.persistence.repos;

import org.springframework.stereotype.Component;
import wwa.captainobvious.recommendations.common.dtos.ItemDto;
import wwa.captainobvious.recommendations.common.dtos.RecommendationDto;

import java.util.List;

import static wwa.captainobvious.recommendations.persistence.mockdata.MockItems.givenItems;

@Component
public final class RecommendationsRepositoryInMemoryStrategy implements RecommendationsRepository {

    private final List<ItemDto> items = givenItems();

    @Override
    public RecommendationDto get() {
        RecommendationDto recommendationDto = new RecommendationDto();
        recommendationDto.items = items;
        return recommendationDto;
    }

    @Override
    public RecommendationDto get(final List<Integer> itemsIds) {
        RecommendationDto recommendationDto = new RecommendationDto();
        recommendationDto.items = items;
        return recommendationDto;
    }
}
