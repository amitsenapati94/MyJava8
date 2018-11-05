package com.company;
import java.util.*;

/**
 * Created by amitsenapati on 8/30/17.
 */
public enum SuitabilityRequestStatusType {

    OPEN("Open", "OPEN"),
    AWAITING_PAPERWORK("Awaiting Paperwork", "AWAITING PAPERWORK"),
    SUBMITTED("Submitted", "SUBMITTED");

    private final String serviceValue;
    private final String dbValue;

    SuitabilityRequestStatusType(String serviceValue, String dbValue)
    {
        this.serviceValue=serviceValue;
        this.dbValue=dbValue;
    }

    public String getServiceValue()
    {
        return this.serviceValue;
    }

    public String getDbValue()
    {
        return this.dbValue;
    }


    public static SuitabilityRequestStatusType fromServiceString(String value)
    {
        return STRING_TO_ENUM.get(value);
    }

    public static SuitabilityRequestStatusType fromDBString(String value)
    {
        return DBVALUE_TO_ENUM.get(value);
    }

    public static boolean isOpenOrAWP(SuitabilityRequestStatusType status)
    {
        if (OPEN_STATUS_SET.contains(status))
        {
            return true;
        }
        return false;
    }

    private static final Map<String, SuitabilityRequestStatusType> STRING_TO_ENUM = new HashMap<String, SuitabilityRequestStatusType>();
    private static final Map<String, SuitabilityRequestStatusType> DBVALUE_TO_ENUM = new HashMap<String, SuitabilityRequestStatusType>();
    private static final Set<SuitabilityRequestStatusType> OPEN_STATUS_SET = new HashSet<SuitabilityRequestStatusType>();

    static
    {
        for (SuitabilityRequestStatusType name : SuitabilityRequestStatusType.values())
        {
            STRING_TO_ENUM.put(name.getServiceValue(), name);
            DBVALUE_TO_ENUM.put(name.getDbValue(),name);
        }

        OPEN_STATUS_SET.add(SuitabilityRequestStatusType.OPEN);
        OPEN_STATUS_SET.add(SuitabilityRequestStatusType.AWAITING_PAPERWORK);
    }

}
