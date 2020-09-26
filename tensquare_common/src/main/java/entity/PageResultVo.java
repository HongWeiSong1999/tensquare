package entity;

import java.util.List;

/**
 * ClassName:PageResultVo
 * Package:entity
 * Description:
 *
 * @ date:2020/9/26 14:49
 * @ author:hws
 */
public class PageResultVo<T> {

    private Long total;

    private List<T> rows;

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }

    public PageResultVo() {
    }

    public PageResultVo(Long total, List<T> rows) {
        this.total = total;
        this.rows = rows;
    }

    @Override
    public String toString() {
        return "PageResultVo{" +
                "total=" + total +
                ", rows=" + rows +
                '}';
    }
}
