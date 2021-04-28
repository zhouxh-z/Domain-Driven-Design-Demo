package com.zhouxh.ddd.car.domain.aggregate;

import com.zhouxh.ddd.car.domain.vo.AwardPoolVO;

import java.util.List;

/**
 * 抽奖聚合根
 * 作用：选择出一个奖池
 * @author zhouxh
 */
public class AggregateDemo {
    Integer id;
    List<AwardPoolVO> awardPools;

    /**
     * 根绝不同用户，不同城市选择奖池
     * @param city
     * @param userType
     * @return
     */
    public AwardPoolVO chooseAwardPool(Integer city,Integer userType){
        for (AwardPoolVO awardPool:awardPools) {
            if(awardPool.isMatch(city,userType)){
                return awardPool;
            }
        }
        return null;
    };
}
