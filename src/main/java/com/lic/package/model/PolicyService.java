package com.lic.package.model;

import javax.persistence.*;

// POLICY_SRV_MBR table
@Entity
@Table(name="POLICY_SRV_MBR")
public class PolicyService {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="MBR_ID")
    private long mbrId;

    @Column(name="MBR_NAME")
    private String mbrName;

    // POLICY_SRV_MBR_ADRS table
    @Entity
    @Table(name="POLICY_SRV_MBR_ADRS")
    public class PolicyServiceAddress {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name="MBR_ADRS_ID")
        private long mbrAdrsId;

        @Column(name="MBR_ADRS_LINE1")
        private String mbrAdrsLine1;

        // POLICY_SRV_MBR_BANK table
        @Entity
        @Table(name="POLICY_SRV_MBR_BANK")
        public class PolicyServiceBank {

            @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
            @Column(name="MBR_BANK_ID")
            private long mbrBankId;

            @Column(name="MBR_BANK_NAME")
            private String mbrBankName;

            // POLICY_SRV_MBR_NOMI table
            @Entity
            @Table(name="POLICY_SRV_MBR_NOMI")
            public class PolicyServiceNomi {

                @Id
                @GeneratedValue(strategy = GenerationType.IDENTITY)
                @Column(name="MBR_NOMI_ID")
                private long mbrNomiId;

                @Column(name="MBR_NOMI_NAME")
                private String mbrNomiName;
            }
        }
    }
}