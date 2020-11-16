package cn.mulanbay.pms.persistent.dto;

import java.math.BigInteger;

public class ReadingRecordDateStat implements DateStat {

    private Integer indexValue;
    private BigInteger totalCount;

    @Override
    public Integer getIndexValue() {
        return indexValue;
    }

    public void setIndexValue(Integer indexValue) {
        this.indexValue = indexValue;
    }

    public BigInteger getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(BigInteger totalCount) {
        this.totalCount = totalCount;
    }

}
