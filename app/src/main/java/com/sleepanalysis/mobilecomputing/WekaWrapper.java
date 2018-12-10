package com.sleepanalysis.mobilecomputing;

import weka.core.Attribute;
import weka.core.Capabilities;
import weka.core.Capabilities.Capability;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.RevisionUtils;
import weka.classifiers.Classifier;
import weka.classifiers.AbstractClassifier;

public class WekaWrapper
        extends AbstractClassifier {

    /**
     * Returns only the toString() method.
     *
     * @return a string describing the classifier
     */
    public String globalInfo() {
        return toString();
    }

    /**
     * Returns the capabilities of this classifier.
     *
     * @return the capabilities
     */
    public Capabilities getCapabilities() {
        weka.core.Capabilities result = new weka.core.Capabilities(this);

        result.enable(weka.core.Capabilities.Capability.NOMINAL_ATTRIBUTES);
        result.enable(weka.core.Capabilities.Capability.NUMERIC_ATTRIBUTES);
        result.enable(weka.core.Capabilities.Capability.DATE_ATTRIBUTES);
        result.enable(weka.core.Capabilities.Capability.MISSING_VALUES);
        result.enable(weka.core.Capabilities.Capability.NOMINAL_CLASS);
        result.enable(weka.core.Capabilities.Capability.MISSING_CLASS_VALUES);


        result.setMinimumNumberInstances(0);

        return result;
    }

    /**
     * only checks the data against its capabilities.
     *
     * @param i the training data
     */
    public void buildClassifier(Instances i) throws Exception {
        // can classifier handle the data?
        getCapabilities().testWithFail(i);
    }

    /**
     * Classifies the given instance.
     *
     * @param i the instance to classify
     * @return the classification result
     */
    public double classifyInstance(Instance i) throws Exception {
        Object[] s = new Object[i.numAttributes()];

        for (int j = 0; j < s.length; j++) {
            if (!i.isMissing(j)) {
                if (i.attribute(j).isNominal())
                    s[j] = new String(i.stringValue(j));
                else if (i.attribute(j).isNumeric())
                    s[j] = new Double(i.value(j));
            }
        }

        // set class value to missing
        s[i.classIndex()] = null;

        return WekaClassifier.classify(s);
    }

    /**
     * Returns the revision string.
     *
     * @return        the revision
     */
    public String getRevision() {
        return RevisionUtils.extract("1.0");
    }

    /**
     * Returns only the classnames and what classifier it is based on.
     *
     * @return a short description
     */
    public String toString() {
        return "Auto-generated classifier wrapper, based on weka.classifiers.trees.J48 (generated with Weka 3.8.3).\n" + this.getClass().getName() + "/WekaClassifier";
    }

    /**
     * Runs the classfier from commandline.
     *
     * @param args the commandline arguments
     */
    public static void main(String args[]) {
        runClassifier(new WekaWrapper(), args);
    }
}

class WekaClassifier {

