package com.iiht.ecommerce.commondataservice.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

import com.iiht.ecommerce.commondataservice.dto.FilterAttributesWithTotalItemsDTO;
import com.iiht.ecommerce.commondataservice.entity.sql.categories.SortByCategory;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class FilterAttributesResponse implements Serializable {

    private List<FilterAttributesWithTotalItemsDTO> brands;
    private List<FilterAttributesWithTotalItemsDTO> genders;
    private List<FilterAttributesWithTotalItemsDTO> apparels;
    private List<SortByCategory> sortby;
    private List<FilterAttributesWithTotalItemsDTO> prices;

    public FilterAttributesResponse(List<FilterAttributesWithTotalItemsDTO> brands, List<FilterAttributesWithTotalItemsDTO> genders,
                                    List<FilterAttributesWithTotalItemsDTO> apparels, List<FilterAttributesWithTotalItemsDTO> prices) {
        this.brands = brands;
        this.genders = genders;
        this.apparels = apparels;
        this.prices = prices;
    }
}
