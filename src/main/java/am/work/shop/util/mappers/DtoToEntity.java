package am.work.shop.util.mappers;

import am.work.shop.entity.*;
import am.work.shop.entity.rf.UnitMeasurementEntity;
import am.work.shop.model.*;
import am.work.shop.model.rf.UnitMeasurement;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public abstract class DtoToEntity {

    public abstract BuyerEntity buyerEntity(Buyer buyer);

    public abstract List<BuyerEntity> buyerEntityList(List<Buyer> buyerList);

    public abstract SellerEntity sellerEntity(Seller seller);

    public abstract List<SellerEntity> sellerEntityList(List<Seller> sellerList);

    public abstract UnitMeasurementEntity unitMeasurementEntity(UnitMeasurement unitMeasurement);

    public abstract List<UnitMeasurementEntity> unitMeasurementEntityList(List<UnitMeasurement> unitMeasurementList);

    public abstract GoodEntity goodEntity(Good good);

    public abstract List<GoodEntity> goodEntityList(List<Good> goodList);

    public abstract ShopEntity shopEntity(Shop shop);

    public abstract StockEntity stockEntity(Stock stock);
}
