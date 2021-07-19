package mktadmin.mktadminbe;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum MemberState {

    STUDENT (5000),
    WORKER (10000);

    private int membershipPrice;
}
