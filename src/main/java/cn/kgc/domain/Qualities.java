package cn.kgc.domain;

public class Qualities {
    private Integer id;
    private Integer score;
    private String qualityDesc;
    private Integer produtId;

    public Qualities() {
    }

    public Qualities(Integer id, Integer score, String qualityDesc, Integer produtId) {
        this.id = id;
        this.score = score;
        this.qualityDesc = qualityDesc;
        this.produtId = produtId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getQualityDesc() {
        return qualityDesc;
    }

    public void setQualityDesc(String qualityDesc) {
        this.qualityDesc = qualityDesc;
    }

    public Integer getProdutId() {
        return produtId;
    }

    public void setProdutId(Integer produtId) {
        this.produtId = produtId;
    }

    @Override
    public String toString() {
        return "Qualities{" + "id=" + id + ", score=" + score + ", qualityDesc='" + qualityDesc + '\'' + ", produtId=" + produtId + '}';
    }
}
