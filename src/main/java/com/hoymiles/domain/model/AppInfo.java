package com.hoymiles.domain.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Builder
public final class AppInfo {
    private LocalDateTime time;
    private String dtuSn;
    private DtuInfo dtuInfo;
    private List<SgsInfo> sgsInfo;
    private List<MeterInfo> meterInfo;
    

    @Getter
    @Setter
    @Builder
    public static final class DtuInfo {
        // 520 -> V00.02.08
        // 522 -> V00.02.10
        // 527 -> V00.02.15 (V00.02.0F)
        private int dtuSw;

        // 37122 -> H09.01.02
        // 37378 -> Fusio
        private int dtuHw;
    }

    @Getter
    @Setter
    @Builder
    public static final class SgsInfo {
        private String invSn;
        private int invSw;
        private int invHw;
        private int link;

        public boolean isConnected() {
            return link != 0;
        }
    }

    @Getter
    @Setter
    @Builder
    public static final class MeterInfo {
        
        private String meterSn;
        private int deviceKind;
        private int meterModel;
        private int meterCt;
        private int comWay;
        private int accessMode;
        private int swVsn;

    }
}



