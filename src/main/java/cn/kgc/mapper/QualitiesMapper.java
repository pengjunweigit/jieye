package cn.kgc.mapper;

import cn.kgc.domain.Qualities;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface QualitiesMapper {

    @Select("select * from qualities")
    List<Qualities> query();
}
