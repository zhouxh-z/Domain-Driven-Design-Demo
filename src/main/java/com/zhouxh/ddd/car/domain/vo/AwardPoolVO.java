package com.zhouxh.ddd.car.domain.vo;

import com.zhouxh.ddd.car.domain.entity.Award;
import java.util.List;

/**
 * 奖池
 * @author zhouxh
 */
public class AwardPoolVO {
    /**
     * 奖池适合的城市
     */
    private Integer city;
    /**
     * 奖池适合的用户类型
     */
    private Integer userType;
    /**
     * 奖品
     */
    private List<Award> awards;

    public AwardPoolVO() {
    }


    public Boolean isMatch(Integer city,Integer userType){
        return this.city.equals(city) || this.userType.equals(userType);
    }

    /**
     * 随机选择一个奖品发放
     * @return
     */
    public Award chooseAward(){
        // 伪代码
        Award award = new Award();
        return award;
    }


    @Override
    public String toString() {
        return "AwardPoolVO{" +
                "city=" + city +
                ", userType=" + userType +
                ", awards=" + awards +
                '}';
    }
}
