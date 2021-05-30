<?xml version="1.0" encoding="UTF-8" ?>
<!--
    Document    :SalesData_stylesheet.xml
    Author      :vincent
    Description :
        Style sheet files that is used to transform the SalesData.xml document.
-->

<xsl:stylesheet  version="1.0"
                xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="html"/>
    <xsl:template match="/">
        <xsl:for-each select="CottonDesk/SalesPerson">
            <xsl:choose>
                <xsl:when test="Sales >30000">
                    <span style="color:blue;">
                        NAME:
                        <xsl:value-of select="Name"/>
                        AGE:
                        <xsl:value-of select="Age"/>
                        Your Commission is $5000.
                    </span>
                </xsl:when>

                <xsl:when test="Sales >20000">
                    <span style="color:green;">
                        NAME:
                        <xsl:value-of select="Name"/>
                        AGE:
                        <xsl:value-of select="Age"/>
                        Your Commission is $1000.
                    </span>
                </xsl:when>

                <xsl:when test="Sales >10000">
                    <span style="color:red;">
                        NAME:
                        <xsl:value-of select="Name"/>
                        AGE:
                        <xsl:value-of select="Age"/>
                        Your Commission is $500.
                    </span>
                </xsl:when>

                <xsl:when test="Sales >5000">
                    <span style="color:magenta;">
                        NAME:
                        <xsl:value-of select="Name"/>
                        AGE:
                        <xsl:value-of select="Age"/>
                        Your Commission is $100.
                    </span>
                </xsl:when>

                <xsl:otherwise>
                    <span style="color:black;">
                        NAME:
                        <xsl:value-of select="Name"/>
                        AGE:
                        <xsl:value-of select="Age"/>
                        Your Commission is $0.
                    </span>
                </xsl:otherwise>
            </xsl:choose>
        </xsl:for-each>
    </xsl:template>
</xsl:stylesheet>