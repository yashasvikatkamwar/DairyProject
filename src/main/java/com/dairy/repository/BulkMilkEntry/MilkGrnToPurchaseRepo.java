package com.dairy.repository.BulkMilkEntry;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.dairy.model.BulkMilkEntry.MilkGrnToPurchase;



@Repository
@EnableJpaRepositories
public interface MilkGrnToPurchaseRepo  extends JpaRepository<MilkGrnToPurchase, Integer>
{@Transactional
    int deleteByid(int id);
    
    List<MilkGrnToPurchase>findByDateBetween(String getfDate,String gettDate);
}