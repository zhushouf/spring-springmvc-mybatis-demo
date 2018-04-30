package ssm.mapper;

import org.springframework.stereotype.Repository;

import ssm.po.BoBarcoderule;
@Repository
public interface BoBarcoderuleMapper {
    int deleteByPrimaryKey(String id);

    int insert(BoBarcoderule record);

    int insertSelective(BoBarcoderule record);

    BoBarcoderule selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(BoBarcoderule record);

    int updateByPrimaryKey(BoBarcoderule record);
}