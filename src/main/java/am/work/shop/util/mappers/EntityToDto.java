package am.work.shop.util.mappers;

import am.work.shop.entity.*;
import am.work.shop.entity.rf.UnitMeasurementEntity;
import am.work.shop.model.*;
import am.work.shop.model.rf.UnitMeasurement;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public abstract class EntityToDto {

    public abstract Buyer buyer(BuyerEntity buyerEntity);

    public abstract List<Buyer> buyerList(List<BuyerEntity> buyerEntities);

    public abstract Seller seller(SellerEntity sellerEntity);

    public abstract List<Seller> sellerList(List<SellerEntity> sellerEntities);

    public abstract UnitMeasurement unitMeasurement(UnitMeasurementEntity unitMeasurementEntity);

    public abstract List<UnitMeasurement> unitMeasurementList(List<UnitMeasurementEntity> unitMeasurementEntities);

    public abstract Good good(GoodEntity goodEntity);

    public abstract List<Good> goodList(List<GoodEntity> goodEntities);

    public abstract Shop shop(ShopEntity shopEntity);

    public abstract Stock stock(StockEntity stockEntity);
}