    public static double classify(Object[] i)
            throws Exception {

        double p = Double.NaN;
        p = WekaClassifier.N663c8e1b0(i);
        return p;
    }
    static double N663c8e1b0(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= 1.3565158) {
            p = WekaClassifier.N74c92e1f1(i);
        } else if (((Double) i[3]).doubleValue() > 1.3565158) {
            p = WekaClassifier.N6730e407319(i);
        }
        return p;
    }
    static double N74c92e1f1(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= 0.010002389) {
            p = WekaClassifier.Nb86b6192(i);
        } else if (((Double) i[9]).doubleValue() > 0.010002389) {
            p = WekaClassifier.N2e9e198a218(i);
        }
        return p;
    }
    static double Nb86b6192(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() <= -3.7804043) {
            p = WekaClassifier.N4b4174a63(i);
        } else if (((Double) i[10]).doubleValue() > -3.7804043) {
            p = WekaClassifier.N53b1a33d17(i);
        }
        return p;
    }
    static double N4b4174a63(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= -4.505303) {
            p = WekaClassifier.N498f67834(i);
        } else if (((Double) i[9]).doubleValue() > -4.505303) {
            p = WekaClassifier.N140aed319(i);
        }
        return p;
    }
    static double N498f67834(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= 15.201656) {
            p = WekaClassifier.N748b117b5(i);
        } else if (((Double) i[2]).doubleValue() > 15.201656) {
            p = WekaClassifier.N382633878(i);
        }
        return p;
    }
    static double N748b117b5(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= -5.5416074) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() > -5.5416074) {
            p = WekaClassifier.N4a83578d6(i);
        }
        return p;
    }
    static double N4a83578d6(Object []i) {
        double p = Double.NaN;
        if (i[19] == null) {
            p = 0;
        } else if (((Double) i[19]).doubleValue() <= -5.344386) {
            p = WekaClassifier.Na27fe3f7(i);
        } else if (((Double) i[19]).doubleValue() > -5.344386) {
            p = 1;
        }
        return p;
    }
    static double Na27fe3f7(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= -7.465157) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() > -7.465157) {
            p = 0;
        }
        return p;
    }
    static double N382633878(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= -86.22752) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() > -86.22752) {
            p = 1;
        }
        return p;
    }
    static double N140aed319(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 3.4220476) {
            p = WekaClassifier.N4465ff0210(i);
        } else if (((Double) i[1]).doubleValue() > 3.4220476) {
            p = WekaClassifier.N5063f4c614(i);
        }
        return p;
    }
    static double N4465ff0210(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() <= 2.102657) {
            p = WekaClassifier.N718637b711(i);
        } else if (((Double) i[8]).doubleValue() > 2.102657) {
            p = WekaClassifier.N78b5980b12(i);
        }
        return p;
    }
    static double N718637b711(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= 59.67447) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() > 59.67447) {
            p = 1;
        }
        return p;
    }
    static double N78b5980b12(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= -9.034815) {
            p = WekaClassifier.N3b15914913(i);
        } else if (((Double) i[5]).doubleValue() > -9.034815) {
            p = 1;
        }
        return p;
    }
    static double N3b15914913(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= -14.195049) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() > -14.195049) {
            p = 0;
        }
        return p;
    }
    static double N5063f4c614(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() <= -9.323526) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() > -9.323526) {
            p = WekaClassifier.N10984af215(i);
        }
        return p;
    }
    static double N10984af215(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= 80.375145) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() > 80.375145) {
            p = WekaClassifier.N4439ed2a16(i);
        }
        return p;
    }
    static double N4439ed2a16(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() <= 3.3316193) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() > 3.3316193) {
            p = 1;
        }
        return p;
    }
    static double N53b1a33d17(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= 13.798263) {
            p = WekaClassifier.N1c3ba84918(i);
        } else if (((Double) i[0]).doubleValue() > 13.798263) {
            p = WekaClassifier.Nc399d98190(i);
        }
        return p;
    }
    static double N1c3ba84918(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 22.496597) {
            p = WekaClassifier.N4ea6bee619(i);
        } else if (((Double) i[1]).doubleValue() > 22.496597) {
            p = WekaClassifier.N34d6e74c177(i);
        }
        return p;
    }
    static double N4ea6bee619(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= -10.713168) {
            p = WekaClassifier.N457d5aa520(i);
        } else if (((Double) i[3]).doubleValue() > -10.713168) {
            p = WekaClassifier.N11cb385c29(i);
        }
        return p;
    }
    static double N457d5aa520(Object []i) {
        double p = Double.NaN;
        if (i[13] == null) {
            p = 1;
        } else if (((Double) i[13]).doubleValue() <= -8.623552) {
            p = WekaClassifier.N1b0ba17c21(i);
        } else if (((Double) i[13]).doubleValue() > -8.623552) {
            p = WekaClassifier.Ne1e316e24(i);
        }
        return p;
    }
    static double N1b0ba17c21(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 13.679774) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() > 13.679774) {
            p = WekaClassifier.N5ab33bb422(i);
        }
        return p;
    }
    static double N5ab33bb422(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 1;
        } else if (((Double) i[12]).doubleValue() <= 1.4300653) {
            p = WekaClassifier.N2199ff8a23(i);
        } else if (((Double) i[12]).doubleValue() > 1.4300653) {
            p = 0;
        }
        return p;
    }
    static double N2199ff8a23(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() <= 1.323362) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() > 1.323362) {
            p = 1;
        }
        return p;
    }
    static double Ne1e316e24(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() <= -5.8479095) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() > -5.8479095) {
            p = WekaClassifier.N4858619025(i);
        }
        return p;
    }
    static double N4858619025(Object []i) {
        double p = Double.NaN;
        if (i[17] == null) {
            p = 1;
        } else if (((Double) i[17]).doubleValue() <= -0.92223525) {
            p = 1;
        } else if (((Double) i[17]).doubleValue() > -0.92223525) {
            p = WekaClassifier.Nb758db426(i);
        }
        return p;
    }
    static double Nb758db426(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= -4.504081) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() > -4.504081) {
            p = WekaClassifier.N657e56ff27(i);
        }
        return p;
    }
    static double N657e56ff27(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 0;
        } else if (((Double) i[5]).doubleValue() <= -6.1709633) {
            p = WekaClassifier.N1a949e7f28(i);
        } else if (((Double) i[5]).doubleValue() > -6.1709633) {
            p = 1;
        }
        return p;
    }
    static double N1a949e7f28(Object []i) {
        double p = Double.NaN;
        if (i[19] == null) {
            p = 0;
        } else if (((Double) i[19]).doubleValue() <= -3.5008276) {
            p = 0;
        } else if (((Double) i[19]).doubleValue() > -3.5008276) {
            p = 1;
        }
        return p;
    }
    static double N11cb385c29(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= -20.196756) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() > -20.196756) {
            p = WekaClassifier.N36f41ffc30(i);
        }
        return p;
    }
    static double N36f41ffc30(Object []i) {
        double p = Double.NaN;
        if (i[18] == null) {
            p = 1;
        } else if (((Double) i[18]).doubleValue() <= 9.29638) {
            p = WekaClassifier.N212a6e7331(i);
        } else if (((Double) i[18]).doubleValue() > 9.29638) {
            p = 1;
        }
        return p;
    }
    static double N212a6e7331(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -160.4178) {
            p = WekaClassifier.N1f737b4f32(i);
        } else if (((Double) i[0]).doubleValue() > -160.4178) {
            p = WekaClassifier.N7cfe7a7150(i);
        }
        return p;
    }
    static double N1f737b4f32(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= 12.633382) {
            p = WekaClassifier.N57b2b92533(i);
        } else if (((Double) i[2]).doubleValue() > 12.633382) {
            p = WekaClassifier.N5f51cb1a47(i);
        }
        return p;
    }
    static double N57b2b92533(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= 0.4691877) {
            p = WekaClassifier.N41af47d034(i);
        } else if (((Double) i[3]).doubleValue() > 0.4691877) {
            p = WekaClassifier.Nfa3344(i);
        }
        return p;
    }
    static double N41af47d034(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() <= -2.9192722) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() > -2.9192722) {
            p = WekaClassifier.N3304e06035(i);
        }
        return p;
    }
    static double N3304e06035(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= 12.084229) {
            p = WekaClassifier.N37a95c4c36(i);
        } else if (((Double) i[2]).doubleValue() > 12.084229) {
            p = WekaClassifier.N5c9502d143(i);
        }
        return p;
    }
    static double N37a95c4c36(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -299.22726) {
            p = WekaClassifier.N7510a00d37(i);
        } else if (((Double) i[0]).doubleValue() > -299.22726) {
            p = WekaClassifier.N5a2916ef39(i);
        }
        return p;
    }
    static double N7510a00d37(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 1;
        } else if (((Double) i[14]).doubleValue() <= 3.4931479) {
            p = WekaClassifier.N4ebaf8b838(i);
        } else if (((Double) i[14]).doubleValue() > 3.4931479) {
            p = 1;
        }
        return p;
    }
    static double N4ebaf8b838(Object []i) {
        double p = Double.NaN;
        if (i[19] == null) {
            p = 0;
        } else if (((Double) i[19]).doubleValue() <= -1.6381586) {
            p = 0;
        } else if (((Double) i[19]).doubleValue() > -1.6381586) {
            p = 1;
        }
        return p;
    }
    static double N5a2916ef39(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= -0.94353217) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() > -0.94353217) {
            p = WekaClassifier.N279f7ada40(i);
        }
        return p;
    }
    static double N279f7ada40(Object []i) {
        double p = Double.NaN;
        if (i[19] == null) {
            p = 1;
        } else if (((Double) i[19]).doubleValue() <= -2.457546) {
            p = 1;
        } else if (((Double) i[19]).doubleValue() > -2.457546) {
            p = WekaClassifier.N577fa6ec41(i);
        }
        return p;
    }
    static double N577fa6ec41(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= -6.1682825) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() > -6.1682825) {
            p = WekaClassifier.N4e99fb8342(i);
        }
        return p;
    }
    static double N4e99fb8342(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 0;
        } else if (((Double) i[11]).doubleValue() <= -2.438487) {
            p = 0;
        } else if (((Double) i[11]).doubleValue() > -2.438487) {
            p = 1;
        }
        return p;
    }
    static double N5c9502d143(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= 5.604445) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() > 5.604445) {
            p = 1;
        }
        return p;
    }
    static double Nfa3344(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -172.00032) {
            p = WekaClassifier.N2a62741945(i);
        } else if (((Double) i[0]).doubleValue() > -172.00032) {
            p = WekaClassifier.N2ba6d73546(i);
        }
        return p;
    }
    static double N2a62741945(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= 3.6823485) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() > 3.6823485) {
            p = 1;
        }
        return p;
    }
    static double N2ba6d73546(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= 9.066581) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() > 9.066581) {
            p = 1;
        }
        return p;
    }
    static double N5f51cb1a47(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= -2.9297037) {
            p = WekaClassifier.N588763a148(i);
        } else if (((Double) i[3]).doubleValue() > -2.9297037) {
            p = 1;
        }
        return p;
    }
    static double N588763a148(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 1;
        } else if (((Double) i[6]).doubleValue() <= 5.8075533) {
            p = 1;
        } else if (((Double) i[6]).doubleValue() > 5.8075533) {
            p = WekaClassifier.N617c061449(i);
        }
        return p;
    }
    static double N617c061449(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= -178.18289) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() > -178.18289) {
            p = 1;
        }
        return p;
    }
    static double N7cfe7a7150(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -103.102264) {
            p = WekaClassifier.N2da667ef51(i);
        } else if (((Double) i[0]).doubleValue() > -103.102264) {
            p = WekaClassifier.N77ccc1b102(i);
        }
        return p;
    }
    static double N2da667ef51(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= -2.2405655) {
            p = WekaClassifier.N4edf939152(i);
        } else if (((Double) i[3]).doubleValue() > -2.2405655) {
            p = WekaClassifier.N5b19951564(i);
        }
        return p;
    }
    static double N4edf939152(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 5.377896) {
            p = WekaClassifier.N4f9260f853(i);
        } else if (((Double) i[1]).doubleValue() > 5.377896) {
            p = WekaClassifier.N6cc67b2356(i);
        }
        return p;
    }
    static double N4f9260f853(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= 3.3835866) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() > 3.3835866) {
            p = WekaClassifier.N4030a68954(i);
        }
        return p;
    }
    static double N4030a68954(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() <= 1.4700046) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() > 1.4700046) {
            p = WekaClassifier.N5eb7287f55(i);
        }
        return p;
    }
    static double N5eb7287f55(Object []i) {
        double p = Double.NaN;
        if (i[19] == null) {
            p = 1;
        } else if (((Double) i[19]).doubleValue() <= -3.4481502) {
            p = 1;
        } else if (((Double) i[19]).doubleValue() > -3.4481502) {
            p = 0;
        }
        return p;
    }
    static double N6cc67b2356(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= -2.9605439) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() > -2.9605439) {
            p = WekaClassifier.N300f43e357(i);
        }
        return p;
    }
    static double N300f43e357(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 15.950602) {
            p = WekaClassifier.N75ceaf8558(i);
        } else if (((Double) i[1]).doubleValue() > 15.950602) {
            p = 1;
        }
        return p;
    }
    static double N75ceaf8558(Object []i) {
        double p = Double.NaN;
        if (i[17] == null) {
            p = 1;
        } else if (((Double) i[17]).doubleValue() <= -5.059784) {
            p = 1;
        } else if (((Double) i[17]).doubleValue() > -5.059784) {
            p = WekaClassifier.N12dd959359(i);
        }
        return p;
    }
    static double N12dd959359(Object []i) {
        double p = Double.NaN;
        if (i[15] == null) {
            p = 1;
        } else if (((Double) i[15]).doubleValue() <= -5.155773) {
            p = 1;
        } else if (((Double) i[15]).doubleValue() > -5.155773) {
            p = WekaClassifier.N4d9deb8860(i);
        }
        return p;
    }
    static double N4d9deb8860(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() <= 4.1829286) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() > 4.1829286) {
            p = WekaClassifier.N7c7a98361(i);
        }
        return p;
    }
    static double N7c7a98361(Object []i) {
        double p = Double.NaN;
        if (i[19] == null) {
            p = 1;
        } else if (((Double) i[19]).doubleValue() <= -5.1877613) {
            p = 1;
        } else if (((Double) i[19]).doubleValue() > -5.1877613) {
            p = WekaClassifier.N7f59c7962(i);
        }
        return p;
    }
    static double N7f59c7962(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= 4.736974) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() > 4.736974) {
            p = WekaClassifier.N797af01963(i);
        }
        return p;
    }
    static double N797af01963(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 1;
        } else if (((Double) i[12]).doubleValue() <= 4.1545105) {
            p = 1;
        } else if (((Double) i[12]).doubleValue() > 4.1545105) {
            p = 0;
        }
        return p;
    }
    static double N5b19951564(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= 11.763911) {
            p = WekaClassifier.N61a8b44465(i);
        } else if (((Double) i[1]).doubleValue() > 11.763911) {
            p = 1;
        }
        return p;
    }
    static double N61a8b44465(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -115.43173) {
            p = WekaClassifier.N4a95ea5c66(i);
        } else if (((Double) i[0]).doubleValue() > -115.43173) {
            p = WekaClassifier.N7ef0479f88(i);
        }
        return p;
    }
    static double N4a95ea5c66(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= -8.582795) {
            p = WekaClassifier.N64c1312f67(i);
        } else if (((Double) i[1]).doubleValue() > -8.582795) {
            p = WekaClassifier.N57c9212369(i);
        }
        return p;
    }
    static double N64c1312f67(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= -145.23622) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() > -145.23622) {
            p = WekaClassifier.N7367b19f68(i);
        }
        return p;
    }
    static double N7367b19f68(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 0;
        } else if (((Double) i[7]).doubleValue() <= -2.2120845) {
            p = 0;
        } else if (((Double) i[7]).doubleValue() > -2.2120845) {
            p = 1;
        }
        return p;
    }
    static double N57c9212369(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= 17.78853) {
            p = WekaClassifier.N326bf68c70(i);
        } else if (((Double) i[2]).doubleValue() > 17.78853) {
            p = WekaClassifier.N7d89873687(i);
        }
        return p;
    }
    static double N326bf68c70(Object []i) {
        double p = Double.NaN;
        if (i[15] == null) {
            p = 1;
        } else if (((Double) i[15]).doubleValue() <= -2.1956036) {
            p = WekaClassifier.N5f4ee1a771(i);
        } else if (((Double) i[15]).doubleValue() > -2.1956036) {
            p = WekaClassifier.N572c879d79(i);
        }
        return p;
    }
    static double N5f4ee1a771(Object []i) {
        double p = Double.NaN;
        if (i[19] == null) {
            p = 1;
        } else if (((Double) i[19]).doubleValue() <= -3.40919) {
            p = 1;
        } else if (((Double) i[19]).doubleValue() > -3.40919) {
            p = WekaClassifier.N11eb589872(i);
        }
        return p;
    }
    static double N11eb589872(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 4.918758) {
            p = WekaClassifier.Nfb5b3bf73(i);
        } else if (((Double) i[1]).doubleValue() > 4.918758) {
            p = WekaClassifier.N2302b0f577(i);
        }
        return p;
    }
    static double Nfb5b3bf73(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= 11.247343) {
            p = WekaClassifier.N6287fb5374(i);
        } else if (((Double) i[2]).doubleValue() > 11.247343) {
            p = 1;
        }
        return p;
    }
    static double N6287fb5374(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= 0.1929728) {
            p = WekaClassifier.N4a6c7d7d75(i);
        } else if (((Double) i[3]).doubleValue() > 0.1929728) {
            p = WekaClassifier.N188c33076(i);
        }
        return p;
    }
    static double N4a6c7d7d75(Object []i) {
        double p = Double.NaN;
        if (i[13] == null) {
            p = 0;
        } else if (((Double) i[13]).doubleValue() <= -3.837187) {
            p = 0;
        } else if (((Double) i[13]).doubleValue() > -3.837187) {
            p = 1;
        }
        return p;
    }
    static double N188c33076(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 0;
        } else if (((Double) i[14]).doubleValue() <= 3.376493) {
            p = 0;
        } else if (((Double) i[14]).doubleValue() > 3.376493) {
            p = 1;
        }
        return p;
    }
    static double N2302b0f577(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= 13.304366) {
            p = WekaClassifier.N7e828aa578(i);
        } else if (((Double) i[2]).doubleValue() > 13.304366) {
            p = 0;
        }
        return p;
    }
    static double N7e828aa578(Object []i) {
        double p = Double.NaN;
        if (i[16] == null) {
            p = 0;
        } else if (((Double) i[16]).doubleValue() <= 3.326524) {
            p = 0;
        } else if (((Double) i[16]).doubleValue() > 3.326524) {
            p = 1;
        }
        return p;
    }
    static double N572c879d79(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 6.0940204) {
            p = WekaClassifier.N107a4f0b80(i);
        } else if (((Double) i[1]).doubleValue() > 6.0940204) {
            p = 0;
        }
        return p;
    }
    static double N107a4f0b80(Object []i) {
        double p = Double.NaN;
        if (i[13] == null) {
            p = 1;
        } else if (((Double) i[13]).doubleValue() <= -1.3048506) {
            p = WekaClassifier.N26c9d0e981(i);
        } else if (((Double) i[13]).doubleValue() > -1.3048506) {
            p = WekaClassifier.N7f57c75b83(i);
        }
        return p;
    }
    static double N26c9d0e981(Object []i) {
        double p = Double.NaN;
        if (i[15] == null) {
            p = 1;
        } else if (((Double) i[15]).doubleValue() <= 0.4543617) {
            p = WekaClassifier.N4cf4a13782(i);
        } else if (((Double) i[15]).doubleValue() > 0.4543617) {
            p = 0;
        }
        return p;
    }
    static double N4cf4a13782(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 0;
        } else if (((Double) i[14]).doubleValue() <= 0.07969237) {
            p = 0;
        } else if (((Double) i[14]).doubleValue() > 0.07969237) {
            p = 1;
        }
        return p;
    }
    static double N7f57c75b83(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= -5.2534137) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() > -5.2534137) {
            p = WekaClassifier.N3d97ddad84(i);
        }
        return p;
    }
    static double N3d97ddad84(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() <= 3.879912) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() > 3.879912) {
            p = WekaClassifier.N55b11c6e85(i);
        }
        return p;
    }
    static double N55b11c6e85(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= -0.1666341) {
            p = WekaClassifier.N3c25e2f686(i);
        } else if (((Double) i[3]).doubleValue() > -0.1666341) {
            p = 0;
        }
        return p;
    }
    static double N3c25e2f686(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 2.9995263) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() > 2.9995263) {
            p = 0;
        }
        return p;
    }
    static double N7d89873687(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 0;
        } else if (((Double) i[12]).doubleValue() <= 5.7169447) {
            p = 0;
        } else if (((Double) i[12]).doubleValue() > 5.7169447) {
            p = 1;
        }
        return p;
    }
    static double N7ef0479f88(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= -4.294397) {
            p = WekaClassifier.N23ff764389(i);
        } else if (((Double) i[1]).doubleValue() > -4.294397) {
            p = WekaClassifier.N1df839291(i);
        }
        return p;
    }
    static double N23ff764389(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 1;
        } else if (((Double) i[11]).doubleValue() <= -1.192166) {
            p = 1;
        } else if (((Double) i[11]).doubleValue() > -1.192166) {
            p = WekaClassifier.N305e129890(i);
        }
        return p;
    }
    static double N305e129890(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= 8.939213) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() > 8.939213) {
            p = 1;
        }
        return p;
    }
    static double N1df839291(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= 3.6261675) {
            p = WekaClassifier.N7defe08992(i);
        } else if (((Double) i[1]).doubleValue() > 3.6261675) {
            p = WekaClassifier.N629ab6db99(i);
        }
        return p;
    }
    static double N7defe08992(Object []i) {
        double p = Double.NaN;
        if (i[13] == null) {
            p = 0;
        } else if (((Double) i[13]).doubleValue() <= -4.0014005) {
            p = WekaClassifier.N257acc1993(i);
        } else if (((Double) i[13]).doubleValue() > -4.0014005) {
            p = WekaClassifier.N184e0cc395(i);
        }
        return p;
    }
    static double N257acc1993(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= -105.61857) {
            p = WekaClassifier.N65f0c0fc94(i);
        } else if (((Double) i[0]).doubleValue() > -105.61857) {
            p = 1;
        }
        return p;
    }
    static double N65f0c0fc94(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= -3.2383773) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() > -3.2383773) {
            p = 0;
        }
        return p;
    }
    static double N184e0cc395(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= -107.313484) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() > -107.313484) {
            p = WekaClassifier.N1aa75ceb96(i);
        }
        return p;
    }
    static double N1aa75ceb96(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= -2.2878597) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() > -2.2878597) {
            p = WekaClassifier.N69ce51a297(i);
        }
        return p;
    }
    static double N69ce51a297(Object []i) {
        double p = Double.NaN;
        if (i[16] == null) {
            p = 0;
        } else if (((Double) i[16]).doubleValue() <= 2.0495195) {
            p = WekaClassifier.Na5a9b4798(i);
        } else if (((Double) i[16]).doubleValue() > 2.0495195) {
            p = 0;
        }
        return p;
    }
    static double Na5a9b4798(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= -105.49821) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() > -105.49821) {
            p = 1;
        }
        return p;
    }
    static double N629ab6db99(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= -0.5621822) {
            p = WekaClassifier.N427afe67100(i);
        } else if (((Double) i[9]).doubleValue() > -0.5621822) {
            p = 0;
        }
        return p;
    }
    static double N427afe67100(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() <= 4.4022436) {
            p = WekaClassifier.N59a2e4cb101(i);
        } else if (((Double) i[6]).doubleValue() > 4.4022436) {
            p = 1;
        }
        return p;
    }
    static double N59a2e4cb101(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 1;
        } else if (((Double) i[8]).doubleValue() <= 4.795688) {
            p = 1;
        } else if (((Double) i[8]).doubleValue() > 4.795688) {
            p = 0;
        }
        return p;
    }
    static double N77ccc1b102(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() <= 2.3029833) {
            p = WekaClassifier.N30e78e41103(i);
        } else if (((Double) i[4]).doubleValue() > 2.3029833) {
            p = WekaClassifier.N3dc6835c134(i);
        }
        return p;
    }
    static double N30e78e41103(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= -8.846189) {
            p = WekaClassifier.N257bd7fc104(i);
        } else if (((Double) i[1]).doubleValue() > -8.846189) {
            p = WekaClassifier.N7dea1fd2108(i);
        }
        return p;
    }
    static double N257bd7fc104(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 1;
        } else if (((Double) i[6]).doubleValue() <= 11.260624) {
            p = WekaClassifier.N6bb1fb24105(i);
        } else if (((Double) i[6]).doubleValue() > 11.260624) {
            p = WekaClassifier.N655fcd3107(i);
        }
        return p;
    }
    static double N6bb1fb24105(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 1;
        } else if (((Double) i[8]).doubleValue() <= 5.7024803) {
            p = 1;
        } else if (((Double) i[8]).doubleValue() > 5.7024803) {
            p = WekaClassifier.Na4cee5d106(i);
        }
        return p;
    }
    static double Na4cee5d106(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 0;
        } else if (((Double) i[14]).doubleValue() <= 0.5449574) {
            p = 0;
        } else if (((Double) i[14]).doubleValue() > 0.5449574) {
            p = 1;
        }
        return p;
    }
    static double N655fcd3107(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= 0.50511223) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() > 0.50511223) {
            p = 0;
        }
        return p;
    }
    static double N7dea1fd2108(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= -4.744479) {
            p = WekaClassifier.N19e6b390109(i);
        } else if (((Double) i[0]).doubleValue() > -4.744479) {
            p = WekaClassifier.N7717b3c3128(i);
        }
        return p;
    }
    static double N19e6b390109(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 0;
        } else if (((Double) i[5]).doubleValue() <= 0.6028671) {
            p = WekaClassifier.N74b598f7110(i);
        } else if (((Double) i[5]).doubleValue() > 0.6028671) {
            p = WekaClassifier.N364eaa06127(i);
        }
        return p;
    }
    static double N74b598f7110(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= 1.2709672) {
            p = WekaClassifier.N5d2f51d6111(i);
        } else if (((Double) i[2]).doubleValue() > 1.2709672) {
            p = WekaClassifier.N65b53598116(i);
        }
        return p;
    }
    static double N5d2f51d6111(Object []i) {
        double p = Double.NaN;
        if (i[15] == null) {
            p = 1;
        } else if (((Double) i[15]).doubleValue() <= -7.3582807) {
            p = WekaClassifier.N7096d12e112(i);
        } else if (((Double) i[15]).doubleValue() > -7.3582807) {
            p = WekaClassifier.N5c40969f113(i);
        }
        return p;
    }
    static double N7096d12e112(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() <= 4.1396136) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() > 4.1396136) {
            p = 1;
        }
        return p;
    }
    static double N5c40969f113(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 0;
        } else if (((Double) i[11]).doubleValue() <= -5.768171) {
            p = WekaClassifier.N46adfc0114(i);
        } else if (((Double) i[11]).doubleValue() > -5.768171) {
            p = 0;
        }
        return p;
    }
    static double N46adfc0114(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -48.68341) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > -48.68341) {
            p = WekaClassifier.N236c8f7a115(i);
        }
        return p;
    }
    static double N236c8f7a115(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= -20.707317) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() > -20.707317) {
            p = 1;
        }
        return p;
    }
    static double N65b53598116(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 0;
        } else if (((Double) i[11]).doubleValue() <= -9.227936) {
            p = WekaClassifier.N3d99b3df117(i);
        } else if (((Double) i[11]).doubleValue() > -9.227936) {
            p = WekaClassifier.N6fdfff73118(i);
        }
        return p;
    }
    static double N3d99b3df117(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= 10.806476) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() > 10.806476) {
            p = 0;
        }
        return p;
    }
    static double N6fdfff73118(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 1;
        } else if (((Double) i[6]).doubleValue() <= 12.127621) {
            p = WekaClassifier.N288faaad119(i);
        } else if (((Double) i[6]).doubleValue() > 12.127621) {
            p = 0;
        }
        return p;
    }
    static double N288faaad119(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 1;
        } else if (((Double) i[14]).doubleValue() <= 1.4947928) {
            p = 1;
        } else if (((Double) i[14]).doubleValue() > 1.4947928) {
            p = WekaClassifier.N64da53d1120(i);
        }
        return p;
    }
    static double N64da53d1120(Object []i) {
        double p = Double.NaN;
        if (i[15] == null) {
            p = 0;
        } else if (((Double) i[15]).doubleValue() <= -4.3154144) {
            p = WekaClassifier.N142d03de121(i);
        } else if (((Double) i[15]).doubleValue() > -4.3154144) {
            p = WekaClassifier.N6764df8b124(i);
        }
        return p;
    }
    static double N142d03de121(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() <= 5.59591) {
            p = WekaClassifier.N419424f122(i);
        } else if (((Double) i[10]).doubleValue() > 5.59591) {
            p = 1;
        }
        return p;
    }
    static double N419424f122(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= 4.439615) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() > 4.439615) {
            p = WekaClassifier.N51165aa3123(i);
        }
        return p;
    }
    static double N51165aa3123(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 1;
        } else if (((Double) i[6]).doubleValue() <= 1.8164514) {
            p = 1;
        } else if (((Double) i[6]).doubleValue() > 1.8164514) {
            p = 0;
        }
        return p;
    }
    static double N6764df8b124(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= -1.8931308) {
            p = WekaClassifier.N1b2b034a125(i);
        } else if (((Double) i[4]).doubleValue() > -1.8931308) {
            p = 1;
        }
        return p;
    }
    static double N1b2b034a125(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 1;
        } else if (((Double) i[14]).doubleValue() <= 2.6587336) {
            p = 1;
        } else if (((Double) i[14]).doubleValue() > 2.6587336) {
            p = WekaClassifier.N55ee215a126(i);
        }
        return p;
    }
    static double N55ee215a126(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 0;
        } else if (((Double) i[9]).doubleValue() <= -1.4590116) {
            p = 0;
        } else if (((Double) i[9]).doubleValue() > -1.4590116) {
            p = 1;
        }
        return p;
    }
    static double N364eaa06127(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= -1.1977485) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() > -1.1977485) {
            p = 0;
        }
        return p;
    }
    static double N7717b3c3128(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 0;
        } else if (((Double) i[14]).doubleValue() <= -0.45973727) {
            p = WekaClassifier.N34e5cf38129(i);
        } else if (((Double) i[14]).doubleValue() > -0.45973727) {
            p = WekaClassifier.N1025dc0f130(i);
        }
        return p;
    }
    static double N34e5cf38129(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= -0.8000385) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() > -0.8000385) {
            p = 1;
        }
        return p;
    }
    static double N1025dc0f130(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 6.6013217) {
            p = WekaClassifier.N53785a97131(i);
        } else if (((Double) i[1]).doubleValue() > 6.6013217) {
            p = 1;
        }
        return p;
    }
    static double N53785a97131(Object []i) {
        double p = Double.NaN;
        if (i[13] == null) {
            p = 0;
        } else if (((Double) i[13]).doubleValue() <= -8.685846) {
            p = 0;
        } else if (((Double) i[13]).doubleValue() > -8.685846) {
            p = WekaClassifier.N19bb7290132(i);
        }
        return p;
    }
    static double N19bb7290132(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= -1.3366897) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() > -1.3366897) {
            p = WekaClassifier.N33de290133(i);
        }
        return p;
    }
    static double N33de290133(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -1.5525489) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > -1.5525489) {
            p = 0;
        }
        return p;
    }
    static double N3dc6835c134(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 0;
        } else if (((Double) i[7]).doubleValue() <= -6.9314556) {
            p = WekaClassifier.N2cfbca91135(i);
        } else if (((Double) i[7]).doubleValue() > -6.9314556) {
            p = WekaClassifier.N30a4540142(i);
        }
        return p;
    }
    static double N2cfbca91135(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 0;
        } else if (((Double) i[5]).doubleValue() <= 3.5425296) {
            p = WekaClassifier.N6e16026c136(i);
        } else if (((Double) i[5]).doubleValue() > 3.5425296) {
            p = 1;
        }
        return p;
    }
    static double N6e16026c136(Object []i) {
        double p = Double.NaN;
        if (i[13] == null) {
            p = 0;
        } else if (((Double) i[13]).doubleValue() <= -0.94274575) {
            p = WekaClassifier.N2d3445c137(i);
        } else if (((Double) i[13]).doubleValue() > -0.94274575) {
            p = 1;
        }
        return p;
    }
    static double N2d3445c137(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= -5.155136) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() > -5.155136) {
            p = WekaClassifier.Nb06eb39138(i);
        }
        return p;
    }
    static double Nb06eb39138(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() <= -3.6244466) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() > -3.6244466) {
            p = WekaClassifier.N79db178a139(i);
        }
        return p;
    }
    static double N79db178a139(Object []i) {
        double p = Double.NaN;
        if (i[15] == null) {
            p = 1;
        } else if (((Double) i[15]).doubleValue() <= -0.5165686) {
            p = WekaClassifier.N27006fbf140(i);
        } else if (((Double) i[15]).doubleValue() > -0.5165686) {
            p = 0;
        }
        return p;
    }
    static double N27006fbf140(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 11.837443) {
            p = WekaClassifier.N3fe93ea7141(i);
        } else if (((Double) i[1]).doubleValue() > 11.837443) {
            p = 1;
        }
        return p;
    }
    static double N3fe93ea7141(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 0;
        } else if (((Double) i[5]).doubleValue() <= 0.65068454) {
            p = 0;
        } else if (((Double) i[5]).doubleValue() > 0.65068454) {
            p = 1;
        }
        return p;
    }
    static double N30a4540142(Object []i) {
        double p = Double.NaN;
        if (i[13] == null) {
            p = 1;
        } else if (((Double) i[13]).doubleValue() <= -8.656754) {
            p = WekaClassifier.N224c75ec143(i);
        } else if (((Double) i[13]).doubleValue() > -8.656754) {
            p = WekaClassifier.N218efae4146(i);
        }
        return p;
    }
    static double N224c75ec143(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 0;
        } else if (((Double) i[11]).doubleValue() <= 1.0677007) {
            p = WekaClassifier.N6158b8d144(i);
        } else if (((Double) i[11]).doubleValue() > 1.0677007) {
            p = 1;
        }
        return p;
    }
    static double N6158b8d144(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 1;
        } else if (((Double) i[11]).doubleValue() <= -6.3499002) {
            p = 1;
        } else if (((Double) i[11]).doubleValue() > -6.3499002) {
            p = WekaClassifier.N707f81ee145(i);
        }
        return p;
    }
    static double N707f81ee145(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= 15.525731) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() > 15.525731) {
            p = 1;
        }
        return p;
    }
    static double N218efae4146(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 1;
        } else if (((Double) i[11]).doubleValue() <= 2.326392) {
            p = WekaClassifier.N60ac082c147(i);
        } else if (((Double) i[11]).doubleValue() > 2.326392) {
            p = WekaClassifier.N56678fec176(i);
        }
        return p;
    }
    static double N60ac082c147(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= -4.068299) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() > -4.068299) {
            p = WekaClassifier.N4acfbe57148(i);
        }
        return p;
    }
    static double N4acfbe57148(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() <= 4.8762083) {
            p = WekaClassifier.N46b32611149(i);
        } else if (((Double) i[4]).doubleValue() > 4.8762083) {
            p = WekaClassifier.N682cb9b3168(i);
        }
        return p;
    }
    static double N46b32611149(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() <= 1.8814827) {
            p = WekaClassifier.N10bcbdf9150(i);
        } else if (((Double) i[10]).doubleValue() > 1.8814827) {
            p = WekaClassifier.N2a147c77157(i);
        }
        return p;
    }
    static double N10bcbdf9150(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= 0.31078413) {
            p = WekaClassifier.N10d12aaa151(i);
        } else if (((Double) i[1]).doubleValue() > 0.31078413) {
            p = WekaClassifier.N14bcfc4d155(i);
        }
        return p;
    }
    static double N10d12aaa151(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= 10.271096) {
            p = WekaClassifier.N275b13e1152(i);
        } else if (((Double) i[2]).doubleValue() > 10.271096) {
            p = 0;
        }
        return p;
    }
    static double N275b13e1152(Object []i) {
        double p = Double.NaN;
        if (i[13] == null) {
            p = 0;
        } else if (((Double) i[13]).doubleValue() <= -2.395622) {
            p = WekaClassifier.N78872ab5153(i);
        } else if (((Double) i[13]).doubleValue() > -2.395622) {
            p = 1;
        }
        return p;
    }
    static double N78872ab5153(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() <= -1.2206329) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() > -1.2206329) {
            p = WekaClassifier.Nda11329154(i);
        }
        return p;
    }
    static double Nda11329154(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= 8.518981) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() > 8.518981) {
            p = 0;
        }
        return p;
    }
    static double N14bcfc4d155(Object []i) {
        double p = Double.NaN;
        if (i[13] == null) {
            p = 1;
        } else if (((Double) i[13]).doubleValue() <= -0.018732408) {
            p = WekaClassifier.N6b072120156(i);
        } else if (((Double) i[13]).doubleValue() > -0.018732408) {
            p = 0;
        }
        return p;
    }
    static double N6b072120156(Object []i) {
        double p = Double.NaN;
        if (i[18] == null) {
            p = 1;
        } else if (((Double) i[18]).doubleValue() <= 4.7428727) {
            p = 1;
        } else if (((Double) i[18]).doubleValue() > 4.7428727) {
            p = 0;
        }
        return p;
    }
    static double N2a147c77157(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= -8.759108) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() > -8.759108) {
            p = WekaClassifier.N2fa90a47158(i);
        }
        return p;
    }
    static double N2fa90a47158(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= -2.947257) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() > -2.947257) {
            p = WekaClassifier.N5c04c56b159(i);
        }
        return p;
    }
    static double N5c04c56b159(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= -4.145752) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() > -4.145752) {
            p = WekaClassifier.Ne58f1ea160(i);
        }
        return p;
    }
    static double Ne58f1ea160(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= 0.8617254) {
            p = WekaClassifier.N7a6d392161(i);
        } else if (((Double) i[2]).doubleValue() > 0.8617254) {
            p = WekaClassifier.N603a0a13162(i);
        }
        return p;
    }
    static double N7a6d392161(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= 7.4936714) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() > 7.4936714) {
            p = 1;
        }
        return p;
    }
    static double N603a0a13162(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= 1.754761) {
            p = WekaClassifier.N1aefa4e2163(i);
        } else if (((Double) i[5]).doubleValue() > 1.754761) {
            p = 0;
        }
        return p;
    }
    static double N1aefa4e2163(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= 8.231518) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() > 8.231518) {
            p = WekaClassifier.N5371d1f4164(i);
        }
        return p;
    }
    static double N5371d1f4164(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -21.618477) {
            p = WekaClassifier.N62faa24b165(i);
        } else if (((Double) i[0]).doubleValue() > -21.618477) {
            p = 0;
        }
        return p;
    }
    static double N62faa24b165(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= -98.45422) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() > -98.45422) {
            p = WekaClassifier.N52a04695166(i);
        }
        return p;
    }
    static double N52a04695166(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 1;
        } else if (((Double) i[12]).doubleValue() <= 4.7521043) {
            p = 1;
        } else if (((Double) i[12]).doubleValue() > 4.7521043) {
            p = WekaClassifier.N350f2097167(i);
        }
        return p;
    }
    static double N350f2097167(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= 10.6963625) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() > 10.6963625) {
            p = 1;
        }
        return p;
    }
    static double N682cb9b3168(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -95.32976) {
            p = WekaClassifier.N5ff3a607169(i);
        } else if (((Double) i[0]).doubleValue() > -95.32976) {
            p = WekaClassifier.N4370557b171(i);
        }
        return p;
    }
    static double N5ff3a607169(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= 4.402951) {
            p = WekaClassifier.Nfb7d782170(i);
        } else if (((Double) i[1]).doubleValue() > 4.402951) {
            p = 1;
        }
        return p;
    }
    static double Nfb7d782170(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 1;
        } else if (((Double) i[6]).doubleValue() <= 4.872541) {
            p = 1;
        } else if (((Double) i[6]).doubleValue() > 4.872541) {
            p = 0;
        }
        return p;
    }
    static double N4370557b171(Object []i) {
        double p = Double.NaN;
        if (i[19] == null) {
            p = 1;
        } else if (((Double) i[19]).doubleValue() <= -4.126186) {
            p = WekaClassifier.N4e9c9d87172(i);
        } else if (((Double) i[19]).doubleValue() > -4.126186) {
            p = 1;
        }
        return p;
    }
    static double N4e9c9d87172(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 1;
        } else if (((Double) i[8]).doubleValue() <= 1.3366386) {
            p = WekaClassifier.Nc9dc9cd173(i);
        } else if (((Double) i[8]).doubleValue() > 1.3366386) {
            p = 1;
        }
        return p;
    }
    static double Nc9dc9cd173(Object []i) {
        double p = Double.NaN;
        if (i[13] == null) {
            p = 0;
        } else if (((Double) i[13]).doubleValue() <= -4.3834143) {
            p = 0;
        } else if (((Double) i[13]).doubleValue() > -4.3834143) {
            p = WekaClassifier.N3da7141b174(i);
        }
        return p;
    }
    static double N3da7141b174(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() <= -0.9337893) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() > -0.9337893) {
            p = WekaClassifier.N7cbd5559175(i);
        }
        return p;
    }
    static double N7cbd5559175(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= -12.472255) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() > -12.472255) {
            p = 1;
        }
        return p;
    }
    static double N56678fec176(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() <= 0.81834626) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() > 0.81834626) {
            p = 0;
        }
        return p;
    }
    static double N34d6e74c177(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 1;
        } else if (((Double) i[11]).doubleValue() <= 1.6844671) {
            p = WekaClassifier.N31543a01178(i);
        } else if (((Double) i[11]).doubleValue() > 1.6844671) {
            p = WekaClassifier.N63a8602a187(i);
        }
        return p;
    }
    static double N31543a01178(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -43.69729) {
            p = WekaClassifier.N27d5b6ef179(i);
        } else if (((Double) i[0]).doubleValue() > -43.69729) {
            p = 1;
        }
        return p;
    }
    static double N27d5b6ef179(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= -1.2617041) {
            p = WekaClassifier.N4d275516180(i);
        } else if (((Double) i[9]).doubleValue() > -1.2617041) {
            p = WekaClassifier.N2c30d7e3185(i);
        }
        return p;
    }
    static double N4d275516180(Object []i) {
        double p = Double.NaN;
        if (i[17] == null) {
            p = 1;
        } else if (((Double) i[17]).doubleValue() <= -2.8914232) {
            p = 1;
        } else if (((Double) i[17]).doubleValue() > -2.8914232) {
            p = WekaClassifier.N4ec83779181(i);
        }
        return p;
    }
    static double N4ec83779181(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() <= 0.7336123) {
            p = WekaClassifier.N5edc8893182(i);
        } else if (((Double) i[10]).doubleValue() > 0.7336123) {
            p = WekaClassifier.N54b43f69183(i);
        }
        return p;
    }
    static double N5edc8893182(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 1;
        } else if (((Double) i[8]).doubleValue() <= 1.9079807) {
            p = 1;
        } else if (((Double) i[8]).doubleValue() > 1.9079807) {
            p = 0;
        }
        return p;
    }
    static double N54b43f69183(Object []i) {
        double p = Double.NaN;
        if (i[17] == null) {
            p = 1;
        } else if (((Double) i[17]).doubleValue() <= 1.9447441) {
            p = 1;
        } else if (((Double) i[17]).doubleValue() > 1.9447441) {
            p = WekaClassifier.N234c4f0c184(i);
        }
        return p;
    }
    static double N234c4f0c184(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= 9.492049) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() > 9.492049) {
            p = 1;
        }
        return p;
    }
    static double N2c30d7e3185(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= -137.16072) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() > -137.16072) {
            p = WekaClassifier.N16924ae6186(i);
        }
        return p;
    }
    static double N16924ae6186(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() <= -16.334852) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() > -16.334852) {
            p = 1;
        }
        return p;
    }
    static double N63a8602a187(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() <= 3.0201762) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() > 3.0201762) {
            p = WekaClassifier.N225d677c188(i);
        }
        return p;
    }
    static double N225d677c188(Object []i) {
        double p = Double.NaN;
        if (i[19] == null) {
            p = 1;
        } else if (((Double) i[19]).doubleValue() <= -6.865714) {
            p = WekaClassifier.N8f8231b189(i);
        } else if (((Double) i[19]).doubleValue() > -6.865714) {
            p = 1;
        }
        return p;
    }
    static double N8f8231b189(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -25.646639) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > -25.646639) {
            p = 0;
        }
        return p;
    }
    static double Nc399d98190(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() <= -1.40352) {
            p = WekaClassifier.N2c300505191(i);
        } else if (((Double) i[10]).doubleValue() > -1.40352) {
            p = WekaClassifier.N537cb1c7203(i);
        }
        return p;
    }
    static double N2c300505191(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= -3.8350658) {
            p = WekaClassifier.N659ff178192(i);
        } else if (((Double) i[9]).doubleValue() > -3.8350658) {
            p = WekaClassifier.N4cf96bcc199(i);
        }
        return p;
    }
    static double N659ff178192(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= -6.631703) {
            p = WekaClassifier.N2cb6e62b193(i);
        } else if (((Double) i[5]).doubleValue() > -6.631703) {
            p = 1;
        }
        return p;
    }
    static double N2cb6e62b193(Object []i) {
        double p = Double.NaN;
        if (i[19] == null) {
            p = 1;
        } else if (((Double) i[19]).doubleValue() <= 0.5050779) {
            p = WekaClassifier.N6ca37b78194(i);
        } else if (((Double) i[19]).doubleValue() > 0.5050779) {
            p = WekaClassifier.N368a97ba198(i);
        }
        return p;
    }
    static double N6ca37b78194(Object []i) {
        double p = Double.NaN;
        if (i[17] == null) {
            p = 1;
        } else if (((Double) i[17]).doubleValue() <= -2.5773761) {
            p = 1;
        } else if (((Double) i[17]).doubleValue() > -2.5773761) {
            p = WekaClassifier.N409743c4195(i);
        }
        return p;
    }
    static double N409743c4195(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() <= -1.7498729) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() > -1.7498729) {
            p = WekaClassifier.N5a196e9f196(i);
        }
        return p;
    }
    static double N5a196e9f196(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= -8.275616) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() > -8.275616) {
            p = WekaClassifier.N41854c49197(i);
        }
        return p;
    }
    static double N41854c49197(Object []i) {
        double p = Double.NaN;
        if (i[19] == null) {
            p = 0;
        } else if (((Double) i[19]).doubleValue() <= -4.0950894) {
            p = 0;
        } else if (((Double) i[19]).doubleValue() > -4.0950894) {
            p = 1;
        }
        return p;
    }
    static double N368a97ba198(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= -2.0476158) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() > -2.0476158) {
            p = 0;
        }
        return p;
    }
    static double N4cf96bcc199(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= -2.9533672) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() > -2.9533672) {
            p = WekaClassifier.N5d85995a200(i);
        }
        return p;
    }
    static double N5d85995a200(Object []i) {
        double p = Double.NaN;
        if (i[16] == null) {
            p = 1;
        } else if (((Double) i[16]).doubleValue() <= 2.5026617) {
            p = 1;
        } else if (((Double) i[16]).doubleValue() > 2.5026617) {
            p = WekaClassifier.N368971a7201(i);
        }
        return p;
    }
    static double N368971a7201(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= 88.8778) {
            p = WekaClassifier.N545c178b202(i);
        } else if (((Double) i[0]).doubleValue() > 88.8778) {
            p = 1;
        }
        return p;
    }
    static double N545c178b202(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= -11.569673) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() > -11.569673) {
            p = 0;
        }
        return p;
    }
    static double N537cb1c7203(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 1;
        } else if (((Double) i[14]).doubleValue() <= -2.1302714) {
            p = WekaClassifier.N2242adbb204(i);
        } else if (((Double) i[14]).doubleValue() > -2.1302714) {
            p = WekaClassifier.N6ab37776208(i);
        }
        return p;
    }
    static double N2242adbb204(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() <= -5.6002226) {
            p = WekaClassifier.N5fbbf41d205(i);
        } else if (((Double) i[4]).doubleValue() > -5.6002226) {
            p = WekaClassifier.N6bef502e206(i);
        }
        return p;
    }
    static double N5fbbf41d205(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() <= -2.1865642) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() > -2.1865642) {
            p = 1;
        }
        return p;
    }
    static double N6bef502e206(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() <= -1.3495358) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() > -1.3495358) {
            p = WekaClassifier.N5d2b361d207(i);
        }
        return p;
    }
    static double N5d2b361d207(Object []i) {
        double p = Double.NaN;
        if (i[15] == null) {
            p = 1;
        } else if (((Double) i[15]).doubleValue() <= -2.6111968) {
            p = 1;
        } else if (((Double) i[15]).doubleValue() > -2.6111968) {
            p = 0;
        }
        return p;
    }
    static double N6ab37776208(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= 67.96174) {
            p = WekaClassifier.N6a287d21209(i);
        } else if (((Double) i[0]).doubleValue() > 67.96174) {
            p = 1;
        }
        return p;
    }
    static double N6a287d21209(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= -1.6141133) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() > -1.6141133) {
            p = WekaClassifier.N7bd72e6a210(i);
        }
        return p;
    }
    static double N7bd72e6a210(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 1;
        } else if (((Double) i[6]).doubleValue() <= -3.3938935) {
            p = WekaClassifier.N7fc864d3211(i);
        } else if (((Double) i[6]).doubleValue() > -3.3938935) {
            p = WekaClassifier.Ne31b49b212(i);
        }
        return p;
    }
    static double N7fc864d3211(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= 3.7367253) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() > 3.7367253) {
            p = 0;
        }
        return p;
    }
    static double Ne31b49b212(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() <= 1.267943) {
            p = WekaClassifier.N27590109213(i);
        } else if (((Double) i[10]).doubleValue() > 1.267943) {
            p = WekaClassifier.N5a7b33a4216(i);
        }
        return p;
    }
    static double N27590109213(Object []i) {
        double p = Double.NaN;
        if (i[16] == null) {
            p = 1;
        } else if (((Double) i[16]).doubleValue() <= 4.601392) {
            p = 1;
        } else if (((Double) i[16]).doubleValue() > 4.601392) {
            p = WekaClassifier.N653fcff6214(i);
        }
        return p;
    }
    static double N653fcff6214(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 0;
        } else if (((Double) i[14]).doubleValue() <= 3.4626307) {
            p = 0;
        } else if (((Double) i[14]).doubleValue() > 3.4626307) {
            p = WekaClassifier.N596dd17e215(i);
        }
        return p;
    }
    static double N596dd17e215(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 0;
        } else if (((Double) i[12]).doubleValue() <= 4.698294) {
            p = 0;
        } else if (((Double) i[12]).doubleValue() > 4.698294) {
            p = 1;
        }
        return p;
    }
    static double N5a7b33a4216(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= 24.383242) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() > 24.383242) {
            p = WekaClassifier.N354520ab217(i);
        }
        return p;
    }
    static double N354520ab217(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= 45.53578) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() > 45.53578) {
            p = 1;
        }
        return p;
    }
    static double N2e9e198a218(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() <= -1.3507981) {
            p = WekaClassifier.N19cfcb06219(i);
        } else if (((Double) i[6]).doubleValue() > -1.3507981) {
            p = WekaClassifier.N1a9634e9235(i);
        }
        return p;
    }
    static double N19cfcb06219(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= -6.8643575) {
            p = WekaClassifier.N1aaa3d88220(i);
        } else if (((Double) i[3]).doubleValue() > -6.8643575) {
            p = WekaClassifier.N42f7681d225(i);
        }
        return p;
    }
    static double N1aaa3d88220(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() <= 7.044535) {
            p = WekaClassifier.N6f6160e221(i);
        } else if (((Double) i[10]).doubleValue() > 7.044535) {
            p = 1;
        }
        return p;
    }
    static double N6f6160e221(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() <= -5.3700337) {
            p = WekaClassifier.N58fa1d13222(i);
        } else if (((Double) i[7]).doubleValue() > -5.3700337) {
            p = 1;
        }
        return p;
    }
    static double N58fa1d13222(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= -8.810867) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() > -8.810867) {
            p = WekaClassifier.N3f0a6af1223(i);
        }
        return p;
    }
    static double N3f0a6af1223(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= 9.44175) {
            p = WekaClassifier.N748746e5224(i);
        } else if (((Double) i[0]).doubleValue() > 9.44175) {
            p = 1;
        }
        return p;
    }
    static double N748746e5224(Object []i) {
        double p = Double.NaN;
        if (i[19] == null) {
            p = 0;
        } else if (((Double) i[19]).doubleValue() <= -4.5248475) {
            p = 0;
        } else if (((Double) i[19]).doubleValue() > -4.5248475) {
            p = 1;
        }
        return p;
    }
    static double N42f7681d225(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= -3.2585456) {
            p = WekaClassifier.N4aedf7d5226(i);
        } else if (((Double) i[4]).doubleValue() > -3.2585456) {
            p = WekaClassifier.N11eca152229(i);
        }
        return p;
    }
    static double N4aedf7d5226(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 0;
        } else if (((Double) i[7]).doubleValue() <= -4.836187) {
            p = 0;
        } else if (((Double) i[7]).doubleValue() > -4.836187) {
            p = WekaClassifier.N265c419b227(i);
        }
        return p;
    }
    static double N265c419b227(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= -1.454213) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() > -1.454213) {
            p = WekaClassifier.N68a28bdb228(i);
        }
        return p;
    }
    static double N68a28bdb228(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() <= 8.138949) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() > 8.138949) {
            p = 1;
        }
        return p;
    }
    static double N11eca152229(Object []i) {
        double p = Double.NaN;
        if (i[16] == null) {
            p = 1;
        } else if (((Double) i[16]).doubleValue() <= 1.6359719) {
            p = 1;
        } else if (((Double) i[16]).doubleValue() > 1.6359719) {
            p = WekaClassifier.N349aafe5230(i);
        }
        return p;
    }
    static double N349aafe5230(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 1;
        } else if (((Double) i[11]).doubleValue() <= 0.013920088) {
            p = WekaClassifier.N708e6074231(i);
        } else if (((Double) i[11]).doubleValue() > 0.013920088) {
            p = WekaClassifier.N781c071f233(i);
        }
        return p;
    }
    static double N708e6074231(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 1.5537515) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() > 1.5537515) {
            p = WekaClassifier.Nc8ec1ed232(i);
        }
        return p;
    }
    static double Nc8ec1ed232(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() <= 3.4967654) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() > 3.4967654) {
            p = 1;
        }
        return p;
    }
    static double N781c071f233(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= -16.77966) {
            p = WekaClassifier.N19187a7e234(i);
        } else if (((Double) i[0]).doubleValue() > -16.77966) {
            p = 0;
        }
        return p;
    }
    static double N19187a7e234(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= -90.520454) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() > -90.520454) {
            p = 1;
        }
        return p;
    }
    static double N1a9634e9235(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() <= -3.9883952) {
            p = WekaClassifier.N60ed1fff236(i);
        } else if (((Double) i[10]).doubleValue() > -3.9883952) {
            p = WekaClassifier.N95acf21239(i);
        }
        return p;
    }
    static double N60ed1fff236(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= -12.929135) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() > -12.929135) {
            p = WekaClassifier.N78d1d802237(i);
        }
        return p;
    }
    static double N78d1d802237(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= -10.562102) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() > -10.562102) {
            p = WekaClassifier.N22c086ec238(i);
        }
        return p;
    }
    static double N22c086ec238(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= -10.990237) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() > -10.990237) {
            p = 0;
        }
        return p;
    }
    static double N95acf21239(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= 51.159554) {
            p = WekaClassifier.N1c02b12240(i);
        } else if (((Double) i[0]).doubleValue() > 51.159554) {
            p = WekaClassifier.N522ebe2d316(i);
        }
        return p;
    }
    static double N1c02b12240(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= -8.439571) {
            p = WekaClassifier.N77a7f2e0241(i);
        } else if (((Double) i[3]).doubleValue() > -8.439571) {
            p = WekaClassifier.Ne9221be244(i);
        }
        return p;
    }
    static double N77a7f2e0241(Object []i) {
        double p = Double.NaN;
        if (i[13] == null) {
            p = 1;
        } else if (((Double) i[13]).doubleValue() <= -9.333067) {
            p = WekaClassifier.N5176ed1e242(i);
        } else if (((Double) i[13]).doubleValue() > -9.333067) {
            p = 1;
        }
        return p;
    }
    static double N5176ed1e242(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 7.8325367) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() > 7.8325367) {
            p = WekaClassifier.Ne0a03d6243(i);
        }
        return p;
    }
    static double Ne0a03d6243(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= 20.994781) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() > 20.994781) {
            p = 1;
        }
        return p;
    }
    static double Ne9221be244(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 0;
        } else if (((Double) i[14]).doubleValue() <= -0.75481844) {
            p = WekaClassifier.N46eae27e245(i);
        } else if (((Double) i[14]).doubleValue() > -0.75481844) {
            p = WekaClassifier.N70b0ec24249(i);
        }
        return p;
    }
    static double N46eae27e245(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -24.446003) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > -24.446003) {
            p = WekaClassifier.N2012e9a0246(i);
        }
        return p;
    }
    static double N2012e9a0246(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= -6.694975) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() > -6.694975) {
            p = WekaClassifier.N7e585ac7247(i);
        }
        return p;
    }
    static double N7e585ac7247(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() <= -4.431021) {
            p = WekaClassifier.N61580b63248(i);
        } else if (((Double) i[3]).doubleValue() > -4.431021) {
            p = 0;
        }
        return p;
    }
    static double N61580b63248(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= -3.5706117) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() > -3.5706117) {
            p = 1;
        }
        return p;
    }
    static double N70b0ec24249(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= -10.703631) {
            p = WekaClassifier.N47d8547b250(i);
        } else if (((Double) i[1]).doubleValue() > -10.703631) {
            p = WekaClassifier.N19fbf3f1256(i);
        }
        return p;
    }
    static double N47d8547b250(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 1;
        } else if (((Double) i[14]).doubleValue() <= 3.6382763) {
            p = WekaClassifier.N7b6ab025251(i);
        } else if (((Double) i[14]).doubleValue() > 3.6382763) {
            p = 1;
        }
        return p;
    }
    static double N7b6ab025251(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -146.42058) {
            p = WekaClassifier.N5ac8af38252(i);
        } else if (((Double) i[0]).doubleValue() > -146.42058) {
            p = 1;
        }
        return p;
    }
    static double N5ac8af38252(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 1;
        } else if (((Double) i[12]).doubleValue() <= 5.175039) {
            p = WekaClassifier.N2deea989253(i);
        } else if (((Double) i[12]).doubleValue() > 5.175039) {
            p = 0;
        }
        return p;
    }
    static double N2deea989253(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -159.86855) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > -159.86855) {
            p = WekaClassifier.N28105bc3254(i);
        }
        return p;
    }
    static double N28105bc3254(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= -3.2438464) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() > -3.2438464) {
            p = WekaClassifier.N6d53d7c255(i);
        }
        return p;
    }
    static double N6d53d7c255(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= -19.057343) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() > -19.057343) {
            p = 0;
        }
        return p;
    }
    static double N19fbf3f1256(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 20.80366) {
            p = WekaClassifier.N4101b3a6257(i);
        } else if (((Double) i[1]).doubleValue() > 20.80366) {
            p = WekaClassifier.N247d9922312(i);
        }
        return p;
    }
    static double N4101b3a6257(Object []i) {
        double p = Double.NaN;
        if (i[19] == null) {
            p = 1;
        } else if (((Double) i[19]).doubleValue() <= 0.21950318) {
            p = WekaClassifier.N6be53606258(i);
        } else if (((Double) i[19]).doubleValue() > 0.21950318) {
            p = 1;
        }
        return p;
    }
    static double N6be53606258(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 1;
        } else if (((Double) i[12]).doubleValue() <= 1.158687) {
            p = WekaClassifier.N44f4d8db259(i);
        } else if (((Double) i[12]).doubleValue() > 1.158687) {
            p = WekaClassifier.N5a5d3b89264(i);
        }
        return p;
    }
    static double N44f4d8db259(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= -0.6493944) {
            p = WekaClassifier.N256cfcf260(i);
        } else if (((Double) i[2]).doubleValue() > -0.6493944) {
            p = WekaClassifier.Nc918a70262(i);
        }
        return p;
    }
    static double N256cfcf260(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() <= 4.4765673) {
            p = WekaClassifier.N4e86c0a0261(i);
        } else if (((Double) i[6]).doubleValue() > 4.4765673) {
            p = 1;
        }
        return p;
    }
    static double N4e86c0a0261(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= -3.9063385) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() > -3.9063385) {
            p = 0;
        }
        return p;
    }
    static double Nc918a70262(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -95.71015) {
            p = WekaClassifier.N6e41a939263(i);
        } else if (((Double) i[0]).doubleValue() > -95.71015) {
            p = 1;
        }
        return p;
    }
    static double N6e41a939263(Object []i) {
        double p = Double.NaN;
        if (i[13] == null) {
            p = 1;
        } else if (((Double) i[13]).doubleValue() <= -3.2809324) {
            p = 1;
        } else if (((Double) i[13]).doubleValue() > -3.2809324) {
            p = 0;
        }
        return p;
    }
    static double N5a5d3b89264(Object []i) {
        double p = Double.NaN;
        if (i[17] == null) {
            p = 0;
        } else if (((Double) i[17]).doubleValue() <= -6.435048) {
            p = WekaClassifier.N222673a2265(i);
        } else if (((Double) i[17]).doubleValue() > -6.435048) {
            p = WekaClassifier.N6397eec5269(i);
        }
        return p;
    }
    static double N222673a2265(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= -1.692062) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() > -1.692062) {
            p = WekaClassifier.N22e4af9c266(i);
        }
        return p;
    }
    static double N22e4af9c266(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 1;
        } else if (((Double) i[11]).doubleValue() <= -0.009331629) {
            p = WekaClassifier.N418fd298267(i);
        } else if (((Double) i[11]).doubleValue() > -0.009331629) {
            p = 0;
        }
        return p;
    }
    static double N418fd298267(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= -1.2179261) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() > -1.2179261) {
            p = WekaClassifier.N72bd3853268(i);
        }
        return p;
    }
    static double N72bd3853268(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= -86.58079) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() > -86.58079) {
            p = 1;
        }
        return p;
    }
    static double N6397eec5269(Object []i) {
        double p = Double.NaN;
        if (i[13] == null) {
            p = 0;
        } else if (((Double) i[13]).doubleValue() <= -6.5347657) {
            p = WekaClassifier.N64882564270(i);
        } else if (((Double) i[13]).doubleValue() > -6.5347657) {
            p = WekaClassifier.N1c75cbf3273(i);
        }
        return p;
    }
    static double N64882564270(Object []i) {
        double p = Double.NaN;
        if (i[16] == null) {
            p = 0;
        } else if (((Double) i[16]).doubleValue() <= 3.0507834) {
            p = 0;
        } else if (((Double) i[16]).doubleValue() > 3.0507834) {
            p = WekaClassifier.N5b2c207f271(i);
        }
        return p;
    }
    static double N5b2c207f271(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() <= 2.4624126) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() > 2.4624126) {
            p = WekaClassifier.N40c8e4e9272(i);
        }
        return p;
    }
    static double N40c8e4e9272(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 0;
        } else if (((Double) i[7]).doubleValue() <= -5.233432) {
            p = 0;
        } else if (((Double) i[7]).doubleValue() > -5.233432) {
            p = 1;
        }
        return p;
    }
    static double N1c75cbf3273(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= -8.068234) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() > -8.068234) {
            p = WekaClassifier.N39f36e1c274(i);
        }
        return p;
    }
    static double N39f36e1c274(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= -6.4059725) {
            p = WekaClassifier.N3669e85275(i);
        } else if (((Double) i[1]).doubleValue() > -6.4059725) {
            p = WekaClassifier.N23129978279(i);
        }
        return p;
    }
    static double N3669e85275(Object []i) {
        double p = Double.NaN;
        if (i[17] == null) {
            p = 1;
        } else if (((Double) i[17]).doubleValue() <= -2.850177) {
            p = WekaClassifier.N48ecdac276(i);
        } else if (((Double) i[17]).doubleValue() > -2.850177) {
            p = 1;
        }
        return p;
    }
    static double N48ecdac276(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 0;
        } else if (((Double) i[9]).doubleValue() <= 0.2248) {
            p = 0;
        } else if (((Double) i[9]).doubleValue() > 0.2248) {
            p = WekaClassifier.N3616a49d277(i);
        }
        return p;
    }
    static double N3616a49d277(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 0;
        } else if (((Double) i[14]).doubleValue() <= 0.91971934) {
            p = 0;
        } else if (((Double) i[14]).doubleValue() > 0.91971934) {
            p = WekaClassifier.N1437afcd278(i);
        }
        return p;
    }
    static double N1437afcd278(Object []i) {
        double p = Double.NaN;
        if (i[19] == null) {
            p = 0;
        } else if (((Double) i[19]).doubleValue() <= -5.0457926) {
            p = 0;
        } else if (((Double) i[19]).doubleValue() > -5.0457926) {
            p = 1;
        }
        return p;
    }
    static double N23129978279(Object []i) {
        double p = Double.NaN;
        if (i[13] == null) {
            p = 1;
        } else if (((Double) i[13]).doubleValue() <= -0.60354483) {
            p = WekaClassifier.N5103d31b280(i);
        } else if (((Double) i[13]).doubleValue() > -0.60354483) {
            p = WekaClassifier.N73c2ee9a306(i);
        }
        return p;
    }
    static double N5103d31b280(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() <= 4.6027) {
            p = WekaClassifier.N52b2b7ea281(i);
        } else if (((Double) i[10]).doubleValue() > 4.6027) {
            p = WekaClassifier.N4a4d6c2a292(i);
        }
        return p;
    }
    static double N52b2b7ea281(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() <= -0.19187519) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() > -0.19187519) {
            p = WekaClassifier.N7bd233b6282(i);
        }
        return p;
    }
    static double N7bd233b6282(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= -107.87302) {
            p = WekaClassifier.N4cbcbced283(i);
        } else if (((Double) i[0]).doubleValue() > -107.87302) {
            p = WekaClassifier.N2e870bab286(i);
        }
        return p;
    }
    static double N4cbcbced283(Object []i) {
        double p = Double.NaN;
        if (i[13] == null) {
            p = 0;
        } else if (((Double) i[13]).doubleValue() <= -1.0485477) {
            p = WekaClassifier.N3e8356a284(i);
        } else if (((Double) i[13]).doubleValue() > -1.0485477) {
            p = 1;
        }
        return p;
    }
    static double N3e8356a284(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() <= -1.910539) {
            p = WekaClassifier.N4422df1a285(i);
        } else if (((Double) i[7]).doubleValue() > -1.910539) {
            p = 0;
        }
        return p;
    }
    static double N4422df1a285(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -131.31233) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > -131.31233) {
            p = 0;
        }
        return p;
    }
    static double N2e870bab286(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= 3.188084) {
            p = WekaClassifier.N7f58142287(i);
        } else if (((Double) i[2]).doubleValue() > 3.188084) {
            p = WekaClassifier.N17fc7a18289(i);
        }
        return p;
    }
    static double N7f58142287(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 0;
        } else if (((Double) i[14]).doubleValue() <= 4.5232635) {
            p = WekaClassifier.N45f4a7b3288(i);
        } else if (((Double) i[14]).doubleValue() > 4.5232635) {
            p = 1;
        }
        return p;
    }
    static double N45f4a7b3288(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= 14.845779) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() > 14.845779) {
            p = 1;
        }
        return p;
    }
    static double N17fc7a18289(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= 10.782589) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() > 10.782589) {
            p = WekaClassifier.N130e11f290(i);
        }
        return p;
    }
    static double N130e11f290(Object []i) {
        double p = Double.NaN;
        if (i[13] == null) {
            p = 1;
        } else if (((Double) i[13]).doubleValue() <= -1.5649174) {
            p = WekaClassifier.N2a649fea291(i);
        } else if (((Double) i[13]).doubleValue() > -1.5649174) {
            p = 0;
        }
        return p;
    }
    static double N2a649fea291(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 0;
        } else if (((Double) i[7]).doubleValue() <= -2.6631327) {
            p = 0;
        } else if (((Double) i[7]).doubleValue() > -2.6631327) {
            p = 1;
        }
        return p;
    }
    static double N4a4d6c2a292(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= -1.2133738) {
            p = WekaClassifier.N3e15e3c1293(i);
        } else if (((Double) i[5]).doubleValue() > -1.2133738) {
            p = WekaClassifier.N173390e4296(i);
        }
        return p;
    }
    static double N3e15e3c1293(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 5.934412) {
            p = WekaClassifier.N382bd505294(i);
        } else if (((Double) i[1]).doubleValue() > 5.934412) {
            p = 1;
        }
        return p;
    }
    static double N382bd505294(Object []i) {
        double p = Double.NaN;
        if (i[13] == null) {
            p = 0;
        } else if (((Double) i[13]).doubleValue() <= -4.258484) {
            p = WekaClassifier.N36be9625295(i);
        } else if (((Double) i[13]).doubleValue() > -4.258484) {
            p = 1;
        }
        return p;
    }
    static double N36be9625295(Object []i) {
        double p = Double.NaN;
        if (i[19] == null) {
            p = 0;
        } else if (((Double) i[19]).doubleValue() <= -1.7434142) {
            p = 0;
        } else if (((Double) i[19]).doubleValue() > -1.7434142) {
            p = 1;
        }
        return p;
    }
    static double N173390e4296(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 0;
        } else if (((Double) i[5]).doubleValue() <= 1.5972197) {
            p = WekaClassifier.N6297228297(i);
        } else if (((Double) i[5]).doubleValue() > 1.5972197) {
            p = WekaClassifier.N6467ba86302(i);
        }
        return p;
    }
    static double N6297228297(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= 2.9115782) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() > 2.9115782) {
            p = WekaClassifier.N604c0c15298(i);
        }
        return p;
    }
    static double N604c0c15298(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= -54.06818) {
            p = WekaClassifier.N2201a187299(i);
        } else if (((Double) i[0]).doubleValue() > -54.06818) {
            p = 1;
        }
        return p;
    }
    static double N2201a187299(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= 0.34639636) {
            p = WekaClassifier.N293eb193300(i);
        } else if (((Double) i[5]).doubleValue() > 0.34639636) {
            p = 0;
        }
        return p;
    }
    static double N293eb193300(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() <= -1.3659426) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() > -1.3659426) {
            p = WekaClassifier.N64cb3eae301(i);
        }
        return p;
    }
    static double N64cb3eae301(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() <= 5.036792) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() > 5.036792) {
            p = 0;
        }
        return p;
    }
    static double N6467ba86302(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= -4.7415423) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() > -4.7415423) {
            p = WekaClassifier.N4bc53214303(i);
        }
        return p;
    }
    static double N4bc53214303(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= 11.32818) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() > 11.32818) {
            p = WekaClassifier.N17aba0d6304(i);
        }
        return p;
    }
    static double N17aba0d6304(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -110.89513) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > -110.89513) {
            p = WekaClassifier.N2aa8c2c3305(i);
        }
        return p;
    }
    static double N2aa8c2c3305(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= -84.45891) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() > -84.45891) {
            p = 1;
        }
        return p;
    }
    static double N73c2ee9a306(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= 8.706791) {
            p = WekaClassifier.N11f52764307(i);
        } else if (((Double) i[4]).doubleValue() > 8.706791) {
            p = WekaClassifier.N6b64aaaa311(i);
        }
        return p;
    }
    static double N11f52764307(Object []i) {
        double p = Double.NaN;
        if (i[17] == null) {
            p = 0;
        } else if (((Double) i[17]).doubleValue() <= -3.3201008) {
            p = WekaClassifier.N5b92989c308(i);
        } else if (((Double) i[17]).doubleValue() > -3.3201008) {
            p = WekaClassifier.N531269ab310(i);
        }
        return p;
    }
    static double N5b92989c308(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 1;
        } else if (((Double) i[8]).doubleValue() <= 5.33224) {
            p = 1;
        } else if (((Double) i[8]).doubleValue() > 5.33224) {
            p = WekaClassifier.N37c0e7f7309(i);
        }
        return p;
    }
    static double N37c0e7f7309(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() <= 3.0418267) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() > 3.0418267) {
            p = 0;
        }
        return p;
    }
    static double N531269ab310(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() <= 3.5454528) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() > 3.5454528) {
            p = 0;
        }
        return p;
    }
    static double N6b64aaaa311(Object []i) {
        double p = Double.NaN;
        if (i[17] == null) {
            p = 0;
        } else if (((Double) i[17]).doubleValue() <= -3.3427966) {
            p = 0;
        } else if (((Double) i[17]).doubleValue() > -3.3427966) {
            p = 1;
        }
        return p;
    }
    static double N247d9922312(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 1;
        } else if (((Double) i[11]).doubleValue() <= 0.018466314) {
            p = WekaClassifier.N14b22d05313(i);
        } else if (((Double) i[11]).doubleValue() > 0.018466314) {
            p = WekaClassifier.N1ad290dc315(i);
        }
        return p;
    }
    static double N14b22d05313(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() <= -0.24416892) {
            p = WekaClassifier.N542d5109314(i);
        } else if (((Double) i[10]).doubleValue() > -0.24416892) {
            p = 1;
        }
        return p;
    }
    static double N542d5109314(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= 19.678692) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > 19.678692) {
            p = 0;
        }
        return p;
    }
    static double N1ad290dc315(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= 17.224998) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() > 17.224998) {
            p = 0;
        }
        return p;
    }
    static double N522ebe2d316(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() <= 12.888614) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() > 12.888614) {
            p = WekaClassifier.N57f17b68317(i);
        }
        return p;
    }
    static double N57f17b68317(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= 0.90707046) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() > 0.90707046) {
            p = WekaClassifier.N696add86318(i);
        }
        return p;
    }
    static double N696add86318(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= 73.304054) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() > 73.304054) {
            p = 1;
        }
        return p;
    }
    static double N6730e407319(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= 52.58188) {
            p = WekaClassifier.N4048f11a320(i);
        } else if (((Double) i[0]).doubleValue() > 52.58188) {
            p = WekaClassifier.N13cec563635(i);
        }
        return p;
    }
    static double N4048f11a320(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= -2.7255979) {
            p = WekaClassifier.N1c3ee840321(i);
        } else if (((Double) i[2]).doubleValue() > -2.7255979) {
            p = WekaClassifier.N2e2823b344(i);
        }
        return p;
    }
    static double N1c3ee840321(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 1;
        } else if (((Double) i[6]).doubleValue() <= 11.618239) {
            p = WekaClassifier.N230780ac322(i);
        } else if (((Double) i[6]).doubleValue() > 11.618239) {
            p = WekaClassifier.N50e24c0d339(i);
        }
        return p;
    }
    static double N230780ac322(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= -10.926609) {
            p = WekaClassifier.N43775817323(i);
        } else if (((Double) i[9]).doubleValue() > -10.926609) {
            p = WekaClassifier.N2f272d7c325(i);
        }
        return p;
    }
    static double N43775817323(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 23.618809) {
            p = WekaClassifier.N44b0a142324(i);
        } else if (((Double) i[1]).doubleValue() > 23.618809) {
            p = 0;
        }
        return p;
    }
    static double N44b0a142324(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() <= -4.216727) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() > -4.216727) {
            p = 1;
        }
        return p;
    }
    static double N2f272d7c325(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= -16.980131) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() > -16.980131) {
            p = WekaClassifier.N30bacad4326(i);
        }
        return p;
    }
    static double N30bacad4326(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -19.25634) {
            p = WekaClassifier.N49748b34327(i);
        } else if (((Double) i[0]).doubleValue() > -19.25634) {
            p = WekaClassifier.N42a7e096337(i);
        }
        return p;
    }
    static double N49748b34327(Object []i) {
        double p = Double.NaN;
        if (i[18] == null) {
            p = 1;
        } else if (((Double) i[18]).doubleValue() <= 0.96673286) {
            p = 1;
        } else if (((Double) i[18]).doubleValue() > 0.96673286) {
            p = WekaClassifier.N88f99e9328(i);
        }
        return p;
    }
    static double N88f99e9328(Object []i) {
        double p = Double.NaN;
        if (i[15] == null) {
            p = 1;
        } else if (((Double) i[15]).doubleValue() <= -0.7465253) {
            p = WekaClassifier.N1ed50949329(i);
        } else if (((Double) i[15]).doubleValue() > -0.7465253) {
            p = 1;
        }
        return p;
    }
    static double N1ed50949329(Object []i) {
        double p = Double.NaN;
        if (i[17] == null) {
            p = 1;
        } else if (((Double) i[17]).doubleValue() <= -3.9753888) {
            p = WekaClassifier.N785f9c2d330(i);
        } else if (((Double) i[17]).doubleValue() > -3.9753888) {
            p = WekaClassifier.N61ab06a2332(i);
        }
        return p;
    }
    static double N785f9c2d330(Object []i) {
        double p = Double.NaN;
        if (i[17] == null) {
            p = 0;
        } else if (((Double) i[17]).doubleValue() <= -8.666022) {
            p = WekaClassifier.N151f8539331(i);
        } else if (((Double) i[17]).doubleValue() > -8.666022) {
            p = 1;
        }
        return p;
    }
    static double N151f8539331(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() <= 3.9951293) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() > 3.9951293) {
            p = 1;
        }
        return p;
    }
    static double N61ab06a2332(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= 1.6670991) {
            p = WekaClassifier.N5702d49f333(i);
        } else if (((Double) i[9]).doubleValue() > 1.6670991) {
            p = 1;
        }
        return p;
    }
    static double N5702d49f333(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 0;
        } else if (((Double) i[7]).doubleValue() <= -0.9571192) {
            p = WekaClassifier.N53b894a6334(i);
        } else if (((Double) i[7]).doubleValue() > -0.9571192) {
            p = WekaClassifier.N3406a4d336(i);
        }
        return p;
    }
    static double N53b894a6334(Object []i) {
        double p = Double.NaN;
        if (i[17] == null) {
            p = 1;
        } else if (((Double) i[17]).doubleValue() <= -1.2890098) {
            p = WekaClassifier.N3ae7e5a5335(i);
        } else if (((Double) i[17]).doubleValue() > -1.2890098) {
            p = 0;
        }
        return p;
    }
    static double N3ae7e5a5335(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() <= -3.619714) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() > -3.619714) {
            p = 0;
        }
        return p;
    }
    static double N3406a4d336(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() <= 0.39217016) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() > 0.39217016) {
            p = 1;
        }
        return p;
    }
    static double N42a7e096337(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= 11.8415575) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() > 11.8415575) {
            p = WekaClassifier.N552d51c0338(i);
        }
        return p;
    }
    static double N552d51c0338(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 0;
        } else if (((Double) i[7]).doubleValue() <= -7.45185) {
            p = 0;
        } else if (((Double) i[7]).doubleValue() > -7.45185) {
            p = 1;
        }
        return p;
    }
    static double N50e24c0d339(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 0;
        } else if (((Double) i[14]).doubleValue() <= 2.1146438) {
            p = WekaClassifier.N50f0465e340(i);
        } else if (((Double) i[14]).doubleValue() > 2.1146438) {
            p = WekaClassifier.N2d2eaf86341(i);
        }
        return p;
    }
    static double N50f0465e340(Object []i) {
        double p = Double.NaN;
        if (i[17] == null) {
            p = 1;
        } else if (((Double) i[17]).doubleValue() <= -8.261971) {
            p = 1;
        } else if (((Double) i[17]).doubleValue() > -8.261971) {
            p = 0;
        }
        return p;
    }
    static double N2d2eaf86341(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 1;
        } else if (((Double) i[11]).doubleValue() <= 3.0745685) {
            p = WekaClassifier.N123248b2342(i);
        } else if (((Double) i[11]).doubleValue() > 3.0745685) {
            p = 0;
        }
        return p;
    }
    static double N123248b2342(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= -5.222087) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() > -5.222087) {
            p = WekaClassifier.N5072ecdd343(i);
        }
        return p;
    }
    static double N5072ecdd343(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= 9.630483) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() > 9.630483) {
            p = 0;
        }
        return p;
    }
    static double N2e2823b344(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= 7.5712876) {
            p = WekaClassifier.N5a685f7e345(i);
        } else if (((Double) i[3]).doubleValue() > 7.5712876) {
            p = WekaClassifier.N1473a9d1552(i);
        }
        return p;
    }
    static double N5a685f7e345(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= -82.214615) {
            p = WekaClassifier.N5a9ffb59346(i);
        } else if (((Double) i[0]).doubleValue() > -82.214615) {
            p = WekaClassifier.N65ddc7fe471(i);
        }
        return p;
    }
    static double N5a9ffb59346(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= 15.74205) {
            p = WekaClassifier.N1dccf0d3347(i);
        } else if (((Double) i[1]).doubleValue() > 15.74205) {
            p = WekaClassifier.N7ba1935a465(i);
        }
        return p;
    }
    static double N1dccf0d3347(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -169.98479) {
            p = WekaClassifier.Nba94a0b348(i);
        } else if (((Double) i[0]).doubleValue() > -169.98479) {
            p = WekaClassifier.N5c612c78359(i);
        }
        return p;
    }
    static double Nba94a0b348(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= 9.452775) {
            p = WekaClassifier.N132277af349(i);
        } else if (((Double) i[2]).doubleValue() > 9.452775) {
            p = WekaClassifier.Ndd5545c353(i);
        }
        return p;
    }
    static double N132277af349(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= -23.178267) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() > -23.178267) {
            p = WekaClassifier.N364203a1350(i);
        }
        return p;
    }
    static double N364203a1350(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= 10.683589) {
            p = WekaClassifier.N4cf227d2351(i);
        } else if (((Double) i[4]).doubleValue() > 10.683589) {
            p = 1;
        }
        return p;
    }
    static double N4cf227d2351(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= -6.6963406) {
            p = WekaClassifier.Nd4ad555352(i);
        } else if (((Double) i[1]).doubleValue() > -6.6963406) {
            p = 0;
        }
        return p;
    }
    static double Nd4ad555352(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= 5.2076926) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() > 5.2076926) {
            p = 1;
        }
        return p;
    }
    static double Ndd5545c353(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 8.009757) {
            p = WekaClassifier.N2bac114c354(i);
        } else if (((Double) i[1]).doubleValue() > 8.009757) {
            p = WekaClassifier.Na563afb357(i);
        }
        return p;
    }
    static double N2bac114c354(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() <= 1.735262) {
            p = WekaClassifier.N763d7f5c355(i);
        } else if (((Double) i[10]).doubleValue() > 1.735262) {
            p = 1;
        }
        return p;
    }
    static double N763d7f5c355(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= -0.50891036) {
            p = WekaClassifier.N2d06fcb3356(i);
        } else if (((Double) i[1]).doubleValue() > -0.50891036) {
            p = 0;
        }
        return p;
    }
    static double N2d06fcb3356(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 1;
        } else if (((Double) i[6]).doubleValue() <= 8.839867) {
            p = 1;
        } else if (((Double) i[6]).doubleValue() > 8.839867) {
            p = 0;
        }
        return p;
    }
    static double Na563afb357(Object []i) {
        double p = Double.NaN;
        if (i[13] == null) {
            p = 0;
        } else if (((Double) i[13]).doubleValue() <= -3.7412915) {
            p = 0;
        } else if (((Double) i[13]).doubleValue() > -3.7412915) {
            p = WekaClassifier.N41bb6c8c358(i);
        }
        return p;
    }
    static double N41bb6c8c358(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 11.509166) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() > 11.509166) {
            p = 0;
        }
        return p;
    }
    static double N5c612c78359(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= 13.566092) {
            p = WekaClassifier.N4698b023360(i);
        } else if (((Double) i[2]).doubleValue() > 13.566092) {
            p = WekaClassifier.N4624334d413(i);
        }
        return p;
    }
    static double N4698b023360(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= -96.69553) {
            p = WekaClassifier.N7da2cbe9361(i);
        } else if (((Double) i[0]).doubleValue() > -96.69553) {
            p = WekaClassifier.N139f9594410(i);
        }
        return p;
    }
    static double N7da2cbe9361(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 1;
        } else if (((Double) i[11]).doubleValue() <= -4.8232327) {
            p = WekaClassifier.N676717dd362(i);
        } else if (((Double) i[11]).doubleValue() > -4.8232327) {
            p = WekaClassifier.N5ba0742366(i);
        }
        return p;
    }
    static double N676717dd362(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 3.4220476) {
            p = WekaClassifier.N32b0f5a5363(i);
        } else if (((Double) i[1]).doubleValue() > 3.4220476) {
            p = 1;
        }
        return p;
    }
    static double N32b0f5a5363(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 1;
        } else if (((Double) i[8]).doubleValue() <= 1.8016653) {
            p = 1;
        } else if (((Double) i[8]).doubleValue() > 1.8016653) {
            p = WekaClassifier.N31aa5278364(i);
        }
        return p;
    }
    static double N31aa5278364(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 1;
        } else if (((Double) i[11]).doubleValue() <= -5.2943296) {
            p = WekaClassifier.N5a3c3a27365(i);
        } else if (((Double) i[11]).doubleValue() > -5.2943296) {
            p = 0;
        }
        return p;
    }
    static double N5a3c3a27365(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= 10.03576) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() > 10.03576) {
            p = 1;
        }
        return p;
    }
    static double N5ba0742366(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= 11.406333) {
            p = WekaClassifier.N3092d78d367(i);
        } else if (((Double) i[4]).doubleValue() > 11.406333) {
            p = WekaClassifier.N2cbde8ed407(i);
        }
        return p;
    }
    static double N3092d78d367(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 1;
        } else if (((Double) i[6]).doubleValue() <= 1.2489718) {
            p = WekaClassifier.N53486a75368(i);
        } else if (((Double) i[6]).doubleValue() > 1.2489718) {
            p = WekaClassifier.N1b4383e4371(i);
        }
        return p;
    }
    static double N53486a75368(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 0;
        } else if (((Double) i[5]).doubleValue() <= -0.11666347) {
            p = WekaClassifier.N689e8f39369(i);
        } else if (((Double) i[5]).doubleValue() > -0.11666347) {
            p = 1;
        }
        return p;
    }
    static double N689e8f39369(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 1;
        } else if (((Double) i[12]).doubleValue() <= 1.802103) {
            p = 1;
        } else if (((Double) i[12]).doubleValue() > 1.802103) {
            p = WekaClassifier.N3d4b157f370(i);
        }
        return p;
    }
    static double N3d4b157f370(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= -4.2760963) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() > -4.2760963) {
            p = 0;
        }
        return p;
    }
    static double N1b4383e4371(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= 3.8817194) {
            p = WekaClassifier.Nb48593b372(i);
        } else if (((Double) i[1]).doubleValue() > 3.8817194) {
            p = WekaClassifier.N5faef32b397(i);
        }
        return p;
    }
    static double Nb48593b372(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= -3.3600154) {
            p = WekaClassifier.N1733f82c373(i);
        } else if (((Double) i[1]).doubleValue() > -3.3600154) {
            p = WekaClassifier.N7009679d382(i);
        }
        return p;
    }
    static double N1733f82c373(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= 10.164809) {
            p = WekaClassifier.N72b6e758374(i);
        } else if (((Double) i[2]).doubleValue() > 10.164809) {
            p = WekaClassifier.N7116d89a378(i);
        }
        return p;
    }
    static double N72b6e758374(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 0;
        } else if (((Double) i[5]).doubleValue() <= -2.9633822) {
            p = WekaClassifier.N75ed0649375(i);
        } else if (((Double) i[5]).doubleValue() > -2.9633822) {
            p = WekaClassifier.N3c25184e376(i);
        }
        return p;
    }
    static double N75ed0649375(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() <= 2.8213515) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() > 2.8213515) {
            p = 1;
        }
        return p;
    }
    static double N3c25184e376(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() <= 6.366898) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() > 6.366898) {
            p = WekaClassifier.N34df657e377(i);
        }
        return p;
    }
    static double N34df657e377(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= 7.2953997) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() > 7.2953997) {
            p = 1;
        }
        return p;
    }
    static double N7116d89a378(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 0;
        } else if (((Double) i[7]).doubleValue() <= -2.0506105) {
            p = 0;
        } else if (((Double) i[7]).doubleValue() > -2.0506105) {
            p = WekaClassifier.N6c5457bf379(i);
        }
        return p;
    }
    static double N6c5457bf379(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= -6.556795) {
            p = WekaClassifier.N7827d513380(i);
        } else if (((Double) i[1]).doubleValue() > -6.556795) {
            p = 1;
        }
        return p;
    }
    static double N7827d513380(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= -112.368706) {
            p = WekaClassifier.N379cabfc381(i);
        } else if (((Double) i[0]).doubleValue() > -112.368706) {
            p = 1;
        }
        return p;
    }
    static double N379cabfc381(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -163.30434) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > -163.30434) {
            p = 0;
        }
        return p;
    }
    static double N7009679d382(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= -118.99488) {
            p = WekaClassifier.N3e2e3f8c383(i);
        } else if (((Double) i[0]).doubleValue() > -118.99488) {
            p = WekaClassifier.N176bb786392(i);
        }
        return p;
    }
    static double N3e2e3f8c383(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= 11.084446) {
            p = WekaClassifier.N7867fa17384(i);
        } else if (((Double) i[2]).doubleValue() > 11.084446) {
            p = WekaClassifier.N57af8b26390(i);
        }
        return p;
    }
    static double N7867fa17384(Object []i) {
        double p = Double.NaN;
        if (i[16] == null) {
            p = 0;
        } else if (((Double) i[16]).doubleValue() <= 5.605361) {
            p = WekaClassifier.N2af66dac385(i);
        } else if (((Double) i[16]).doubleValue() > 5.605361) {
            p = WekaClassifier.N173606389(i);
        }
        return p;
    }
    static double N2af66dac385(Object []i) {
        double p = Double.NaN;
        if (i[15] == null) {
            p = 0;
        } else if (((Double) i[15]).doubleValue() <= -2.8328562) {
            p = WekaClassifier.N1178c2e0386(i);
        } else if (((Double) i[15]).doubleValue() > -2.8328562) {
            p = 0;
        }
        return p;
    }
    static double N1178c2e0386(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 0;
        } else if (((Double) i[14]).doubleValue() <= 2.4767942) {
            p = 0;
        } else if (((Double) i[14]).doubleValue() > 2.4767942) {
            p = WekaClassifier.N5ee54d1c387(i);
        }
        return p;
    }
    static double N5ee54d1c387(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= 10.189895) {
            p = WekaClassifier.N1995b395388(i);
        } else if (((Double) i[2]).doubleValue() > 10.189895) {
            p = 0;
        }
        return p;
    }
    static double N1995b395388(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 1;
        } else if (((Double) i[6]).doubleValue() <= 6.035531) {
            p = 1;
        } else if (((Double) i[6]).doubleValue() > 6.035531) {
            p = 0;
        }
        return p;
    }
    static double N173606389(Object []i) {
        double p = Double.NaN;
        if (i[15] == null) {
            p = 1;
        } else if (((Double) i[15]).doubleValue() <= -1.2253033) {
            p = 1;
        } else if (((Double) i[15]).doubleValue() > -1.2253033) {
            p = 0;
        }
        return p;
    }
    static double N57af8b26390(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= -154.84793) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() > -154.84793) {
            p = WekaClassifier.N2356a162391(i);
        }
        return p;
    }
    static double N2356a162391(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 1.1180882) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() > 1.1180882) {
            p = 0;
        }
        return p;
    }
    static double N176bb786392(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() <= 5.0312366) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() > 5.0312366) {
            p = WekaClassifier.N2ef5146b393(i);
        }
        return p;
    }
    static double N2ef5146b393(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= 9.656884) {
            p = WekaClassifier.N5285c28394(i);
        } else if (((Double) i[4]).doubleValue() > 9.656884) {
            p = WekaClassifier.N597ef223396(i);
        }
        return p;
    }
    static double N5285c28394(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 1;
        } else if (((Double) i[11]).doubleValue() <= -2.854701) {
            p = WekaClassifier.N13e3b05e395(i);
        } else if (((Double) i[11]).doubleValue() > -2.854701) {
            p = 0;
        }
        return p;
    }
    static double N13e3b05e395(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() <= 5.6246123) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() > 5.6246123) {
            p = 0;
        }
        return p;
    }
    static double N597ef223396(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= 1.3064462) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() > 1.3064462) {
            p = 1;
        }
        return p;
    }
    static double N5faef32b397(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -105.21179) {
            p = WekaClassifier.N18202dea398(i);
        } else if (((Double) i[0]).doubleValue() > -105.21179) {
            p = WekaClassifier.N2f1840b8404(i);
        }
        return p;
    }
    static double N18202dea398(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 1;
        } else if (((Double) i[8]).doubleValue() <= 6.6110396) {
            p = WekaClassifier.N16cf0ff0399(i);
        } else if (((Double) i[8]).doubleValue() > 6.6110396) {
            p = 0;
        }
        return p;
    }
    static double N16cf0ff0399(Object []i) {
        double p = Double.NaN;
        if (i[18] == null) {
            p = 1;
        } else if (((Double) i[18]).doubleValue() <= 3.725157) {
            p = 1;
        } else if (((Double) i[18]).doubleValue() > 3.725157) {
            p = WekaClassifier.N380e18e0400(i);
        }
        return p;
    }
    static double N380e18e0400(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 0;
        } else if (((Double) i[14]).doubleValue() <= 3.6379645) {
            p = WekaClassifier.N10119361401(i);
        } else if (((Double) i[14]).doubleValue() > 3.6379645) {
            p = WekaClassifier.N67199da3403(i);
        }
        return p;
    }
    static double N10119361401(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= 7.471811) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() > 7.471811) {
            p = WekaClassifier.N947b3f4402(i);
        }
        return p;
    }
    static double N947b3f4402(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= -134.2161) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() > -134.2161) {
            p = 1;
        }
        return p;
    }
    static double N67199da3403(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -110.76593) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > -110.76593) {
            p = 0;
        }
        return p;
    }
    static double N2f1840b8404(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= 11.99368) {
            p = WekaClassifier.N338e44a1405(i);
        } else if (((Double) i[2]).doubleValue() > 11.99368) {
            p = 0;
        }
        return p;
    }
    static double N338e44a1405(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= 5.830561) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() > 5.830561) {
            p = WekaClassifier.N7e29937406(i);
        }
        return p;
    }
    static double N7e29937406(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= -101.2934) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() > -101.2934) {
            p = 1;
        }
        return p;
    }
    static double N2cbde8ed407(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= 0.6446427) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() > 0.6446427) {
            p = WekaClassifier.N41cd6042408(i);
        }
        return p;
    }
    static double N41cd6042408(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() <= -0.58712196) {
            p = WekaClassifier.Na79f96409(i);
        } else if (((Double) i[7]).doubleValue() > -0.58712196) {
            p = 0;
        }
        return p;
    }
    static double Na79f96409(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 1;
        } else if (((Double) i[12]).doubleValue() <= 6.2712803) {
            p = 1;
        } else if (((Double) i[12]).doubleValue() > 6.2712803) {
            p = 0;
        }
        return p;
    }
    static double N139f9594410(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 1;
        } else if (((Double) i[8]).doubleValue() <= 4.9633317) {
            p = 1;
        } else if (((Double) i[8]).doubleValue() > 4.9633317) {
            p = WekaClassifier.N5026ed8a411(i);
        }
        return p;
    }
    static double N5026ed8a411(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 7.4320016) {
            p = WekaClassifier.N7a4358bc412(i);
        } else if (((Double) i[1]).doubleValue() > 7.4320016) {
            p = 0;
        }
        return p;
    }
    static double N7a4358bc412(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= 5.3270235) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() > 5.3270235) {
            p = 1;
        }
        return p;
    }
    static double N4624334d413(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -99.2383) {
            p = WekaClassifier.N29f82d28414(i);
        } else if (((Double) i[0]).doubleValue() > -99.2383) {
            p = WekaClassifier.N89e285e459(i);
        }
        return p;
    }
    static double N29f82d28414(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= -3.7539203) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() > -3.7539203) {
            p = WekaClassifier.N4ed5df20415(i);
        }
        return p;
    }
    static double N4ed5df20415(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 11.947063) {
            p = WekaClassifier.N2eb3e8fe416(i);
        } else if (((Double) i[1]).doubleValue() > 11.947063) {
            p = WekaClassifier.N20d10a4a458(i);
        }
        return p;
    }
    static double N2eb3e8fe416(Object []i) {
        double p = Double.NaN;
        if (i[18] == null) {
            p = 1;
        } else if (((Double) i[18]).doubleValue() <= 5.0598636) {
            p = WekaClassifier.N49ea183e417(i);
        } else if (((Double) i[18]).doubleValue() > 5.0598636) {
            p = WekaClassifier.N5cf3c354448(i);
        }
        return p;
    }
    static double N49ea183e417(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= -1.320474) {
            p = WekaClassifier.N2193ed46418(i);
        } else if (((Double) i[9]).doubleValue() > -1.320474) {
            p = WekaClassifier.Ne99f41d431(i);
        }
        return p;
    }
    static double N2193ed46418(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= 5.319055) {
            p = WekaClassifier.N415f0a8b419(i);
        } else if (((Double) i[5]).doubleValue() > 5.319055) {
            p = 1;
        }
        return p;
    }
    static double N415f0a8b419(Object []i) {
        double p = Double.NaN;
        if (i[16] == null) {
            p = 1;
        } else if (((Double) i[16]).doubleValue() <= 5.1762114) {
            p = WekaClassifier.N709aee46420(i);
        } else if (((Double) i[16]).doubleValue() > 5.1762114) {
            p = WekaClassifier.N4a0e29f5427(i);
        }
        return p;
    }
    static double N709aee46420(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 3.637743) {
            p = WekaClassifier.N69a82383421(i);
        } else if (((Double) i[1]).doubleValue() > 3.637743) {
            p = 1;
        }
        return p;
    }
    static double N69a82383421(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -114.61338) {
            p = WekaClassifier.N576f0a2d422(i);
        } else if (((Double) i[0]).doubleValue() > -114.61338) {
            p = WekaClassifier.N4992725a424(i);
        }
        return p;
    }
    static double N576f0a2d422(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= -150.31) {
            p = WekaClassifier.N6edd5919423(i);
        } else if (((Double) i[0]).doubleValue() > -150.31) {
            p = 1;
        }
        return p;
    }
    static double N6edd5919423(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() <= 6.8913) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() > 6.8913) {
            p = 1;
        }
        return p;
    }
    static double N4992725a424(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 0;
        } else if (((Double) i[14]).doubleValue() <= 3.4495695) {
            p = 0;
        } else if (((Double) i[14]).doubleValue() > 3.4495695) {
            p = WekaClassifier.N610ef4d0425(i);
        }
        return p;
    }
    static double N610ef4d0425(Object []i) {
        double p = Double.NaN;
        if (i[19] == null) {
            p = 0;
        } else if (((Double) i[19]).doubleValue() <= -3.0680866) {
            p = WekaClassifier.N4e1fa4be426(i);
        } else if (((Double) i[19]).doubleValue() > -3.0680866) {
            p = 1;
        }
        return p;
    }
    static double N4e1fa4be426(Object []i) {
        double p = Double.NaN;
        if (i[17] == null) {
            p = 1;
        } else if (((Double) i[17]).doubleValue() <= -4.8667474) {
            p = 1;
        } else if (((Double) i[17]).doubleValue() > -4.8667474) {
            p = 0;
        }
        return p;
    }
    static double N4a0e29f5427(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -159.88368) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > -159.88368) {
            p = WekaClassifier.N10d4824c428(i);
        }
        return p;
    }
    static double N10d4824c428(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= 16.315134) {
            p = WekaClassifier.N66a4cf2429(i);
        } else if (((Double) i[2]).doubleValue() > 16.315134) {
            p = 0;
        }
        return p;
    }
    static double N66a4cf2429(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= 3.4263365) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() > 3.4263365) {
            p = WekaClassifier.N35e332d5430(i);
        }
        return p;
    }
    static double N35e332d5430(Object []i) {
        double p = Double.NaN;
        if (i[13] == null) {
            p = 1;
        } else if (((Double) i[13]).doubleValue() <= -3.7681644) {
            p = 1;
        } else if (((Double) i[13]).doubleValue() > -3.7681644) {
            p = 0;
        }
        return p;
    }
    static double Ne99f41d431(Object []i) {
        double p = Double.NaN;
        if (i[13] == null) {
            p = 1;
        } else if (((Double) i[13]).doubleValue() <= -2.614186) {
            p = WekaClassifier.N3a6bd160432(i);
        } else if (((Double) i[13]).doubleValue() > -2.614186) {
            p = WekaClassifier.N1b6dac15443(i);
        }
        return p;
    }
    static double N3a6bd160432(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() <= 0.024914386) {
            p = WekaClassifier.N6eb20703433(i);
        } else if (((Double) i[7]).doubleValue() > 0.024914386) {
            p = WekaClassifier.N4b90168438(i);
        }
        return p;
    }
    static double N6eb20703433(Object []i) {
        double p = Double.NaN;
        if (i[19] == null) {
            p = 0;
        } else if (((Double) i[19]).doubleValue() <= -4.6419616) {
            p = WekaClassifier.N42ebf59a434(i);
        } else if (((Double) i[19]).doubleValue() > -4.6419616) {
            p = WekaClassifier.N6797f915436(i);
        }
        return p;
    }
    static double N42ebf59a434(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() <= 5.7189274) {
            p = WekaClassifier.N313c8c6435(i);
        } else if (((Double) i[6]).doubleValue() > 5.7189274) {
            p = 1;
        }
        return p;
    }
    static double N313c8c6435(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= -0.23355095) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() > -0.23355095) {
            p = 0;
        }
        return p;
    }
    static double N6797f915436(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -102.824036) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > -102.824036) {
            p = WekaClassifier.N196360fb437(i);
        }
        return p;
    }
    static double N196360fb437(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= 15.420682) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() > 15.420682) {
            p = 1;
        }
        return p;
    }
    static double N4b90168438(Object []i) {
        double p = Double.NaN;
        if (i[15] == null) {
            p = 0;
        } else if (((Double) i[15]).doubleValue() <= -2.492373) {
            p = WekaClassifier.N1971bcc1439(i);
        } else if (((Double) i[15]).doubleValue() > -2.492373) {
            p = WekaClassifier.N439075d6441(i);
        }
        return p;
    }
    static double N1971bcc1439(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() <= 6.7701154) {
            p = WekaClassifier.N41f6b1ab440(i);
        } else if (((Double) i[6]).doubleValue() > 6.7701154) {
            p = 0;
        }
        return p;
    }
    static double N41f6b1ab440(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 0;
        } else if (((Double) i[7]).doubleValue() <= 0.43493038) {
            p = 0;
        } else if (((Double) i[7]).doubleValue() > 0.43493038) {
            p = 1;
        }
        return p;
    }
    static double N439075d6441(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= 14.888095) {
            p = WekaClassifier.Nf6e9e8d442(i);
        } else if (((Double) i[2]).doubleValue() > 14.888095) {
            p = 1;
        }
        return p;
    }
    static double Nf6e9e8d442(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 0;
        } else if (((Double) i[7]).doubleValue() <= 2.0445783) {
            p = 0;
        } else if (((Double) i[7]).doubleValue() > 2.0445783) {
            p = 1;
        }
        return p;
    }
    static double N1b6dac15443(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= 2.1655633) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() > 2.1655633) {
            p = WekaClassifier.N6f623d3a444(i);
        }
        return p;
    }
    static double N6f623d3a444(Object []i) {
        double p = Double.NaN;
        if (i[17] == null) {
            p = 0;
        } else if (((Double) i[17]).doubleValue() <= -3.6180384) {
            p = 0;
        } else if (((Double) i[17]).doubleValue() > -3.6180384) {
            p = WekaClassifier.N2f1ccbc5445(i);
        }
        return p;
    }
    static double N2f1ccbc5445(Object []i) {
        double p = Double.NaN;
        if (i[18] == null) {
            p = 1;
        } else if (((Double) i[18]).doubleValue() <= 3.5036838) {
            p = WekaClassifier.N547da25d446(i);
        } else if (((Double) i[18]).doubleValue() > 3.5036838) {
            p = 0;
        }
        return p;
    }
    static double N547da25d446(Object []i) {
        double p = Double.NaN;
        if (i[19] == null) {
            p = 0;
        } else if (((Double) i[19]).doubleValue() <= -3.6872208) {
            p = WekaClassifier.N2206b1c3447(i);
        } else if (((Double) i[19]).doubleValue() > -3.6872208) {
            p = 1;
        }
        return p;
    }
    static double N2206b1c3447(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() <= -0.92884356) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() > -0.92884356) {
            p = 0;
        }
        return p;
    }
    static double N5cf3c354448(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 0;
        } else if (((Double) i[12]).doubleValue() <= 5.9262815) {
            p = WekaClassifier.N157879ec449(i);
        } else if (((Double) i[12]).doubleValue() > 5.9262815) {
            p = WekaClassifier.N6f262327456(i);
        }
        return p;
    }
    static double N157879ec449(Object []i) {
        double p = Double.NaN;
        if (i[16] == null) {
            p = 0;
        } else if (((Double) i[16]).doubleValue() <= 4.9153733) {
            p = WekaClassifier.N2c2e5e54450(i);
        } else if (((Double) i[16]).doubleValue() > 4.9153733) {
            p = 0;
        }
        return p;
    }
    static double N2c2e5e54450(Object []i) {
        double p = Double.NaN;
        if (i[19] == null) {
            p = 0;
        } else if (((Double) i[19]).doubleValue() <= -1.0764166) {
            p = WekaClassifier.N3b317abb451(i);
        } else if (((Double) i[19]).doubleValue() > -1.0764166) {
            p = 1;
        }
        return p;
    }
    static double N3b317abb451(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 0;
        } else if (((Double) i[14]).doubleValue() <= 4.6045527) {
            p = WekaClassifier.N799ae7ea452(i);
        } else if (((Double) i[14]).doubleValue() > 4.6045527) {
            p = 0;
        }
        return p;
    }
    static double N799ae7ea452(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 0;
        } else if (((Double) i[14]).doubleValue() <= 3.8921301) {
            p = WekaClassifier.N2ffb562c453(i);
        } else if (((Double) i[14]).doubleValue() > 3.8921301) {
            p = 1;
        }
        return p;
    }
    static double N2ffb562c453(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= 11.038543) {
            p = WekaClassifier.N71797179454(i);
        } else if (((Double) i[4]).doubleValue() > 11.038543) {
            p = 1;
        }
        return p;
    }
    static double N71797179454(Object []i) {
        double p = Double.NaN;
        if (i[19] == null) {
            p = 0;
        } else if (((Double) i[19]).doubleValue() <= -1.8244972) {
            p = 0;
        } else if (((Double) i[19]).doubleValue() > -1.8244972) {
            p = WekaClassifier.N41ad394f455(i);
        }
        return p;
    }
    static double N41ad394f455(Object []i) {
        double p = Double.NaN;
        if (i[19] == null) {
            p = 1;
        } else if (((Double) i[19]).doubleValue() <= -1.5644672) {
            p = 1;
        } else if (((Double) i[19]).doubleValue() > -1.5644672) {
            p = 0;
        }
        return p;
    }
    static double N6f262327456(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -109.646996) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > -109.646996) {
            p = WekaClassifier.N1a9952d9457(i);
        }
        return p;
    }
    static double N1a9952d9457(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= 17.017626) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() > 17.017626) {
            p = 1;
        }
        return p;
    }
    static double N20d10a4a458(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() <= 0.5676379) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() > 0.5676379) {
            p = 0;
        }
        return p;
    }
    static double N89e285e459(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= 3.6546047) {
            p = WekaClassifier.N56ff0d71460(i);
        } else if (((Double) i[1]).doubleValue() > 3.6546047) {
            p = WekaClassifier.N2e8b4b29462(i);
        }
        return p;
    }
    static double N56ff0d71460(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 1;
        } else if (((Double) i[12]).doubleValue() <= 4.323953) {
            p = WekaClassifier.N6a092ed461(i);
        } else if (((Double) i[12]).doubleValue() > 4.323953) {
            p = 0;
        }
        return p;
    }
    static double N6a092ed461(Object []i) {
        double p = Double.NaN;
        if (i[15] == null) {
            p = 0;
        } else if (((Double) i[15]).doubleValue() <= -3.543183) {
            p = 0;
        } else if (((Double) i[15]).doubleValue() > -3.543183) {
            p = 1;
        }
        return p;
    }
    static double N2e8b4b29462(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= -91.00368) {
            p = WekaClassifier.N57ae5a7e463(i);
        } else if (((Double) i[0]).doubleValue() > -91.00368) {
            p = 0;
        }
        return p;
    }
    static double N57ae5a7e463(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 1;
        } else if (((Double) i[6]).doubleValue() <= 2.7693334) {
            p = WekaClassifier.N7994417f464(i);
        } else if (((Double) i[6]).doubleValue() > 2.7693334) {
            p = 0;
        }
        return p;
    }
    static double N7994417f464(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= 17.24553) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() > 17.24553) {
            p = 1;
        }
        return p;
    }
    static double N7ba1935a465(Object []i) {
        double p = Double.NaN;
        if (i[18] == null) {
            p = 1;
        } else if (((Double) i[18]).doubleValue() <= 3.2749581) {
            p = WekaClassifier.Nf875d04466(i);
        } else if (((Double) i[18]).doubleValue() > 3.2749581) {
            p = WekaClassifier.N6d7de87469(i);
        }
        return p;
    }
    static double Nf875d04466(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 1;
        } else if (((Double) i[8]).doubleValue() <= 7.702886) {
            p = WekaClassifier.N2adf8b20467(i);
        } else if (((Double) i[8]).doubleValue() > 7.702886) {
            p = 0;
        }
        return p;
    }
    static double N2adf8b20467(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= -107.875175) {
            p = WekaClassifier.N711ba8bd468(i);
        } else if (((Double) i[0]).doubleValue() > -107.875175) {
            p = 1;
        }
        return p;
    }
    static double N711ba8bd468(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= -147.7101) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() > -147.7101) {
            p = 1;
        }
        return p;
    }
    static double N6d7de87469(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 1;
        } else if (((Double) i[8]).doubleValue() <= 8.3517) {
            p = 1;
        } else if (((Double) i[8]).doubleValue() > 8.3517) {
            p = WekaClassifier.N338ddc24470(i);
        }
        return p;
    }
    static double N338ddc24470(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= 0.032281935) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() > 0.032281935) {
            p = 0;
        }
        return p;
    }
    static double N65ddc7fe471(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= -0.42624003) {
            p = WekaClassifier.N492fd5b8472(i);
        } else if (((Double) i[4]).doubleValue() > -0.42624003) {
            p = WekaClassifier.N414e66ae478(i);
        }
        return p;
    }
    static double N492fd5b8472(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= -5.8196144) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() > -5.8196144) {
            p = WekaClassifier.N713409fc473(i);
        }
        return p;
    }
    static double N713409fc473(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= 1.7583191) {
            p = WekaClassifier.N2c858702474(i);
        } else if (((Double) i[2]).doubleValue() > 1.7583191) {
            p = WekaClassifier.N27ec575b475(i);
        }
        return p;
    }
    static double N2c858702474(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 0;
        } else if (((Double) i[14]).doubleValue() <= 1.511371) {
            p = 0;
        } else if (((Double) i[14]).doubleValue() > 1.511371) {
            p = 1;
        }
        return p;
    }
    static double N27ec575b475(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 1;
        } else if (((Double) i[8]).doubleValue() <= 1.9225612) {
            p = WekaClassifier.N10d9d40b476(i);
        } else if (((Double) i[8]).doubleValue() > 1.9225612) {
            p = 0;
        }
        return p;
    }
    static double N10d9d40b476(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 0;
        } else if (((Double) i[5]).doubleValue() <= -5.4825044) {
            p = WekaClassifier.N41f34405477(i);
        } else if (((Double) i[5]).doubleValue() > -5.4825044) {
            p = 1;
        }
        return p;
    }
    static double N41f34405477(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= -9.778899) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() > -9.778899) {
            p = 0;
        }
        return p;
    }
    static double N414e66ae478(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 1;
        } else if (((Double) i[8]).doubleValue() <= 8.318437) {
            p = WekaClassifier.N4ddb753479(i);
        } else if (((Double) i[8]).doubleValue() > 8.318437) {
            p = WekaClassifier.N35e2ab10530(i);
        }
        return p;
    }
    static double N4ddb753479(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() <= -3.9883952) {
            p = WekaClassifier.N5a7a524f480(i);
        } else if (((Double) i[10]).doubleValue() > -3.9883952) {
            p = WekaClassifier.N172e669481(i);
        }
        return p;
    }
    static double N5a7a524f480(Object []i) {
        double p = Double.NaN;
        if (i[16] == null) {
            p = 1;
        } else if (((Double) i[16]).doubleValue() <= 4.502663) {
            p = 1;
        } else if (((Double) i[16]).doubleValue() > 4.502663) {
            p = 0;
        }
        return p;
    }
    static double N172e669481(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 1;
        } else if (((Double) i[12]).doubleValue() <= 9.175304) {
            p = WekaClassifier.N333b9bff482(i);
        } else if (((Double) i[12]).doubleValue() > 9.175304) {
            p = WekaClassifier.N554745c3528(i);
        }
        return p;
    }
    static double N333b9bff482(Object []i) {
        double p = Double.NaN;
        if (i[17] == null) {
            p = 1;
        } else if (((Double) i[17]).doubleValue() <= -0.87272394) {
            p = WekaClassifier.N5a35c5e4483(i);
        } else if (((Double) i[17]).doubleValue() > -0.87272394) {
            p = WekaClassifier.Nd66b787515(i);
        }
        return p;
    }
    static double N5a35c5e4483(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= 1.5725875) {
            p = WekaClassifier.N52551cc7484(i);
        } else if (((Double) i[9]).doubleValue() > 1.5725875) {
            p = WekaClassifier.N36c5e384509(i);
        }
        return p;
    }
    static double N52551cc7484(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= 14.768456) {
            p = WekaClassifier.N4402f94a485(i);
        } else if (((Double) i[2]).doubleValue() > 14.768456) {
            p = WekaClassifier.N37df6bd2495(i);
        }
        return p;
    }
    static double N4402f94a485(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() <= 2.3394282) {
            p = WekaClassifier.N2b897656486(i);
        } else if (((Double) i[4]).doubleValue() > 2.3394282) {
            p = WekaClassifier.N758bae6e491(i);
        }
        return p;
    }
    static double N2b897656486(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 1;
        } else if (((Double) i[12]).doubleValue() <= 2.4600692) {
            p = 1;
        } else if (((Double) i[12]).doubleValue() > 2.4600692) {
            p = WekaClassifier.N5fe78c26487(i);
        }
        return p;
    }
    static double N5fe78c26487(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 0;
        } else if (((Double) i[11]).doubleValue() <= -4.814253) {
            p = 0;
        } else if (((Double) i[11]).doubleValue() > -4.814253) {
            p = WekaClassifier.N25ae1039488(i);
        }
        return p;
    }
    static double N25ae1039488(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() <= 1.7398771) {
            p = WekaClassifier.N7635656f489(i);
        } else if (((Double) i[7]).doubleValue() > 1.7398771) {
            p = 0;
        }
        return p;
    }
    static double N7635656f489(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 1;
        } else if (((Double) i[8]).doubleValue() <= 6.2956076) {
            p = 1;
        } else if (((Double) i[8]).doubleValue() > 6.2956076) {
            p = WekaClassifier.N166e8639490(i);
        }
        return p;
    }
    static double N166e8639490(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= 5.4537244) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() > 5.4537244) {
            p = 0;
        }
        return p;
    }
    static double N758bae6e491(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 1;
        } else if (((Double) i[11]).doubleValue() <= -6.4033866) {
            p = WekaClassifier.N2071473e492(i);
        } else if (((Double) i[11]).doubleValue() > -6.4033866) {
            p = 1;
        }
        return p;
    }
    static double N2071473e492(Object []i) {
        double p = Double.NaN;
        if (i[17] == null) {
            p = 1;
        } else if (((Double) i[17]).doubleValue() <= -2.921633) {
            p = 1;
        } else if (((Double) i[17]).doubleValue() > -2.921633) {
            p = WekaClassifier.N7d324042493(i);
        }
        return p;
    }
    static double N7d324042493(Object []i) {
        double p = Double.NaN;
        if (i[18] == null) {
            p = 0;
        } else if (((Double) i[18]).doubleValue() <= 5.5273614) {
            p = WekaClassifier.N1f8f5e93494(i);
        } else if (((Double) i[18]).doubleValue() > 5.5273614) {
            p = 1;
        }
        return p;
    }
    static double N1f8f5e93494(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 1;
        } else if (((Double) i[14]).doubleValue() <= 2.545128) {
            p = 1;
        } else if (((Double) i[14]).doubleValue() > 2.545128) {
            p = 0;
        }
        return p;
    }
    static double N37df6bd2495(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= -70.77307) {
            p = WekaClassifier.N1d3d92a0496(i);
        } else if (((Double) i[0]).doubleValue() > -70.77307) {
            p = WekaClassifier.N5b313ada499(i);
        }
        return p;
    }
    static double N1d3d92a0496(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 1;
        } else if (((Double) i[8]).doubleValue() <= 5.5433483) {
            p = WekaClassifier.N72e2e115497(i);
        } else if (((Double) i[8]).doubleValue() > 5.5433483) {
            p = WekaClassifier.N177c521c498(i);
        }
        return p;
    }
    static double N72e2e115497(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() <= 2.3584592) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() > 2.3584592) {
            p = 0;
        }
        return p;
    }
    static double N177c521c498(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= 12.754708) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() > 12.754708) {
            p = 1;
        }
        return p;
    }
    static double N5b313ada499(Object []i) {
        double p = Double.NaN;
        if (i[19] == null) {
            p = 1;
        } else if (((Double) i[19]).doubleValue() <= -2.5888357) {
            p = WekaClassifier.N2ae80b8e500(i);
        } else if (((Double) i[19]).doubleValue() > -2.5888357) {
            p = WekaClassifier.N68cbf0a2503(i);
        }
        return p;
    }
    static double N2ae80b8e500(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -52.03785) {
            p = WekaClassifier.N4f67ad8f501(i);
        } else if (((Double) i[0]).doubleValue() > -52.03785) {
            p = 1;
        }
        return p;
    }
    static double N4f67ad8f501(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() <= 2.8427882) {
            p = WekaClassifier.N3afefacd502(i);
        } else if (((Double) i[7]).doubleValue() > 2.8427882) {
            p = 0;
        }
        return p;
    }
    static double N3afefacd502(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= 0.828623) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() > 0.828623) {
            p = 0;
        }
        return p;
    }
    static double N68cbf0a2503(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= 3.339234) {
            p = WekaClassifier.N215224e504(i);
        } else if (((Double) i[0]).doubleValue() > 3.339234) {
            p = WekaClassifier.N3d894804506(i);
        }
        return p;
    }
    static double N215224e504(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 1;
        } else if (((Double) i[8]).doubleValue() <= 6.7407627) {
            p = 1;
        } else if (((Double) i[8]).doubleValue() > 6.7407627) {
            p = WekaClassifier.N706cec56505(i);
        }
        return p;
    }
    static double N706cec56505(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() <= 5.8776135) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() > 5.8776135) {
            p = 1;
        }
        return p;
    }
    static double N3d894804506(Object []i) {
        double p = Double.NaN;
        if (i[16] == null) {
            p = 0;
        } else if (((Double) i[16]).doubleValue() <= 7.0569277) {
            p = WekaClassifier.Na70e1f7507(i);
        } else if (((Double) i[16]).doubleValue() > 7.0569277) {
            p = 1;
        }
        return p;
    }
    static double Na70e1f7507(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= 9.372413) {
            p = WekaClassifier.N215ca5a5508(i);
        } else if (((Double) i[0]).doubleValue() > 9.372413) {
            p = 0;
        }
        return p;
    }
    static double N215ca5a5508(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= 7.6768765) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() > 7.6768765) {
            p = 1;
        }
        return p;
    }
    static double N36c5e384509(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= 12.00708) {
            p = WekaClassifier.N417b4430510(i);
        } else if (((Double) i[0]).doubleValue() > 12.00708) {
            p = WekaClassifier.Na3d1893514(i);
        }
        return p;
    }
    static double N417b4430510(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 25.669739) {
            p = WekaClassifier.N4c096ab1511(i);
        } else if (((Double) i[1]).doubleValue() > 25.669739) {
            p = 0;
        }
        return p;
    }
    static double N4c096ab1511(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() <= 7.420196) {
            p = WekaClassifier.N83c9f18512(i);
        } else if (((Double) i[4]).doubleValue() > 7.420196) {
            p = 1;
        }
        return p;
    }
    static double N83c9f18512(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= -2.1100724) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() > -2.1100724) {
            p = WekaClassifier.N11fc8458513(i);
        }
        return p;
    }
    static double N11fc8458513(Object []i) {
        double p = Double.NaN;
        if (i[15] == null) {
            p = 0;
        } else if (((Double) i[15]).doubleValue() <= -1.7889428) {
            p = 0;
        } else if (((Double) i[15]).doubleValue() > -1.7889428) {
            p = 1;
        }
        return p;
    }
    static double Na3d1893514(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 1.2485299) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() > 1.2485299) {
            p = 0;
        }
        return p;
    }
    static double Nd66b787515(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 0;
        } else if (((Double) i[14]).doubleValue() <= -0.41753504) {
            p = WekaClassifier.N614e3d6c516(i);
        } else if (((Double) i[14]).doubleValue() > -0.41753504) {
            p = WekaClassifier.N1465ab59517(i);
        }
        return p;
    }
    static double N614e3d6c516(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 1;
        } else if (((Double) i[6]).doubleValue() <= -4.6536508) {
            p = 1;
        } else if (((Double) i[6]).doubleValue() > -4.6536508) {
            p = 0;
        }
        return p;
    }
    static double N1465ab59517(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= -5.8125906) {
            p = WekaClassifier.N76fec0c6518(i);
        } else if (((Double) i[1]).doubleValue() > -5.8125906) {
            p = WekaClassifier.N5e297af3520(i);
        }
        return p;
    }
    static double N76fec0c6518(Object []i) {
        double p = Double.NaN;
        if (i[15] == null) {
            p = 0;
        } else if (((Double) i[15]).doubleValue() <= -4.7614727) {
            p = WekaClassifier.N4e9c8b11519(i);
        } else if (((Double) i[15]).doubleValue() > -4.7614727) {
            p = 1;
        }
        return p;
    }
    static double N4e9c8b11519(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() <= 2.5404143) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() > 2.5404143) {
            p = 1;
        }
        return p;
    }
    static double N5e297af3520(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= 8.467551) {
            p = WekaClassifier.N67af2d0c521(i);
        } else if (((Double) i[0]).doubleValue() > 8.467551) {
            p = WekaClassifier.N58d2f781524(i);
        }
        return p;
    }
    static double N67af2d0c521(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= -1.4648569) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() > -1.4648569) {
            p = WekaClassifier.N675739cf522(i);
        }
        return p;
    }
    static double N675739cf522(Object []i) {
        double p = Double.NaN;
        if (i[15] == null) {
            p = 0;
        } else if (((Double) i[15]).doubleValue() <= -3.8804274) {
            p = WekaClassifier.N4d39e237523(i);
        } else if (((Double) i[15]).doubleValue() > -3.8804274) {
            p = 1;
        }
        return p;
    }
    static double N4d39e237523(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= 9.342603) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() > 9.342603) {
            p = 1;
        }
        return p;
    }
    static double N58d2f781524(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= -9.562842) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() > -9.562842) {
            p = WekaClassifier.N468b76da525(i);
        }
        return p;
    }
    static double N468b76da525(Object []i) {
        double p = Double.NaN;
        if (i[19] == null) {
            p = 0;
        } else if (((Double) i[19]).doubleValue() <= -1.9492776) {
            p = WekaClassifier.N184cb685526(i);
        } else if (((Double) i[19]).doubleValue() > -1.9492776) {
            p = 0;
        }
        return p;
    }
    static double N184cb685526(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() <= 0.61371905) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() > 0.61371905) {
            p = WekaClassifier.N1ae6d7e1527(i);
        }
        return p;
    }
    static double N1ae6d7e1527(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= 17.174862) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() > 17.174862) {
            p = 0;
        }
        return p;
    }
    static double N554745c3528(Object []i) {
        double p = Double.NaN;
        if (i[13] == null) {
            p = 1;
        } else if (((Double) i[13]).doubleValue() <= -4.0451064) {
            p = 1;
        } else if (((Double) i[13]).doubleValue() > -4.0451064) {
            p = WekaClassifier.N48e7c417529(i);
        }
        return p;
    }
    static double N48e7c417529(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 1;
        } else if (((Double) i[8]).doubleValue() <= 2.8154876) {
            p = 1;
        } else if (((Double) i[8]).doubleValue() > 2.8154876) {
            p = 0;
        }
        return p;
    }
    static double N35e2ab10530(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= -61.24587) {
            p = WekaClassifier.N19973b92531(i);
        } else if (((Double) i[0]).doubleValue() > -61.24587) {
            p = WekaClassifier.N20ba38b8534(i);
        }
        return p;
    }
    static double N19973b92531(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= 16.489206) {
            p = WekaClassifier.N76111c3e532(i);
        } else if (((Double) i[2]).doubleValue() > 16.489206) {
            p = 0;
        }
        return p;
    }
    static double N76111c3e532(Object []i) {
        double p = Double.NaN;
        if (i[13] == null) {
            p = 1;
        } else if (((Double) i[13]).doubleValue() <= -2.0821192) {
            p = WekaClassifier.Na0a997533(i);
        } else if (((Double) i[13]).doubleValue() > -2.0821192) {
            p = 0;
        }
        return p;
    }
    static double Na0a997533(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 0;
        } else if (((Double) i[14]).doubleValue() <= 2.958336) {
            p = 0;
        } else if (((Double) i[14]).doubleValue() > 2.958336) {
            p = 1;
        }
        return p;
    }
    static double N20ba38b8534(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 1;
        } else if (((Double) i[8]).doubleValue() <= 12.650098) {
            p = WekaClassifier.Nd1cc96535(i);
        } else if (((Double) i[8]).doubleValue() > 12.650098) {
            p = WekaClassifier.N54c3cd7e551(i);
        }
        return p;
    }
    static double Nd1cc96535(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= 17.10056) {
            p = WekaClassifier.N7edfc05e536(i);
        } else if (((Double) i[2]).doubleValue() > 17.10056) {
            p = WekaClassifier.N6e411a23547(i);
        }
        return p;
    }
    static double N7edfc05e536(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 1;
        } else if (((Double) i[12]).doubleValue() <= 8.342737) {
            p = WekaClassifier.N7b363203537(i);
        } else if (((Double) i[12]).doubleValue() > 8.342737) {
            p = WekaClassifier.N30bbcf99545(i);
        }
        return p;
    }
    static double N7b363203537(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() <= 4.4469495) {
            p = WekaClassifier.Na38ba25538(i);
        } else if (((Double) i[4]).doubleValue() > 4.4469495) {
            p = WekaClassifier.N4eb203c4541(i);
        }
        return p;
    }
    static double Na38ba25538(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= 4.39646) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() > 4.39646) {
            p = WekaClassifier.N4837288539(i);
        }
        return p;
    }
    static double N4837288539(Object []i) {
        double p = Double.NaN;
        if (i[19] == null) {
            p = 0;
        } else if (((Double) i[19]).doubleValue() <= -4.445098) {
            p = 0;
        } else if (((Double) i[19]).doubleValue() > -4.445098) {
            p = WekaClassifier.N4de9f76540(i);
        }
        return p;
    }
    static double N4de9f76540(Object []i) {
        double p = Double.NaN;
        if (i[17] == null) {
            p = 1;
        } else if (((Double) i[17]).doubleValue() <= -2.0931497) {
            p = 1;
        } else if (((Double) i[17]).doubleValue() > -2.0931497) {
            p = 0;
        }
        return p;
    }
    static double N4eb203c4541(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= 4.8528695) {
            p = WekaClassifier.N19471a5542(i);
        } else if (((Double) i[5]).doubleValue() > 4.8528695) {
            p = WekaClassifier.N6ec95da7544(i);
        }
        return p;
    }
    static double N19471a5542(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() <= 1.8364525) {
            p = WekaClassifier.N1e9c442d543(i);
        } else if (((Double) i[10]).doubleValue() > 1.8364525) {
            p = 1;
        }
        return p;
    }
    static double N1e9c442d543(Object []i) {
        double p = Double.NaN;
        if (i[13] == null) {
            p = 0;
        } else if (((Double) i[13]).doubleValue() <= -3.0555627) {
            p = 0;
        } else if (((Double) i[13]).doubleValue() > -3.0555627) {
            p = 1;
        }
        return p;
    }
    static double N6ec95da7544(Object []i) {
        double p = Double.NaN;
        if (i[16] == null) {
            p = 0;
        } else if (((Double) i[16]).doubleValue() <= 3.4648318) {
            p = 0;
        } else if (((Double) i[16]).doubleValue() > 3.4648318) {
            p = 1;
        }
        return p;
    }
    static double N30bbcf99545(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= -9.671173) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() > -9.671173) {
            p = WekaClassifier.N12808972546(i);
        }
        return p;
    }
    static double N12808972546(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= 10.85827) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() > 10.85827) {
            p = 1;
        }
        return p;
    }
    static double N6e411a23547(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 1;
        } else if (((Double) i[11]).doubleValue() <= -4.632105) {
            p = 1;
        } else if (((Double) i[11]).doubleValue() > -4.632105) {
            p = WekaClassifier.N4ac15629548(i);
        }
        return p;
    }
    static double N4ac15629548(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() <= 8.0564) {
            p = WekaClassifier.N24e88fef549(i);
        } else if (((Double) i[10]).doubleValue() > 8.0564) {
            p = 1;
        }
        return p;
    }
    static double N24e88fef549(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 0;
        } else if (((Double) i[9]).doubleValue() <= -0.46661505) {
            p = WekaClassifier.N32355919550(i);
        } else if (((Double) i[9]).doubleValue() > -0.46661505) {
            p = 0;
        }
        return p;
    }
    static double N32355919550(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= 6.415292) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() > 6.415292) {
            p = 0;
        }
        return p;
    }
    static double N54c3cd7e551(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= -7.0233936) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() > -7.0233936) {
            p = 0;
        }
        return p;
    }
    static double N1473a9d1552(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 0.7349457) {
            p = WekaClassifier.N7484db47553(i);
        } else if (((Double) i[1]).doubleValue() > 0.7349457) {
            p = WekaClassifier.N5b95f7e583(i);
        }
        return p;
    }
    static double N7484db47553(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= 5.6049113) {
            p = WekaClassifier.N6ce1a95f554(i);
        } else if (((Double) i[5]).doubleValue() > 5.6049113) {
            p = WekaClassifier.N1d197829579(i);
        }
        return p;
    }
    static double N6ce1a95f554(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 1;
        } else if (((Double) i[6]).doubleValue() <= 9.976975) {
            p = WekaClassifier.N26033180555(i);
        } else if (((Double) i[6]).doubleValue() > 9.976975) {
            p = WekaClassifier.N5ad28f0a576(i);
        }
        return p;
    }
    static double N26033180555(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= -3.48024) {
            p = WekaClassifier.N2f3729b0556(i);
        } else if (((Double) i[1]).doubleValue() > -3.48024) {
            p = WekaClassifier.N30f66796567(i);
        }
        return p;
    }
    static double N2f3729b0556(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() <= 8.905862) {
            p = WekaClassifier.N7dbb91f2557(i);
        } else if (((Double) i[4]).doubleValue() > 8.905862) {
            p = 1;
        }
        return p;
    }
    static double N7dbb91f2557(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= -21.628662) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() > -21.628662) {
            p = WekaClassifier.N1c71744b558(i);
        }
        return p;
    }
    static double N1c71744b558(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() <= 6.3394423) {
            p = WekaClassifier.N23c1d974559(i);
        } else if (((Double) i[10]).doubleValue() > 6.3394423) {
            p = 1;
        }
        return p;
    }
    static double N23c1d974559(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= 7.6768765) {
            p = WekaClassifier.N352d1e15560(i);
        } else if (((Double) i[0]).doubleValue() > 7.6768765) {
            p = 1;
        }
        return p;
    }
    static double N352d1e15560(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 1;
        } else if (((Double) i[6]).doubleValue() <= 1.5624578) {
            p = 1;
        } else if (((Double) i[6]).doubleValue() > 1.5624578) {
            p = WekaClassifier.N14382d43561(i);
        }
        return p;
    }
    static double N14382d43561(Object []i) {
        double p = Double.NaN;
        if (i[13] == null) {
            p = 0;
        } else if (((Double) i[13]).doubleValue() <= -0.1730984) {
            p = WekaClassifier.N3fcd0a3562(i);
        } else if (((Double) i[13]).doubleValue() > -0.1730984) {
            p = WekaClassifier.N43c01114566(i);
        }
        return p;
    }
    static double N3fcd0a3562(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 1;
        } else if (((Double) i[8]).doubleValue() <= 3.2746158) {
            p = WekaClassifier.N2e5ba3d1563(i);
        } else if (((Double) i[8]).doubleValue() > 3.2746158) {
            p = WekaClassifier.N73dbddb9564(i);
        }
        return p;
    }
    static double N2e5ba3d1563(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 0;
        } else if (((Double) i[9]).doubleValue() <= -4.930282) {
            p = 0;
        } else if (((Double) i[9]).doubleValue() > -4.930282) {
            p = 1;
        }
        return p;
    }
    static double N73dbddb9564(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= -4.4502344) {
            p = WekaClassifier.N265ca4b4565(i);
        } else if (((Double) i[1]).doubleValue() > -4.4502344) {
            p = 1;
        }
        return p;
    }
    static double N265ca4b4565(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() <= 9.123287) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() > 9.123287) {
            p = 1;
        }
        return p;
    }
    static double N43c01114566(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -17.487755) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > -17.487755) {
            p = 0;
        }
        return p;
    }
    static double N30f66796567(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() <= 6.5184507) {
            p = WekaClassifier.N1ded5224568(i);
        } else if (((Double) i[10]).doubleValue() > 6.5184507) {
            p = WekaClassifier.N453a7d18575(i);
        }
        return p;
    }
    static double N1ded5224568(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 0;
        } else if (((Double) i[9]).doubleValue() <= 1.194316) {
            p = WekaClassifier.N5e573c29569(i);
        } else if (((Double) i[9]).doubleValue() > 1.194316) {
            p = 0;
        }
        return p;
    }
    static double N5e573c29569(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= 1.0721236) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() > 1.0721236) {
            p = WekaClassifier.N1ddcce46570(i);
        }
        return p;
    }
    static double N1ddcce46570(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 0;
        } else if (((Double) i[14]).doubleValue() <= 2.6590328) {
            p = WekaClassifier.N1e15c0bc571(i);
        } else if (((Double) i[14]).doubleValue() > 2.6590328) {
            p = WekaClassifier.N751a5327574(i);
        }
        return p;
    }
    static double N1e15c0bc571(Object []i) {
        double p = Double.NaN;
        if (i[13] == null) {
            p = 1;
        } else if (((Double) i[13]).doubleValue() <= -6.4168878) {
            p = 1;
        } else if (((Double) i[13]).doubleValue() > -6.4168878) {
            p = WekaClassifier.N699edd28572(i);
        }
        return p;
    }
    static double N699edd28572(Object []i) {
        double p = Double.NaN;
        if (i[13] == null) {
            p = 0;
        } else if (((Double) i[13]).doubleValue() <= -2.6010854) {
            p = 0;
        } else if (((Double) i[13]).doubleValue() > -2.6010854) {
            p = WekaClassifier.Necf1246573(i);
        }
        return p;
    }
    static double Necf1246573(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= -0.13480647) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() > -0.13480647) {
            p = 0;
        }
        return p;
    }
    static double N751a5327574(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= -3.1656878) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() > -3.1656878) {
            p = 1;
        }
        return p;
    }
    static double N453a7d18575(Object []i) {
        double p = Double.NaN;
        if (i[16] == null) {
            p = 1;
        } else if (((Double) i[16]).doubleValue() <= 5.6708083) {
            p = 1;
        } else if (((Double) i[16]).doubleValue() > 5.6708083) {
            p = 0;
        }
        return p;
    }
    static double N5ad28f0a576(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= -2.41047) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() > -2.41047) {
            p = WekaClassifier.N2c79fb34577(i);
        }
        return p;
    }
    static double N2c79fb34577(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= 11.106728) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() > 11.106728) {
            p = WekaClassifier.Nbdd06f7578(i);
        }
        return p;
    }
    static double Nbdd06f7578(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 1;
        } else if (((Double) i[6]).doubleValue() <= 17.179443) {
            p = 1;
        } else if (((Double) i[6]).doubleValue() > 17.179443) {
            p = 0;
        }
        return p;
    }
    static double N1d197829579(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= -1.5626953) {
            p = WekaClassifier.N537d1e5f580(i);
        } else if (((Double) i[9]).doubleValue() > -1.5626953) {
            p = WekaClassifier.N30beef5f581(i);
        }
        return p;
    }
    static double N537d1e5f580(Object []i) {
        double p = Double.NaN;
        if (i[17] == null) {
            p = 1;
        } else if (((Double) i[17]).doubleValue() <= -1.6350675) {
            p = 1;
        } else if (((Double) i[17]).doubleValue() > -1.6350675) {
            p = 0;
        }
        return p;
    }
    static double N30beef5f581(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= 45.97141) {
            p = WekaClassifier.N5337bd01582(i);
        } else if (((Double) i[0]).doubleValue() > 45.97141) {
            p = 1;
        }
        return p;
    }
    static double N5337bd01582(Object []i) {
        double p = Double.NaN;
        if (i[15] == null) {
            p = 0;
        } else if (((Double) i[15]).doubleValue() <= -1.8547845) {
            p = 0;
        } else if (((Double) i[15]).doubleValue() > -1.8547845) {
            p = 1;
        }
        return p;
    }
    static double N5b95f7e583(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -103.24189) {
            p = WekaClassifier.N3e8d3670584(i);
        } else if (((Double) i[0]).doubleValue() > -103.24189) {
            p = WekaClassifier.N2118efa6591(i);
        }
        return p;
    }
    static double N3e8d3670584(Object []i) {
        double p = Double.NaN;
        if (i[16] == null) {
            p = 0;
        } else if (((Double) i[16]).doubleValue() <= 2.1779146) {
            p = 0;
        } else if (((Double) i[16]).doubleValue() > 2.1779146) {
            p = WekaClassifier.N798ef2e9585(i);
        }
        return p;
    }
    static double N798ef2e9585(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= 7.3823085) {
            p = WekaClassifier.N17bf976c586(i);
        } else if (((Double) i[4]).doubleValue() > 7.3823085) {
            p = WekaClassifier.Nfdbeb8a588(i);
        }
        return p;
    }
    static double N17bf976c586(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= -2.0582836) {
            p = WekaClassifier.N5832684a587(i);
        } else if (((Double) i[9]).doubleValue() > -2.0582836) {
            p = 0;
        }
        return p;
    }
    static double N5832684a587(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 1;
        } else if (((Double) i[12]).doubleValue() <= 5.041078) {
            p = 1;
        } else if (((Double) i[12]).doubleValue() > 5.041078) {
            p = 0;
        }
        return p;
    }
    static double Nfdbeb8a588(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() <= 12.8640175) {
            p = WekaClassifier.N1cc5922589(i);
        } else if (((Double) i[4]).doubleValue() > 12.8640175) {
            p = 1;
        }
        return p;
    }
    static double N1cc5922589(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= 1.7245904) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() > 1.7245904) {
            p = WekaClassifier.N6aa3ba80590(i);
        }
        return p;
    }
    static double N6aa3ba80590(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= 18.268635) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() > 18.268635) {
            p = 1;
        }
        return p;
    }
    static double N2118efa6591(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= 13.917219) {
            p = WekaClassifier.N71cfd7b4592(i);
        } else if (((Double) i[4]).doubleValue() > 13.917219) {
            p = WekaClassifier.N4d1534eb626(i);
        }
        return p;
    }
    static double N71cfd7b4592(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= 24.218315) {
            p = WekaClassifier.N122995e6593(i);
        } else if (((Double) i[0]).doubleValue() > 24.218315) {
            p = WekaClassifier.N7449eee0615(i);
        }
        return p;
    }
    static double N122995e6593(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= -8.045187) {
            p = WekaClassifier.N65a94a99594(i);
        } else if (((Double) i[9]).doubleValue() > -8.045187) {
            p = WekaClassifier.N32afc55595(i);
        }
        return p;
    }
    static double N65a94a99594(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= 21.717535) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() > 21.717535) {
            p = 0;
        }
        return p;
    }
    static double N32afc55595(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= 6.651442) {
            p = WekaClassifier.Nc57e9f3596(i);
        } else if (((Double) i[1]).doubleValue() > 6.651442) {
            p = WekaClassifier.N2b4db641608(i);
        }
        return p;
    }
    static double Nc57e9f3596(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 0;
        } else if (((Double) i[7]).doubleValue() <= -6.4748383) {
            p = 0;
        } else if (((Double) i[7]).doubleValue() > -6.4748383) {
            p = WekaClassifier.N520fdb3a597(i);
        }
        return p;
    }
    static double N520fdb3a597(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 0;
        } else if (((Double) i[5]).doubleValue() <= 2.398156) {
            p = WekaClassifier.N7dddae60598(i);
        } else if (((Double) i[5]).doubleValue() > 2.398156) {
            p = WekaClassifier.N2e661136606(i);
        }
        return p;
    }
    static double N7dddae60598(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= 1.5287043) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() > 1.5287043) {
            p = WekaClassifier.N29c13dda599(i);
        }
        return p;
    }
    static double N29c13dda599(Object []i) {
        double p = Double.NaN;
        if (i[17] == null) {
            p = 1;
        } else if (((Double) i[17]).doubleValue() <= -3.5694346) {
            p = WekaClassifier.N1aea4160600(i);
        } else if (((Double) i[17]).doubleValue() > -3.5694346) {
            p = WekaClassifier.N262e9900602(i);
        }
        return p;
    }
    static double N1aea4160600(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() <= 4.590912) {
            p = WekaClassifier.N36108f0c601(i);
        } else if (((Double) i[10]).doubleValue() > 4.590912) {
            p = 1;
        }
        return p;
    }
    static double N36108f0c601(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= 4.3064675) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() > 4.3064675) {
            p = 1;
        }
        return p;
    }
    static double N262e9900602(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= -84.013916) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() > -84.013916) {
            p = WekaClassifier.N6a15ff2603(i);
        }
        return p;
    }
    static double N6a15ff2603(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= 1.9083331) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() > 1.9083331) {
            p = WekaClassifier.N4e88ef07604(i);
        }
        return p;
    }
    static double N4e88ef07604(Object []i) {
        double p = Double.NaN;
        if (i[19] == null) {
            p = 0;
        } else if (((Double) i[19]).doubleValue() <= -5.9995756) {
            p = 0;
        } else if (((Double) i[19]).doubleValue() > -5.9995756) {
            p = WekaClassifier.N7cd26135605(i);
        }
        return p;
    }
    static double N7cd26135605(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= 1.9283518) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() > 1.9283518) {
            p = 0;
        }
        return p;
    }
    static double N2e661136606(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() <= 7.964072) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() > 7.964072) {
            p = WekaClassifier.N22b485c7607(i);
        }
        return p;
    }
    static double N22b485c7607(Object []i) {
        double p = Double.NaN;
        if (i[17] == null) {
            p = 1;
        } else if (((Double) i[17]).doubleValue() <= -3.9520915) {
            p = 1;
        } else if (((Double) i[17]).doubleValue() > -3.9520915) {
            p = 0;
        }
        return p;
    }
    static double N2b4db641608(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 0;
        } else if (((Double) i[5]).doubleValue() <= -7.7625356) {
            p = WekaClassifier.N4479b1d4609(i);
        } else if (((Double) i[5]).doubleValue() > -7.7625356) {
            p = WekaClassifier.N5c14dbe7611(i);
        }
        return p;
    }
    static double N4479b1d4609(Object []i) {
        double p = Double.NaN;
        if (i[16] == null) {
            p = 0;
        } else if (((Double) i[16]).doubleValue() <= 5.151792) {
            p = 0;
        } else if (((Double) i[16]).doubleValue() > 5.151792) {
            p = WekaClassifier.N5a88f7cc610(i);
        }
        return p;
    }
    static double N5a88f7cc610(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -11.501075) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > -11.501075) {
            p = 0;
        }
        return p;
    }
    static double N5c14dbe7611(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() <= 5.022656) {
            p = WekaClassifier.N1a2d919a612(i);
        } else if (((Double) i[8]).doubleValue() > 5.022656) {
            p = 0;
        }
        return p;
    }
    static double N1a2d919a612(Object []i) {
        double p = Double.NaN;
        if (i[19] == null) {
            p = 0;
        } else if (((Double) i[19]).doubleValue() <= -5.7403884) {
            p = 0;
        } else if (((Double) i[19]).doubleValue() > -5.7403884) {
            p = WekaClassifier.N1353641a613(i);
        }
        return p;
    }
    static double N1353641a613(Object []i) {
        double p = Double.NaN;
        if (i[15] == null) {
            p = 0;
        } else if (((Double) i[15]).doubleValue() <= -4.3195734) {
            p = 0;
        } else if (((Double) i[15]).doubleValue() > -4.3195734) {
            p = WekaClassifier.Ne78c72b614(i);
        }
        return p;
    }
    static double Ne78c72b614(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= -79.22195) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() > -79.22195) {
            p = 1;
        }
        return p;
    }
    static double N7449eee0615(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 1;
        } else if (((Double) i[12]).doubleValue() <= 1.4705063) {
            p = WekaClassifier.N21e10b2616(i);
        } else if (((Double) i[12]).doubleValue() > 1.4705063) {
            p = WekaClassifier.N426c18b7618(i);
        }
        return p;
    }
    static double N21e10b2616(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 25.300613) {
            p = WekaClassifier.Nae5d75f617(i);
        } else if (((Double) i[1]).doubleValue() > 25.300613) {
            p = 0;
        }
        return p;
    }
    static double Nae5d75f617(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= 22.049416) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() > 22.049416) {
            p = 0;
        }
        return p;
    }
    static double N426c18b7618(Object []i) {
        double p = Double.NaN;
        if (i[15] == null) {
            p = 0;
        } else if (((Double) i[15]).doubleValue() <= -3.339453) {
            p = WekaClassifier.N79e9c0f4619(i);
        } else if (((Double) i[15]).doubleValue() > -3.339453) {
            p = 1;
        }
        return p;
    }
    static double N79e9c0f4619(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() <= 9.7877445) {
            p = WekaClassifier.Nb80c4fb620(i);
        } else if (((Double) i[6]).doubleValue() > 9.7877445) {
            p = 1;
        }
        return p;
    }
    static double Nb80c4fb620(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= 12.21246) {
            p = WekaClassifier.N2f7bb5fb621(i);
        } else if (((Double) i[4]).doubleValue() > 12.21246) {
            p = WekaClassifier.N45a535ed625(i);
        }
        return p;
    }
    static double N2f7bb5fb621(Object []i) {
        double p = Double.NaN;
        if (i[15] == null) {
            p = 0;
        } else if (((Double) i[15]).doubleValue() <= -5.5281544) {
            p = 0;
        } else if (((Double) i[15]).doubleValue() > -5.5281544) {
            p = WekaClassifier.Ndf0a903622(i);
        }
        return p;
    }
    static double Ndf0a903622(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= -11.965903) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() > -11.965903) {
            p = WekaClassifier.N3aa93629623(i);
        }
        return p;
    }
    static double N3aa93629623(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 1;
        } else if (((Double) i[12]).doubleValue() <= 3.4984925) {
            p = WekaClassifier.N37038a9b624(i);
        } else if (((Double) i[12]).doubleValue() > 3.4984925) {
            p = 0;
        }
        return p;
    }
    static double N37038a9b624(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= 42.929195) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > 42.929195) {
            p = 0;
        }
        return p;
    }
    static double N45a535ed625(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 21.62266) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() > 21.62266) {
            p = 0;
        }
        return p;
    }
    static double N4d1534eb626(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 1;
        } else if (((Double) i[8]).doubleValue() <= 5.607395) {
            p = WekaClassifier.N3e7e5b1e627(i);
        } else if (((Double) i[8]).doubleValue() > 5.607395) {
            p = WekaClassifier.N15025918628(i);
        }
        return p;
    }
    static double N3e7e5b1e627(Object []i) {
        double p = Double.NaN;
        if (i[13] == null) {
            p = 1;
        } else if (((Double) i[13]).doubleValue() <= -0.8417491) {
            p = 1;
        } else if (((Double) i[13]).doubleValue() > -0.8417491) {
            p = 0;
        }
        return p;
    }
    static double N15025918628(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 8.564708) {
            p = WekaClassifier.N79640c08629(i);
        } else if (((Double) i[1]).doubleValue() > 8.564708) {
            p = WekaClassifier.N1d32dda3630(i);
        }
        return p;
    }
    static double N79640c08629(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= -78.119156) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() > -78.119156) {
            p = 1;
        }
        return p;
    }
    static double N1d32dda3630(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= 25.59552) {
            p = WekaClassifier.N5158c3b0631(i);
        } else if (((Double) i[1]).doubleValue() > 25.59552) {
            p = WekaClassifier.N41cc313634(i);
        }
        return p;
    }
    static double N5158c3b0631(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 0;
        } else if (((Double) i[5]).doubleValue() <= 2.8877485) {
            p = WekaClassifier.N56959a1a632(i);
        } else if (((Double) i[5]).doubleValue() > 2.8877485) {
            p = 0;
        }
        return p;
    }
    static double N56959a1a632(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() <= 5.0129232) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() > 5.0129232) {
            p = WekaClassifier.Nfc8d88c633(i);
        }
        return p;
    }
    static double Nfc8d88c633(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 1;
        } else if (((Double) i[11]).doubleValue() <= -1.611132) {
            p = 1;
        } else if (((Double) i[11]).doubleValue() > -1.611132) {
            p = 0;
        }
        return p;
    }
    static double N41cc313634(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 0;
        } else if (((Double) i[5]).doubleValue() <= -0.9655796) {
            p = 0;
        } else if (((Double) i[5]).doubleValue() > -0.9655796) {
            p = 1;
        }
        return p;
    }
    static double N13cec563635(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 1;
        } else if (((Double) i[8]).doubleValue() <= 9.337348) {
            p = WekaClassifier.N6971d84a636(i);
        } else if (((Double) i[8]).doubleValue() > 9.337348) {
            p = WekaClassifier.N51da62dd660(i);
        }
        return p;
    }
    static double N6971d84a636(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() <= -12.625673) {
            p = WekaClassifier.N20346150637(i);
        } else if (((Double) i[7]).doubleValue() > -12.625673) {
            p = WekaClassifier.N42d23a1e638(i);
        }
        return p;
    }
    static double N20346150637(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= 0.90195096) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() > 0.90195096) {
            p = 0;
        }
        return p;
    }
    static double N42d23a1e638(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= 5.3870277) {
            p = WekaClassifier.N27d21afa639(i);
        } else if (((Double) i[2]).doubleValue() > 5.3870277) {
            p = WekaClassifier.N27d8efed643(i);
        }
        return p;
    }
    static double N27d21afa639(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() <= 0.18388024) {
            p = WekaClassifier.N408625c2640(i);
        } else if (((Double) i[10]).doubleValue() > 0.18388024) {
            p = 1;
        }
        return p;
    }
    static double N408625c2640(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 2.74992) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() > 2.74992) {
            p = WekaClassifier.N433be263641(i);
        }
        return p;
    }
    static double N433be263641(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 1;
        } else if (((Double) i[6]).doubleValue() <= 4.310058) {
            p = WekaClassifier.N106a22d0642(i);
        } else if (((Double) i[6]).doubleValue() > 4.310058) {
            p = 1;
        }
        return p;
    }
    static double N106a22d0642(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 1;
        } else if (((Double) i[14]).doubleValue() <= 2.9865544) {
            p = 1;
        } else if (((Double) i[14]).doubleValue() > 2.9865544) {
            p = 0;
        }
        return p;
    }
    static double N27d8efed643(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 1;
        } else if (((Double) i[12]).doubleValue() <= 7.6915607) {
            p = WekaClassifier.N568166e1644(i);
        } else if (((Double) i[12]).doubleValue() > 7.6915607) {
            p = WekaClassifier.N14b2cfa0655(i);
        }
        return p;
    }
    static double N568166e1644(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= 64.202415) {
            p = WekaClassifier.N4a35bea8645(i);
        } else if (((Double) i[0]).doubleValue() > 64.202415) {
            p = WekaClassifier.N1a484166652(i);
        }
        return p;
    }
    static double N4a35bea8645(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() <= -2.2557168) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() > -2.2557168) {
            p = WekaClassifier.Nb08799c646(i);
        }
        return p;
    }
    static double Nb08799c646(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= -5.2829857) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() > -5.2829857) {
            p = WekaClassifier.N6bcf4897647(i);
        }
        return p;
    }
    static double N6bcf4897647(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= -5.0667176) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() > -5.0667176) {
            p = WekaClassifier.N36248d61648(i);
        }
        return p;
    }
    static double N36248d61648(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() <= 2.9044137) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() > 2.9044137) {
            p = WekaClassifier.N5183a5f3649(i);
        }
        return p;
    }
    static double N5183a5f3649(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= -0.130073) {
            p = WekaClassifier.N198fe2c6650(i);
        } else if (((Double) i[9]).doubleValue() > -0.130073) {
            p = 0;
        }
        return p;
    }
    static double N198fe2c6650(Object []i) {
        double p = Double.NaN;
        if (i[13] == null) {
            p = 1;
        } else if (((Double) i[13]).doubleValue() <= -3.2635472) {
            p = 1;
        } else if (((Double) i[13]).doubleValue() > -3.2635472) {
            p = WekaClassifier.N8959a90651(i);
        }
        return p;
    }
    static double N8959a90651(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= 20.362654) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() > 20.362654) {
            p = 1;
        }
        return p;
    }
    static double N1a484166652(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= 92.4395) {
            p = WekaClassifier.N5628d3e1653(i);
        } else if (((Double) i[0]).doubleValue() > 92.4395) {
            p = 1;
        }
        return p;
    }
    static double N5628d3e1653(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() <= 5.4992313) {
            p = WekaClassifier.N30d78230654(i);
        } else if (((Double) i[4]).doubleValue() > 5.4992313) {
            p = 1;
        }
        return p;
    }
    static double N30d78230654(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= 7.51843) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() > 7.51843) {
            p = 0;
        }
        return p;
    }
    static double N14b2cfa0655(Object []i) {
        double p = Double.NaN;
        if (i[15] == null) {
            p = 0;
        } else if (((Double) i[15]).doubleValue() <= -7.1175756) {
            p = 0;
        } else if (((Double) i[15]).doubleValue() > -7.1175756) {
            p = WekaClassifier.N4ca9ef21656(i);
        }
        return p;
    }
    static double N4ca9ef21656(Object []i) {
        double p = Double.NaN;
        if (i[17] == null) {
            p = 0;
        } else if (((Double) i[17]).doubleValue() <= -7.136596) {
            p = 0;
        } else if (((Double) i[17]).doubleValue() > -7.136596) {
            p = WekaClassifier.N5c8e9a8e657(i);
        }
        return p;
    }
    static double N5c8e9a8e657(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 17.923897) {
            p = WekaClassifier.N5044552d658(i);
        } else if (((Double) i[1]).doubleValue() > 17.923897) {
            p = 1;
        }
        return p;
    }
    static double N5044552d658(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= 18.817076) {
            p = WekaClassifier.N52895f4a659(i);
        } else if (((Double) i[2]).doubleValue() > 18.817076) {
            p = 0;
        }
        return p;
    }
    static double N52895f4a659(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= -4.8488464) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() > -4.8488464) {
            p = 1;
        }
        return p;
    }
    static double N51da62dd660(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= -0.11575988) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() > -0.11575988) {
            p = WekaClassifier.N79a8c882661(i);
        }
        return p;
    }
    static double N79a8c882661(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 0;
        } else if (((Double) i[14]).doubleValue() <= 4.9041834) {
            p = WekaClassifier.Nb3707a7662(i);
        } else if (((Double) i[14]).doubleValue() > 4.9041834) {
            p = WekaClassifier.N2ec118d0665(i);
        }
        return p;
    }
    static double Nb3707a7662(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= 106.988) {
            p = WekaClassifier.N135c6a84663(i);
        } else if (((Double) i[0]).doubleValue() > 106.988) {
            p = 1;
        }
        return p;
    }
    static double N135c6a84663(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= -3.3624997) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() > -3.3624997) {
            p = WekaClassifier.N11923eb8664(i);
        }
        return p;
    }
    static double N11923eb8664(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= -10.7781515) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() > -10.7781515) {
            p = 0;
        }
        return p;
    }
    static double N2ec118d0665(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 1;
        } else if (((Double) i[12]).doubleValue() <= 6.907909) {
            p = 1;
        } else if (((Double) i[12]).doubleValue() > 6.907909) {
            p = WekaClassifier.N1df82890666(i);
        }
        return p;
    }
    static double N1df82890666(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= 4.6199703) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() > 4.6199703) {
            p = 0;
        }
        return p;
    }
}
