package com.ohgiraffers.demoelasticbeanstalk.menu.dto;

import com.ohgiraffers.demoelasticbeanstalk.menu.entity.Menu;
import lombok.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)

public class MenuDTO {

    private Long menuCode;
    private String menuName;
    private int menuPrice;
    private int categoryCode;
    private String orderableStatus;

    @Builder
    public MenuDTO(Long menuCode, String menuName, int menuPrice, int categoryCode, String orderableStatus) {
        this.menuCode = menuCode;
        this.menuName = menuName;
        this.menuPrice = menuPrice;
        this.categoryCode = categoryCode;
        this.orderableStatus = orderableStatus;
    }

    @Builder
    public MenuDTO(Menu menu) {
        this.menuCode = menu.getMenuCode();
        this.menuName = menu.getMenuName();
        this.menuPrice = menu.getMenuPrice();
        this.categoryCode = menu.getCategoryCode();
        this.orderableStatus = menu.getOrderableStatus();
    }
}
