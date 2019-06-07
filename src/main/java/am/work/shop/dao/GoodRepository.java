package am.work.shop.dao;

import am.work.shop.entity.GoodEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GoodRepository extends JpaRepository<GoodEntity, Integer> {
}