package postgresql.jdbc;

class Delivery {
    private String deliveryId, deliveryBattingTeam, deliveryExtraRuns, deliveryBowler, deliveryTotalRuns;

    //--------------------------------Getter----------------------------------
    public String getDeliveryId() {
        return deliveryId;
    }
    public String getDeliveryBattingTeam() {
        return deliveryBattingTeam;
    }
    public String getDeliveryExtraRuns() {
        return deliveryExtraRuns;
    }
    public String getDeliveryBowler() {
        return deliveryBowler;
    }
    public String getDeliveryTotalRuns() {
        return deliveryTotalRuns;
    }
    //----------------------------------Setter------------------------------------
    public void setDeliveryId(String deliveryId) {
        this.deliveryId = deliveryId;
    }
    public void setDeliveryBattingTeam(String deliveryBattingTeam) {
        this.deliveryBattingTeam = deliveryBattingTeam;
    }
    public void setDeliveryBowler(String deliveryBowler) {
        this.deliveryBowler = deliveryBowler;
    }
    public void setDeliveryExtraRuns(String deliveryExtraRuns) {
        this.deliveryExtraRuns = deliveryExtraRuns;
    }
    public void setDeliveryTotalRuns(String deliveryTotalRuns) {
        this.deliveryTotalRuns = deliveryTotalRuns;
    }
}

