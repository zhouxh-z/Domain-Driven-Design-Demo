package com.zhouxh.ddd.car.service;

import com.zhouxh.ddd.car.domain.aggregate.AggregateDemo;
import com.zhouxh.ddd.car.domain.entity.Award;
import com.zhouxh.ddd.car.domain.vo.AwardPoolVO;
import com.zhouxh.ddd.car.repo.AwardPoolRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * @author zhouxh
 */
@Service
public class AwardsService {

    @Autowired
    AwardPoolRepo awardPoolRepo;

    public Award getAward(Integer id,Integer city,Integer userType){
        // 获取聚合根
        AggregateDemo aggregate = awardPoolRepo.getAggregate(id);
        // 获取奖池
        AwardPoolVO awardPoolVO = aggregate.chooseAwardPool(city, userType);
        // 获取奖品
        Award award = awardPoolVO.chooseAward();
        return award;
    }
}
