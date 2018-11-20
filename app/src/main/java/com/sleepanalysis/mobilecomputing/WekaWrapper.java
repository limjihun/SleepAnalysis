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
        p = WekaClassifier.N325d2ab00(i);
        return p;
    }
    static double N325d2ab00(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= -18.76634428713279) {
            p = WekaClassifier.N145753031(i);
        } else if (((Double) i[2]).doubleValue() > -18.76634428713279) {
            p = WekaClassifier.N65bd85a41372(i);
        }
        return p;
    }
    static double N145753031(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= -26.980026472433217) {
            p = WekaClassifier.N20d6ba072(i);
        } else if (((Double) i[1]).doubleValue() > -26.980026472433217) {
            p = WekaClassifier.N48b2bd5d31(i);
        }
        return p;
    }
    static double N20d6ba072(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -0.5062912886457482) {
            p = WekaClassifier.N56fa5d0d3(i);
        } else if (((Double) i[0]).doubleValue() > -0.5062912886457482) {
            p = WekaClassifier.N644ce26025(i);
        }
        return p;
    }
    static double N56fa5d0d3(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -10.303932689527002) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > -10.303932689527002) {
            p = WekaClassifier.Nd29e5c84(i);
        }
        return p;
    }
    static double Nd29e5c84(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 1;
        } else if (((Double) i[6]).doubleValue() <= -26.694176067678505) {
            p = WekaClassifier.N23c860255(i);
        } else if (((Double) i[6]).doubleValue() > -26.694176067678505) {
            p = WekaClassifier.N5b61f77419(i);
        }
        return p;
    }
    static double N23c860255(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= -25.955959895558752) {
            p = WekaClassifier.N365be0d96(i);
        } else if (((Double) i[5]).doubleValue() > -25.955959895558752) {
            p = WekaClassifier.N7008650e8(i);
        }
        return p;
    }
    static double N365be0d96(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 1;
        } else if (((Double) i[12]).doubleValue() <= -24.448501720651446) {
            p = 1;
        } else if (((Double) i[12]).doubleValue() > -24.448501720651446) {
            p = WekaClassifier.N324dd12a7(i);
        }
        return p;
    }
    static double N324dd12a7(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 0;
        } else if (((Double) i[11]).doubleValue() <= -41.9912481647239) {
            p = 0;
        } else if (((Double) i[11]).doubleValue() > -41.9912481647239) {
            p = 1;
        }
        return p;
    }
    static double N7008650e8(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() <= -36.04047580573601) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() > -36.04047580573601) {
            p = WekaClassifier.N10a1fa629(i);
        }
        return p;
    }
    static double N10a1fa629(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -5.922457636277919) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > -5.922457636277919) {
            p = WekaClassifier.N79959d8710(i);
        }
        return p;
    }
    static double N79959d8710(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -2.091908282569136) {
            p = WekaClassifier.N258dc71e11(i);
        } else if (((Double) i[0]).doubleValue() > -2.091908282569136) {
            p = 1;
        }
        return p;
    }
    static double N258dc71e11(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 0;
        } else if (((Double) i[5]).doubleValue() <= -21.912950501067236) {
            p = WekaClassifier.N161ef6b412(i);
        } else if (((Double) i[5]).doubleValue() > -21.912950501067236) {
            p = 1;
        }
        return p;
    }
    static double N161ef6b412(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() <= -21.220253186160512) {
            p = WekaClassifier.N9f37cff13(i);
        } else if (((Double) i[3]).doubleValue() > -21.220253186160512) {
            p = 1;
        }
        return p;
    }
    static double N9f37cff13(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 0;
        } else if (((Double) i[14]).doubleValue() <= -29.920547979172927) {
            p = WekaClassifier.N5cdfa1e314(i);
        } else if (((Double) i[14]).doubleValue() > -29.920547979172927) {
            p = 1;
        }
        return p;
    }
    static double N5cdfa1e314(Object []i) {
        double p = Double.NaN;
        if (i[13] == null) {
            p = 0;
        } else if (((Double) i[13]).doubleValue() <= -37.45720077144515) {
            p = WekaClassifier.N1721285115(i);
        } else if (((Double) i[13]).doubleValue() > -37.45720077144515) {
            p = WekaClassifier.N646d49f117(i);
        }
        return p;
    }
    static double N1721285115(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 1;
        } else if (((Double) i[11]).doubleValue() <= -36.517181022936725) {
            p = WekaClassifier.N76ebd75716(i);
        } else if (((Double) i[11]).doubleValue() > -36.517181022936725) {
            p = 0;
        }
        return p;
    }
    static double N76ebd75716(Object []i) {
        double p = Double.NaN;
        if (i[13] == null) {
            p = 1;
        } else if (((Double) i[13]).doubleValue() <= -41.642051593625354) {
            p = 1;
        } else if (((Double) i[13]).doubleValue() > -41.642051593625354) {
            p = 0;
        }
        return p;
    }
    static double N646d49f117(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() <= -25.796360266067204) {
            p = WekaClassifier.N451c3c2618(i);
        } else if (((Double) i[7]).doubleValue() > -25.796360266067204) {
            p = 0;
        }
        return p;
    }
    static double N451c3c2618(Object []i) {
        double p = Double.NaN;
        if (i[15] == null) {
            p = 1;
        } else if (((Double) i[15]).doubleValue() <= -33.18108575182787) {
            p = 1;
        } else if (((Double) i[15]).doubleValue() > -33.18108575182787) {
            p = 0;
        }
        return p;
    }
    static double N5b61f77419(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -4.530159212980848) {
            p = WekaClassifier.N7318c22020(i);
        } else if (((Double) i[0]).doubleValue() > -4.530159212980848) {
            p = 1;
        }
        return p;
    }
    static double N7318c22020(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= -23.703492114116003) {
            p = WekaClassifier.N7db42f7321(i);
        } else if (((Double) i[2]).doubleValue() > -23.703492114116003) {
            p = 1;
        }
        return p;
    }
    static double N7db42f7321(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 0;
        } else if (((Double) i[9]).doubleValue() <= -33.28960230998318) {
            p = WekaClassifier.N59edc1ef22(i);
        } else if (((Double) i[9]).doubleValue() > -33.28960230998318) {
            p = 1;
        }
        return p;
    }
    static double N59edc1ef22(Object []i) {
        double p = Double.NaN;
        if (i[17] == null) {
            p = 0;
        } else if (((Double) i[17]).doubleValue() <= -37.02810890823625) {
            p = WekaClassifier.Nd6347f123(i);
        } else if (((Double) i[17]).doubleValue() > -37.02810890823625) {
            p = WekaClassifier.N38df8dbf24(i);
        }
        return p;
    }
    static double Nd6347f123(Object []i) {
        double p = Double.NaN;
        if (i[19] == null) {
            p = 0;
        } else if (((Double) i[19]).doubleValue() <= -34.750435443279656) {
            p = 0;
        } else if (((Double) i[19]).doubleValue() > -34.750435443279656) {
            p = 1;
        }
        return p;
    }
    static double N38df8dbf24(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 1;
        } else if (((Double) i[14]).doubleValue() <= -30.516846041200264) {
            p = 1;
        } else if (((Double) i[14]).doubleValue() > -30.516846041200264) {
            p = 0;
        }
        return p;
    }
    static double N644ce26025(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 1;
        } else if (((Double) i[8]).doubleValue() <= -34.4842724817937) {
            p = 1;
        } else if (((Double) i[8]).doubleValue() > -34.4842724817937) {
            p = WekaClassifier.N5399a5bf26(i);
        }
        return p;
    }
    static double N5399a5bf26(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -0.09159896883943475) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > -0.09159896883943475) {
            p = WekaClassifier.N44d22cf227(i);
        }
        return p;
    }
    static double N44d22cf227(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= -30.97096141636019) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() > -30.97096141636019) {
            p = WekaClassifier.N24f3a228(i);
        }
        return p;
    }
    static double N24f3a228(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= -30.74019482425086) {
            p = WekaClassifier.N3f85e2429(i);
        } else if (((Double) i[4]).doubleValue() > -30.74019482425086) {
            p = 1;
        }
        return p;
    }
    static double N3f85e2429(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= -35.201445507809154) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() > -35.201445507809154) {
            p = WekaClassifier.N1d52b7b930(i);
        }
        return p;
    }
    static double N1d52b7b930(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() <= -31.759885995274782) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() > -31.759885995274782) {
            p = 1;
        }
        return p;
    }
    static double N48b2bd5d31(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= -12.398566831988639) {
            p = WekaClassifier.N6facee0a32(i);
        } else if (((Double) i[1]).doubleValue() > -12.398566831988639) {
            p = WekaClassifier.N6ee1b91f1229(i);
        }
        return p;
    }
    static double N6facee0a32(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -10.038139746070655) {
            p = WekaClassifier.N2e6484a533(i);
        } else if (((Double) i[0]).doubleValue() > -10.038139746070655) {
            p = WekaClassifier.N2120dd5551(i);
        }
        return p;
    }
    static double N2e6484a533(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() <= -26.89437165369651) {
            p = WekaClassifier.N260311af34(i);
        } else if (((Double) i[10]).doubleValue() > -26.89437165369651) {
            p = WekaClassifier.N5576b1db42(i);
        }
        return p;
    }
    static double N260311af34(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -11.15009656257429) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > -11.15009656257429) {
            p = WekaClassifier.N7b86086735(i);
        }
        return p;
    }
    static double N7b86086735(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 1;
        } else if (((Double) i[14]).doubleValue() <= -35.45340652125118) {
            p = 1;
        } else if (((Double) i[14]).doubleValue() > -35.45340652125118) {
            p = WekaClassifier.N73d265a336(i);
        }
        return p;
    }
    static double N73d265a336(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= -27.280319480151547) {
            p = WekaClassifier.N799996d037(i);
        } else if (((Double) i[2]).doubleValue() > -27.280319480151547) {
            p = 1;
        }
        return p;
    }
    static double N799996d037(Object []i) {
        double p = Double.NaN;
        if (i[18] == null) {
            p = 1;
        } else if (((Double) i[18]).doubleValue() <= -39.77952494789037) {
            p = 1;
        } else if (((Double) i[18]).doubleValue() > -39.77952494789037) {
            p = WekaClassifier.N47a96e2538(i);
        }
        return p;
    }
    static double N47a96e2538(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 1;
        } else if (((Double) i[6]).doubleValue() <= -28.680383747679876) {
            p = WekaClassifier.Nc27938739(i);
        } else if (((Double) i[6]).doubleValue() > -28.680383747679876) {
            p = 0;
        }
        return p;
    }
    static double Nc27938739(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() <= -28.327035690764284) {
            p = WekaClassifier.N6cb810dd40(i);
        } else if (((Double) i[10]).doubleValue() > -28.327035690764284) {
            p = 0;
        }
        return p;
    }
    static double N6cb810dd40(Object []i) {
        double p = Double.NaN;
        if (i[13] == null) {
            p = 1;
        } else if (((Double) i[13]).doubleValue() <= -44.53060643469121) {
            p = WekaClassifier.N59a2248c41(i);
        } else if (((Double) i[13]).doubleValue() > -44.53060643469121) {
            p = 1;
        }
        return p;
    }
    static double N59a2248c41(Object []i) {
        double p = Double.NaN;
        if (i[13] == null) {
            p = 1;
        } else if (((Double) i[13]).doubleValue() <= -47.73714457492207) {
            p = 1;
        } else if (((Double) i[13]).doubleValue() > -47.73714457492207) {
            p = 0;
        }
        return p;
    }
    static double N5576b1db42(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 0;
        } else if (((Double) i[11]).doubleValue() <= -34.895096578372815) {
            p = WekaClassifier.N65fdab5943(i);
        } else if (((Double) i[11]).doubleValue() > -34.895096578372815) {
            p = 1;
        }
        return p;
    }
    static double N65fdab5943(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= -29.924987142383667) {
            p = WekaClassifier.N496f61c344(i);
        } else if (((Double) i[4]).doubleValue() > -29.924987142383667) {
            p = WekaClassifier.N57b907e149(i);
        }
        return p;
    }
    static double N496f61c344(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() <= -27.804415411298546) {
            p = WekaClassifier.N1a1ba2645(i);
        } else if (((Double) i[3]).doubleValue() > -27.804415411298546) {
            p = 1;
        }
        return p;
    }
    static double N1a1ba2645(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= -17.332578961213542) {
            p = WekaClassifier.N61b93ba046(i);
        } else if (((Double) i[1]).doubleValue() > -17.332578961213542) {
            p = WekaClassifier.N6996f3ad47(i);
        }
        return p;
    }
    static double N61b93ba046(Object []i) {
        double p = Double.NaN;
        if (i[17] == null) {
            p = 0;
        } else if (((Double) i[17]).doubleValue() <= -40.75088062627816) {
            p = 0;
        } else if (((Double) i[17]).doubleValue() > -40.75088062627816) {
            p = 1;
        }
        return p;
    }
    static double N6996f3ad47(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 0;
        } else if (((Double) i[5]).doubleValue() <= -36.88339019864819) {
            p = WekaClassifier.N5b45f62548(i);
        } else if (((Double) i[5]).doubleValue() > -36.88339019864819) {
            p = 0;
        }
        return p;
    }
    static double N5b45f62548(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= -15.270054629211472) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() > -15.270054629211472) {
            p = 1;
        }
        return p;
    }
    static double N57b907e149(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() <= -40.531973535424555) {
            p = WekaClassifier.N7f75428d50(i);
        } else if (((Double) i[7]).doubleValue() > -40.531973535424555) {
            p = 1;
        }
        return p;
    }
    static double N7f75428d50(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= -27.04890785247708) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() > -27.04890785247708) {
            p = 1;
        }
        return p;
    }
    static double N2120dd5551(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 1;
        } else if (((Double) i[8]).doubleValue() <= -25.98182100619826) {
            p = WekaClassifier.N55a0f38a52(i);
        } else if (((Double) i[8]).doubleValue() > -25.98182100619826) {
            p = WekaClassifier.N32cf308f1200(i);
        }
        return p;
    }
    static double N55a0f38a52(Object []i) {
        double p = Double.NaN;
        if (i[13] == null) {
            p = 1;
        } else if (((Double) i[13]).doubleValue() <= -30.387675911900153) {
            p = WekaClassifier.N4a3970d053(i);
        } else if (((Double) i[13]).doubleValue() > -30.387675911900153) {
            p = WekaClassifier.N6d653ee31137(i);
        }
        return p;
    }
    static double N4a3970d053(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= -31.68302534430323) {
            p = WekaClassifier.N1f8d323054(i);
        } else if (((Double) i[9]).doubleValue() > -31.68302534430323) {
            p = WekaClassifier.N4bc34b02960(i);
        }
        return p;
    }
    static double N1f8d323054(Object []i) {
        double p = Double.NaN;
        if (i[16] == null) {
            p = 1;
        } else if (((Double) i[16]).doubleValue() <= -27.044838072043337) {
            p = WekaClassifier.N38609ee155(i);
        } else if (((Double) i[16]).doubleValue() > -27.044838072043337) {
            p = WekaClassifier.N5fd7644f950(i);
        }
        return p;
    }
    static double N38609ee155(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= -19.226445490853727) {
            p = WekaClassifier.N6a0e16c456(i);
        } else if (((Double) i[1]).doubleValue() > -19.226445490853727) {
            p = WekaClassifier.N1af93755265(i);
        }
        return p;
    }
    static double N6a0e16c456(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= -30.05677382191799) {
            p = WekaClassifier.N6b3044a557(i);
        } else if (((Double) i[2]).doubleValue() > -30.05677382191799) {
            p = WekaClassifier.N7a57eedd197(i);
        }
        return p;
    }
    static double N6b3044a557(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 1;
        } else if (((Double) i[6]).doubleValue() <= -24.1331716245229) {
            p = WekaClassifier.N1ddae74158(i);
        } else if (((Double) i[6]).doubleValue() > -24.1331716245229) {
            p = WekaClassifier.Na297c43191(i);
        }
        return p;
    }
    static double N1ddae74158(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= -31.010401849581857) {
            p = WekaClassifier.N21f1f58d59(i);
        } else if (((Double) i[3]).doubleValue() > -31.010401849581857) {
            p = WekaClassifier.N1817be13107(i);
        }
        return p;
    }
    static double N21f1f58d59(Object []i) {
        double p = Double.NaN;
        if (i[16] == null) {
            p = 1;
        } else if (((Double) i[16]).doubleValue() <= -29.411716231622464) {
            p = WekaClassifier.N3bd37f4160(i);
        } else if (((Double) i[16]).doubleValue() > -29.411716231622464) {
            p = WekaClassifier.N73d0eb7106(i);
        }
        return p;
    }
    static double N3bd37f4160(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -0.17010693637816132) {
            p = WekaClassifier.N522f11f261(i);
        } else if (((Double) i[0]).doubleValue() > -0.17010693637816132) {
            p = WekaClassifier.N36a1120099(i);
        }
        return p;
    }
    static double N522f11f261(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -1.3907968835569235) {
            p = WekaClassifier.N1885141962(i);
        } else if (((Double) i[0]).doubleValue() > -1.3907968835569235) {
            p = WekaClassifier.N49af945987(i);
        }
        return p;
    }
    static double N1885141962(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -2.781645062522273) {
            p = WekaClassifier.N3676d71963(i);
        } else if (((Double) i[0]).doubleValue() > -2.781645062522273) {
            p = WekaClassifier.N53a96c6e76(i);
        }
        return p;
    }
    static double N3676d71963(Object []i) {
        double p = Double.NaN;
        if (i[16] == null) {
            p = 1;
        } else if (((Double) i[16]).doubleValue() <= -35.28059339732684) {
            p = WekaClassifier.N167f9fe164(i);
        } else if (((Double) i[16]).doubleValue() > -35.28059339732684) {
            p = WekaClassifier.N793cd73270(i);
        }
        return p;
    }
    static double N167f9fe164(Object []i) {
        double p = Double.NaN;
        if (i[15] == null) {
            p = 1;
        } else if (((Double) i[15]).doubleValue() <= -36.33992129110841) {
            p = 1;
        } else if (((Double) i[15]).doubleValue() > -36.33992129110841) {
            p = WekaClassifier.N3cf5ac5d65(i);
        }
        return p;
    }
    static double N3cf5ac5d65(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= -19.369030310233157) {
            p = WekaClassifier.Nce0420666(i);
        } else if (((Double) i[1]).doubleValue() > -19.369030310233157) {
            p = 0;
        }
        return p;
    }
    static double Nce0420666(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -5.9452542758116635) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > -5.9452542758116635) {
            p = WekaClassifier.Nc2e829c67(i);
        }
        return p;
    }
    static double Nc2e829c67(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= -30.047580428106208) {
            p = WekaClassifier.N66c4846f68(i);
        } else if (((Double) i[4]).doubleValue() > -30.047580428106208) {
            p = 1;
        }
        return p;
    }
    static double N66c4846f68(Object []i) {
        double p = Double.NaN;
        if (i[17] == null) {
            p = 0;
        } else if (((Double) i[17]).doubleValue() <= -39.891607164176634) {
            p = 0;
        } else if (((Double) i[17]).doubleValue() > -39.891607164176634) {
            p = WekaClassifier.N77424bae69(i);
        }
        return p;
    }
    static double N77424bae69(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() <= -33.97379034143708) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() > -33.97379034143708) {
            p = 0;
        }
        return p;
    }
    static double N793cd73270(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() <= -39.82634805025302) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() > -39.82634805025302) {
            p = WekaClassifier.N1fe80eb71(i);
        }
        return p;
    }
    static double N1fe80eb71(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 0;
        } else if (((Double) i[5]).doubleValue() <= -30.72515191352971) {
            p = WekaClassifier.N43db8b4772(i);
        } else if (((Double) i[5]).doubleValue() > -30.72515191352971) {
            p = 1;
        }
        return p;
    }
    static double N43db8b4772(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 1;
        } else if (((Double) i[11]).doubleValue() <= -42.8887553561007) {
            p = 1;
        } else if (((Double) i[11]).doubleValue() > -42.8887553561007) {
            p = WekaClassifier.N2621a7a973(i);
        }
        return p;
    }
    static double N2621a7a973(Object []i) {
        double p = Double.NaN;
        if (i[17] == null) {
            p = 0;
        } else if (((Double) i[17]).doubleValue() <= -31.71393458639171) {
            p = WekaClassifier.N393b711874(i);
        } else if (((Double) i[17]).doubleValue() > -31.71393458639171) {
            p = 1;
        }
        return p;
    }
    static double N393b711874(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 0;
        } else if (((Double) i[5]).doubleValue() <= -43.47035649256663) {
            p = WekaClassifier.N4cb7570c75(i);
        } else if (((Double) i[5]).doubleValue() > -43.47035649256663) {
            p = 0;
        }
        return p;
    }
    static double N4cb7570c75(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= -33.40035010975082) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() > -33.40035010975082) {
            p = 0;
        }
        return p;
    }
    static double N53a96c6e76(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() <= -47.421099183829256) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() > -47.421099183829256) {
            p = WekaClassifier.N781e855d77(i);
        }
        return p;
    }
    static double N781e855d77(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() <= -37.521030253429124) {
            p = WekaClassifier.N1a4f88f778(i);
        } else if (((Double) i[10]).doubleValue() > -37.521030253429124) {
            p = WekaClassifier.N7f6718c86(i);
        }
        return p;
    }
    static double N1a4f88f778(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 0;
        } else if (((Double) i[5]).doubleValue() <= -28.24062965713191) {
            p = WekaClassifier.N6cb6a38579(i);
        } else if (((Double) i[5]).doubleValue() > -28.24062965713191) {
            p = 1;
        }
        return p;
    }
    static double N6cb6a38579(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= -36.94212524613693) {
            p = WekaClassifier.N74e4786180(i);
        } else if (((Double) i[2]).doubleValue() > -36.94212524613693) {
            p = WekaClassifier.N1eb2080182(i);
        }
        return p;
    }
    static double N74e4786180(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() <= -35.75658454736238) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() > -35.75658454736238) {
            p = WekaClassifier.N785c3fcd81(i);
        }
        return p;
    }
    static double N785c3fcd81(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 0;
        } else if (((Double) i[14]).doubleValue() <= -40.169861089753184) {
            p = 0;
        } else if (((Double) i[14]).doubleValue() > -40.169861089753184) {
            p = 1;
        }
        return p;
    }
    static double N1eb2080182(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() <= -41.17639771213963) {
            p = WekaClassifier.N47c13ad983(i);
        } else if (((Double) i[10]).doubleValue() > -41.17639771213963) {
            p = 1;
        }
        return p;
    }
    static double N47c13ad983(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= -33.4785896976793) {
            p = WekaClassifier.N1031653084(i);
        } else if (((Double) i[3]).doubleValue() > -33.4785896976793) {
            p = WekaClassifier.N90a82ac85(i);
        }
        return p;
    }
    static double N1031653084(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= -2.289710200286436) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() > -2.289710200286436) {
            p = 1;
        }
        return p;
    }
    static double N90a82ac85(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= -51.67145094393185) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() > -51.67145094393185) {
            p = 0;
        }
        return p;
    }
    static double N7f6718c86(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= -32.01913027252612) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() > -32.01913027252612) {
            p = 0;
        }
        return p;
    }
    static double N49af945987(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -0.5728274419413282) {
            p = WekaClassifier.N52ac60b988(i);
        } else if (((Double) i[0]).doubleValue() > -0.5728274419413282) {
            p = WekaClassifier.Ne18bba391(i);
        }
        return p;
    }
    static double N52ac60b988(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -1.0771753320574433) {
            p = WekaClassifier.Nfee97a289(i);
        } else if (((Double) i[0]).doubleValue() > -1.0771753320574433) {
            p = 1;
        }
        return p;
    }
    static double Nfee97a289(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= -37.334880662763624) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() > -37.334880662763624) {
            p = WekaClassifier.N3b20fdc290(i);
        }
        return p;
    }
    static double N3b20fdc290(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() <= -40.57633492257304) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() > -40.57633492257304) {
            p = 0;
        }
        return p;
    }
    static double Ne18bba391(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= -24.787300309759555) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() > -24.787300309759555) {
            p = WekaClassifier.N3f80ab7192(i);
        }
        return p;
    }
    static double N3f80ab7192(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= -37.75285952960296) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() > -37.75285952960296) {
            p = WekaClassifier.N44a868a493(i);
        }
        return p;
    }
    static double N44a868a493(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() <= -39.33659231596409) {
            p = WekaClassifier.N78da531e94(i);
        } else if (((Double) i[7]).doubleValue() > -39.33659231596409) {
            p = WekaClassifier.N33543a0595(i);
        }
        return p;
    }
    static double N78da531e94(Object []i) {
        double p = Double.NaN;
        if (i[17] == null) {
            p = 1;
        } else if (((Double) i[17]).doubleValue() <= -37.73684304254377) {
            p = 1;
        } else if (((Double) i[17]).doubleValue() > -37.73684304254377) {
            p = 0;
        }
        return p;
    }
    static double N33543a0595(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= -33.675065914741566) {
            p = WekaClassifier.N935c43d96(i);
        } else if (((Double) i[4]).doubleValue() > -33.675065914741566) {
            p = 1;
        }
        return p;
    }
    static double N935c43d96(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 0;
        } else if (((Double) i[14]).doubleValue() <= -37.349787100266525) {
            p = WekaClassifier.Ne5f70f797(i);
        } else if (((Double) i[14]).doubleValue() > -37.349787100266525) {
            p = 1;
        }
        return p;
    }
    static double Ne5f70f797(Object []i) {
        double p = Double.NaN;
        if (i[16] == null) {
            p = 0;
        } else if (((Double) i[16]).doubleValue() <= -39.38415729348553) {
            p = WekaClassifier.N24b7908198(i);
        } else if (((Double) i[16]).doubleValue() > -39.38415729348553) {
            p = 1;
        }
        return p;
    }
    static double N24b7908198(Object []i) {
        double p = Double.NaN;
        if (i[13] == null) {
            p = 1;
        } else if (((Double) i[13]).doubleValue() <= -61.325503246236174) {
            p = 1;
        } else if (((Double) i[13]).doubleValue() > -61.325503246236174) {
            p = 0;
        }
        return p;
    }
    static double N36a1120099(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() <= -43.50291188213241) {
            p = WekaClassifier.N11922cc5100(i);
        } else if (((Double) i[7]).doubleValue() > -43.50291188213241) {
            p = WekaClassifier.N64bf3ec8101(i);
        }
        return p;
    }
    static double N11922cc5100(Object []i) {
        double p = Double.NaN;
        if (i[18] == null) {
            p = 1;
        } else if (((Double) i[18]).doubleValue() <= -41.383987406811436) {
            p = 1;
        } else if (((Double) i[18]).doubleValue() > -41.383987406811436) {
            p = 0;
        }
        return p;
    }
    static double N64bf3ec8101(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 0;
        } else if (((Double) i[14]).doubleValue() <= -34.32677057500284) {
            p = WekaClassifier.N7c948946102(i);
        } else if (((Double) i[14]).doubleValue() > -34.32677057500284) {
            p = 1;
        }
        return p;
    }
    static double N7c948946102(Object []i) {
        double p = Double.NaN;
        if (i[19] == null) {
            p = 0;
        } else if (((Double) i[19]).doubleValue() <= -39.07937230669308) {
            p = WekaClassifier.N429bb5c6103(i);
        } else if (((Double) i[19]).doubleValue() > -39.07937230669308) {
            p = WekaClassifier.N5fbb62bf105(i);
        }
        return p;
    }
    static double N429bb5c6103(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= -37.241565942403426) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() > -37.241565942403426) {
            p = WekaClassifier.N42ef5d54104(i);
        }
        return p;
    }
    static double N42ef5d54104(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -0.13041144698566143) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > -0.13041144698566143) {
            p = 0;
        }
        return p;
    }
    static double N5fbb62bf105(Object []i) {
        double p = Double.NaN;
        if (i[16] == null) {
            p = 0;
        } else if (((Double) i[16]).doubleValue() <= -43.74598790164281) {
            p = 0;
        } else if (((Double) i[16]).doubleValue() > -43.74598790164281) {
            p = 1;
        }
        return p;
    }
    static double N73d0eb7106(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= -2.21965147282269) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() > -2.21965147282269) {
            p = 1;
        }
        return p;
    }
    static double N1817be13107(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= -31.674247796360024) {
            p = WekaClassifier.N202a45b8108(i);
        } else if (((Double) i[4]).doubleValue() > -31.674247796360024) {
            p = WekaClassifier.N124e3b8e181(i);
        }
        return p;
    }
    static double N202a45b8108(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -6.958344588430435) {
            p = WekaClassifier.N24007598109(i);
        } else if (((Double) i[0]).doubleValue() > -6.958344588430435) {
            p = WekaClassifier.N6ee55758111(i);
        }
        return p;
    }
    static double N24007598109(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= -22.15833533055281) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() > -22.15833533055281) {
            p = WekaClassifier.N4ba79f19110(i);
        }
        return p;
    }
    static double N4ba79f19110(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= -31.568152268364035) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() > -31.568152268364035) {
            p = 0;
        }
        return p;
    }
    static double N6ee55758111(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() <= -34.309172056714786) {
            p = WekaClassifier.N1c90c8b9112(i);
        } else if (((Double) i[10]).doubleValue() > -34.309172056714786) {
            p = WekaClassifier.N72af9fd7173(i);
        }
        return p;
    }
    static double N1c90c8b9112(Object []i) {
        double p = Double.NaN;
        if (i[15] == null) {
            p = 0;
        } else if (((Double) i[15]).doubleValue() <= -36.46967217045005) {
            p = WekaClassifier.N3b9bc206113(i);
        } else if (((Double) i[15]).doubleValue() > -36.46967217045005) {
            p = WekaClassifier.N6bf4089a160(i);
        }
        return p;
    }
    static double N3b9bc206113(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= -23.044190135044893) {
            p = WekaClassifier.N4cb3cd3b114(i);
        } else if (((Double) i[1]).doubleValue() > -23.044190135044893) {
            p = WekaClassifier.N410fb521120(i);
        }
        return p;
    }
    static double N4cb3cd3b114(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() <= -33.40119107063496) {
            p = WekaClassifier.N8280c62115(i);
        } else if (((Double) i[6]).doubleValue() > -33.40119107063496) {
            p = 1;
        }
        return p;
    }
    static double N8280c62115(Object []i) {
        double p = Double.NaN;
        if (i[13] == null) {
            p = 0;
        } else if (((Double) i[13]).doubleValue() <= -35.54483900574789) {
            p = WekaClassifier.N12e7c8de116(i);
        } else if (((Double) i[13]).doubleValue() > -35.54483900574789) {
            p = 1;
        }
        return p;
    }
    static double N12e7c8de116(Object []i) {
        double p = Double.NaN;
        if (i[16] == null) {
            p = 0;
        } else if (((Double) i[16]).doubleValue() <= -44.41079007815874) {
            p = 0;
        } else if (((Double) i[16]).doubleValue() > -44.41079007815874) {
            p = WekaClassifier.N7789a376117(i);
        }
        return p;
    }
    static double N7789a376117(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= -37.82716412850904) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() > -37.82716412850904) {
            p = WekaClassifier.N258162a9118(i);
        }
        return p;
    }
    static double N258162a9118(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= -33.62149488102338) {
            p = WekaClassifier.N6d022167119(i);
        } else if (((Double) i[2]).doubleValue() > -33.62149488102338) {
            p = 1;
        }
        return p;
    }
    static double N6d022167119(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() <= -40.20303687273696) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() > -40.20303687273696) {
            p = 1;
        }
        return p;
    }
    static double N410fb521120(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= -33.12849134293944) {
            p = WekaClassifier.N7ba72c65121(i);
        } else if (((Double) i[2]).doubleValue() > -33.12849134293944) {
            p = WekaClassifier.N162c4260145(i);
        }
        return p;
    }
    static double N7ba72c65121(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 0;
        } else if (((Double) i[9]).doubleValue() <= -34.43928992910659) {
            p = WekaClassifier.N559d8d92122(i);
        } else if (((Double) i[9]).doubleValue() > -34.43928992910659) {
            p = WekaClassifier.N1cf17b32139(i);
        }
        return p;
    }
    static double N559d8d92122(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= -2.827127897590209) {
            p = WekaClassifier.N29e8975f123(i);
        } else if (((Double) i[0]).doubleValue() > -2.827127897590209) {
            p = WekaClassifier.N77e72775129(i);
        }
        return p;
    }
    static double N29e8975f123(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= -23.726777472345432) {
            p = WekaClassifier.N15f289fe124(i);
        } else if (((Double) i[3]).doubleValue() > -23.726777472345432) {
            p = WekaClassifier.N3839db7127(i);
        }
        return p;
    }
    static double N15f289fe124(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() <= -37.68071894315291) {
            p = WekaClassifier.N57f45b21125(i);
        } else if (((Double) i[6]).doubleValue() > -37.68071894315291) {
            p = 1;
        }
        return p;
    }
    static double N57f45b21125(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -4.169388243392824) {
            p = WekaClassifier.N6ebcbd50126(i);
        } else if (((Double) i[0]).doubleValue() > -4.169388243392824) {
            p = 0;
        }
        return p;
    }
    static double N6ebcbd50126(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= -24.022735166795698) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() > -24.022735166795698) {
            p = 0;
        }
        return p;
    }
    static double N3839db7127(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() <= -33.66419346689314) {
            p = WekaClassifier.N23f4940128(i);
        } else if (((Double) i[8]).doubleValue() > -33.66419346689314) {
            p = 0;
        }
        return p;
    }
    static double N23f4940128(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= -5.4953497924963415) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() > -5.4953497924963415) {
            p = 1;
        }
        return p;
    }
    static double N77e72775129(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= -1.5656190374924677) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() > -1.5656190374924677) {
            p = WekaClassifier.N7cba42e4130(i);
        }
        return p;
    }
    static double N7cba42e4130(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() <= -29.33314399920102) {
            p = WekaClassifier.N634b06e1131(i);
        } else if (((Double) i[3]).doubleValue() > -29.33314399920102) {
            p = WekaClassifier.N6ac88a17136(i);
        }
        return p;
    }
    static double N634b06e1131(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() <= -44.92783237321947) {
            p = WekaClassifier.N1b462681132(i);
        } else if (((Double) i[10]).doubleValue() > -44.92783237321947) {
            p = WekaClassifier.N55d46613133(i);
        }
        return p;
    }
    static double N1b462681132(Object []i) {
        double p = Double.NaN;
        if (i[19] == null) {
            p = 0;
        } else if (((Double) i[19]).doubleValue() <= -38.68688997924711) {
            p = 0;
        } else if (((Double) i[19]).doubleValue() > -38.68688997924711) {
            p = 1;
        }
        return p;
    }
    static double N55d46613133(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() <= -30.794152713862935) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() > -30.794152713862935) {
            p = WekaClassifier.N7bd7b32f134(i);
        }
        return p;
    }
    static double N7bd7b32f134(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= -1.4653214145862137) {
            p = WekaClassifier.N4010ceba135(i);
        } else if (((Double) i[0]).doubleValue() > -1.4653214145862137) {
            p = 1;
        }
        return p;
    }
    static double N4010ceba135(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 1;
        } else if (((Double) i[6]).doubleValue() <= -40.72588637080686) {
            p = 1;
        } else if (((Double) i[6]).doubleValue() > -40.72588637080686) {
            p = 0;
        }
        return p;
    }
    static double N6ac88a17136(Object []i) {
        double p = Double.NaN;
        if (i[16] == null) {
            p = 0;
        } else if (((Double) i[16]).doubleValue() <= -52.47644830299063) {
            p = WekaClassifier.N1c5a9da3137(i);
        } else if (((Double) i[16]).doubleValue() > -52.47644830299063) {
            p = 0;
        }
        return p;
    }
    static double N1c5a9da3137(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() <= -49.251782784316816) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() > -49.251782784316816) {
            p = WekaClassifier.N5ad21bcc138(i);
        }
        return p;
    }
    static double N5ad21bcc138(Object []i) {
        double p = Double.NaN;
        if (i[15] == null) {
            p = 1;
        } else if (((Double) i[15]).doubleValue() <= -42.571320316246634) {
            p = 1;
        } else if (((Double) i[15]).doubleValue() > -42.571320316246634) {
            p = 0;
        }
        return p;
    }
    static double N1cf17b32139(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 0;
        } else if (((Double) i[11]).doubleValue() <= -34.995959244215136) {
            p = WekaClassifier.N3247c289140(i);
        } else if (((Double) i[11]).doubleValue() > -34.995959244215136) {
            p = 1;
        }
        return p;
    }
    static double N3247c289140(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 1;
        } else if (((Double) i[12]).doubleValue() <= -66.35778707749826) {
            p = 1;
        } else if (((Double) i[12]).doubleValue() > -66.35778707749826) {
            p = WekaClassifier.N7a38e6e7141(i);
        }
        return p;
    }
    static double N7a38e6e7141(Object []i) {
        double p = Double.NaN;
        if (i[15] == null) {
            p = 0;
        } else if (((Double) i[15]).doubleValue() <= -47.1302139743782) {
            p = 0;
        } else if (((Double) i[15]).doubleValue() > -47.1302139743782) {
            p = WekaClassifier.N307e9e17142(i);
        }
        return p;
    }
    static double N307e9e17142(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= -47.53932358551441) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() > -47.53932358551441) {
            p = WekaClassifier.N27415bc1143(i);
        }
        return p;
    }
    static double N27415bc1143(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= -0.4732568622626374) {
            p = WekaClassifier.N2b9e862a144(i);
        } else if (((Double) i[0]).doubleValue() > -0.4732568622626374) {
            p = 1;
        }
        return p;
    }
    static double N2b9e862a144(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() <= -25.712219589136527) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() > -25.712219589136527) {
            p = 1;
        }
        return p;
    }
    static double N162c4260145(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= -20.45721688507338) {
            p = WekaClassifier.N5266e894146(i);
        } else if (((Double) i[1]).doubleValue() > -20.45721688507338) {
            p = WekaClassifier.N17733261156(i);
        }
        return p;
    }
    static double N5266e894146(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= -43.54500340644032) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() > -43.54500340644032) {
            p = WekaClassifier.N7fd43e4a147(i);
        }
        return p;
    }
    static double N7fd43e4a147(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -2.612090550721156) {
            p = WekaClassifier.N2024584c148(i);
        } else if (((Double) i[0]).doubleValue() > -2.612090550721156) {
            p = WekaClassifier.N6fd00f2a151(i);
        }
        return p;
    }
    static double N2024584c148(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= -21.107435146162068) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() > -21.107435146162068) {
            p = WekaClassifier.N546f316a149(i);
        }
        return p;
    }
    static double N546f316a149(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 0;
        } else if (((Double) i[12]).doubleValue() <= -57.11398067505615) {
            p = 0;
        } else if (((Double) i[12]).doubleValue() > -57.11398067505615) {
            p = WekaClassifier.N31a8413b150(i);
        }
        return p;
    }
    static double N31a8413b150(Object []i) {
        double p = Double.NaN;
        if (i[19] == null) {
            p = 0;
        } else if (((Double) i[19]).doubleValue() <= -50.59498478381455) {
            p = 0;
        } else if (((Double) i[19]).doubleValue() > -50.59498478381455) {
            p = 1;
        }
        return p;
    }
    static double N6fd00f2a151(Object []i) {
        double p = Double.NaN;
        if (i[13] == null) {
            p = 0;
        } else if (((Double) i[13]).doubleValue() <= -35.956878685398806) {
            p = WekaClassifier.N6db4dca4152(i);
        } else if (((Double) i[13]).doubleValue() > -35.956878685398806) {
            p = 1;
        }
        return p;
    }
    static double N6db4dca4152(Object []i) {
        double p = Double.NaN;
        if (i[15] == null) {
            p = 0;
        } else if (((Double) i[15]).doubleValue() <= -37.321987836462654) {
            p = WekaClassifier.N40fd4419153(i);
        } else if (((Double) i[15]).doubleValue() > -37.321987836462654) {
            p = 1;
        }
        return p;
    }
    static double N40fd4419153(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() <= -35.47070966948589) {
            p = WekaClassifier.N332f74a4154(i);
        } else if (((Double) i[8]).doubleValue() > -35.47070966948589) {
            p = 1;
        }
        return p;
    }
    static double N332f74a4154(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() <= -35.59793730796321) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() > -35.59793730796321) {
            p = WekaClassifier.N5c6984b4155(i);
        }
        return p;
    }
    static double N5c6984b4155(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 1;
        } else if (((Double) i[11]).doubleValue() <= -39.51905075023954) {
            p = 1;
        } else if (((Double) i[11]).doubleValue() > -39.51905075023954) {
            p = 0;
        }
        return p;
    }
    static double N17733261156(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 1;
        } else if (((Double) i[11]).doubleValue() <= -45.87292801676902) {
            p = WekaClassifier.N3d04711a157(i);
        } else if (((Double) i[11]).doubleValue() > -45.87292801676902) {
            p = WekaClassifier.N75c6a84a158(i);
        }
        return p;
    }
    static double N3d04711a157(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() <= -36.09403254426755) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() > -36.09403254426755) {
            p = 1;
        }
        return p;
    }
    static double N75c6a84a158(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 0;
        } else if (((Double) i[12]).doubleValue() <= -41.024372076118134) {
            p = 0;
        } else if (((Double) i[12]).doubleValue() > -41.024372076118134) {
            p = WekaClassifier.N651ace62159(i);
        }
        return p;
    }
    static double N651ace62159(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= -35.01625844045978) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() > -35.01625844045978) {
            p = 1;
        }
        return p;
    }
    static double N6bf4089a160(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= -23.633335174661035) {
            p = WekaClassifier.N7566385f161(i);
        } else if (((Double) i[5]).doubleValue() > -23.633335174661035) {
            p = 0;
        }
        return p;
    }
    static double N7566385f161(Object []i) {
        double p = Double.NaN;
        if (i[18] == null) {
            p = 0;
        } else if (((Double) i[18]).doubleValue() <= -48.286024914570845) {
            p = WekaClassifier.N35a25a41162(i);
        } else if (((Double) i[18]).doubleValue() > -48.286024914570845) {
            p = WekaClassifier.N6fd759f8167(i);
        }
        return p;
    }
    static double N35a25a41162(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= -22.353523848586747) {
            p = WekaClassifier.N6f8fb49163(i);
        } else if (((Double) i[1]).doubleValue() > -22.353523848586747) {
            p = WekaClassifier.N963feeb165(i);
        }
        return p;
    }
    static double N6f8fb49163(Object []i) {
        double p = Double.NaN;
        if (i[15] == null) {
            p = 0;
        } else if (((Double) i[15]).doubleValue() <= -35.32478028071879) {
            p = WekaClassifier.N4d0383d4164(i);
        } else if (((Double) i[15]).doubleValue() > -35.32478028071879) {
            p = 1;
        }
        return p;
    }
    static double N4d0383d4164(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= -25.994471677821902) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() > -25.994471677821902) {
            p = 0;
        }
        return p;
    }
    static double N963feeb165(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= -31.508571449107272) {
            p = WekaClassifier.N2eb4ddd4166(i);
        } else if (((Double) i[2]).doubleValue() > -31.508571449107272) {
            p = 1;
        }
        return p;
    }
    static double N2eb4ddd4166(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -3.5111772093008398) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > -3.5111772093008398) {
            p = 0;
        }
        return p;
    }
    static double N6fd759f8167(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= -22.047218162572193) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() > -22.047218162572193) {
            p = WekaClassifier.N3e1b7af5168(i);
        }
        return p;
    }
    static double N3e1b7af5168(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= -44.13339049282208) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() > -44.13339049282208) {
            p = WekaClassifier.N28994f7b169(i);
        }
        return p;
    }
    static double N28994f7b169(Object []i) {
        double p = Double.NaN;
        if (i[18] == null) {
            p = 1;
        } else if (((Double) i[18]).doubleValue() <= -43.61054727581512) {
            p = 1;
        } else if (((Double) i[18]).doubleValue() > -43.61054727581512) {
            p = WekaClassifier.N20cb6dc1170(i);
        }
        return p;
    }
    static double N20cb6dc1170(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= -34.66791911531556) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() > -34.66791911531556) {
            p = WekaClassifier.N7586e8b9171(i);
        }
        return p;
    }
    static double N7586e8b9171(Object []i) {
        double p = Double.NaN;
        if (i[19] == null) {
            p = 0;
        } else if (((Double) i[19]).doubleValue() <= -35.86793785521263) {
            p = WekaClassifier.N10aff82e172(i);
        } else if (((Double) i[19]).doubleValue() > -35.86793785521263) {
            p = 1;
        }
        return p;
    }
    static double N10aff82e172(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() <= -35.84201181436188) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() > -35.84201181436188) {
            p = 1;
        }
        return p;
    }
    static double N72af9fd7173(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= -24.40518782743076) {
            p = WekaClassifier.N9715126174(i);
        } else if (((Double) i[5]).doubleValue() > -24.40518782743076) {
            p = 0;
        }
        return p;
    }
    static double N9715126174(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= -18.090615793975903) {
            p = WekaClassifier.N4bf0b391175(i);
        } else if (((Double) i[3]).doubleValue() > -18.090615793975903) {
            p = 0;
        }
        return p;
    }
    static double N4bf0b391175(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= -6.375558914042948) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() > -6.375558914042948) {
            p = WekaClassifier.N24715c49176(i);
        }
        return p;
    }
    static double N24715c49176(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= -32.952286558522324) {
            p = WekaClassifier.N2a2e3e37177(i);
        } else if (((Double) i[2]).doubleValue() > -32.952286558522324) {
            p = 1;
        }
        return p;
    }
    static double N2a2e3e37177(Object []i) {
        double p = Double.NaN;
        if (i[17] == null) {
            p = 1;
        } else if (((Double) i[17]).doubleValue() <= -38.375327391778185) {
            p = WekaClassifier.N2955b235178(i);
        } else if (((Double) i[17]).doubleValue() > -38.375327391778185) {
            p = 1;
        }
        return p;
    }
    static double N2955b235178(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= -28.198166553425843) {
            p = WekaClassifier.N67f7e0b5179(i);
        } else if (((Double) i[5]).doubleValue() > -28.198166553425843) {
            p = 0;
        }
        return p;
    }
    static double N67f7e0b5179(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() <= -32.673921502672165) {
            p = WekaClassifier.N494a7b16180(i);
        } else if (((Double) i[10]).doubleValue() > -32.673921502672165) {
            p = 1;
        }
        return p;
    }
    static double N494a7b16180(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= -42.733157833891255) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() > -42.733157833891255) {
            p = 1;
        }
        return p;
    }
    static double N124e3b8e181(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= -20.902603379014696) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() > -20.902603379014696) {
            p = WekaClassifier.N160ee7e8182(i);
        }
        return p;
    }
    static double N160ee7e8182(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= -1.4034185543341522) {
            p = WekaClassifier.N4ea44fd4183(i);
        } else if (((Double) i[0]).doubleValue() > -1.4034185543341522) {
            p = WekaClassifier.N573d5d5c189(i);
        }
        return p;
    }
    static double N4ea44fd4183(Object []i) {
        double p = Double.NaN;
        if (i[13] == null) {
            p = 0;
        } else if (((Double) i[13]).doubleValue() <= -38.6822196694688) {
            p = WekaClassifier.N54ac0fdd184(i);
        } else if (((Double) i[13]).doubleValue() > -38.6822196694688) {
            p = WekaClassifier.Ne5d51ae188(i);
        }
        return p;
    }
    static double N54ac0fdd184(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() <= -38.58701734577248) {
            p = WekaClassifier.N375ddc8d185(i);
        } else if (((Double) i[10]).doubleValue() > -38.58701734577248) {
            p = WekaClassifier.N3abb63c3187(i);
        }
        return p;
    }
    static double N375ddc8d185(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= -38.67946899384967) {
            p = WekaClassifier.N568d4c29186(i);
        } else if (((Double) i[5]).doubleValue() > -38.67946899384967) {
            p = 0;
        }
        return p;
    }
    static double N568d4c29186(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= -19.889191191653218) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() > -19.889191191653218) {
            p = 1;
        }
        return p;
    }
    static double N3abb63c3187(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= -20.147107337957365) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() > -20.147107337957365) {
            p = 1;
        }
        return p;
    }
    static double Ne5d51ae188(Object []i) {
        double p = Double.NaN;
        if (i[17] == null) {
            p = 0;
        } else if (((Double) i[17]).doubleValue() <= -45.628028955441785) {
            p = 0;
        } else if (((Double) i[17]).doubleValue() > -45.628028955441785) {
            p = 1;
        }
        return p;
    }
    static double N573d5d5c189(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() <= -48.226900205531) {
            p = WekaClassifier.N6b6daf96190(i);
        } else if (((Double) i[8]).doubleValue() > -48.226900205531) {
            p = 1;
        }
        return p;
    }
    static double N6b6daf96190(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 0;
        } else if (((Double) i[9]).doubleValue() <= -38.871828477078324) {
            p = 0;
        } else if (((Double) i[9]).doubleValue() > -38.871828477078324) {
            p = 1;
        }
        return p;
    }
    static double Na297c43191(Object []i) {
        double p = Double.NaN;
        if (i[16] == null) {
            p = 1;
        } else if (((Double) i[16]).doubleValue() <= -30.1780605995496) {
            p = WekaClassifier.N6e1d9c89192(i);
        } else if (((Double) i[16]).doubleValue() > -30.1780605995496) {
            p = 0;
        }
        return p;
    }
    static double N6e1d9c89192(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() <= -23.779518098556323) {
            p = WekaClassifier.N53f7fbab193(i);
        } else if (((Double) i[4]).doubleValue() > -23.779518098556323) {
            p = WekaClassifier.N16916507196(i);
        }
        return p;
    }
    static double N53f7fbab193(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= -34.49334903739938) {
            p = WekaClassifier.N55e0ff5c194(i);
        } else if (((Double) i[9]).doubleValue() > -34.49334903739938) {
            p = 0;
        }
        return p;
    }
    static double N55e0ff5c194(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() <= -23.897831818274547) {
            p = WekaClassifier.N14ea5ac7195(i);
        } else if (((Double) i[6]).doubleValue() > -23.897831818274547) {
            p = 1;
        }
        return p;
    }
    static double N14ea5ac7195(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= -38.28421056644174) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() > -38.28421056644174) {
            p = 0;
        }
        return p;
    }
    static double N16916507196(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= -4.584642401098932) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() > -4.584642401098932) {
            p = 1;
        }
        return p;
    }
    static double N7a57eedd197(Object []i) {
        double p = Double.NaN;
        if (i[16] == null) {
            p = 1;
        } else if (((Double) i[16]).doubleValue() <= -29.90633289339461) {
            p = WekaClassifier.N281ff4d4198(i);
        } else if (((Double) i[16]).doubleValue() > -29.90633289339461) {
            p = WekaClassifier.N1176857e260(i);
        }
        return p;
    }
    static double N281ff4d4198(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -0.002914291076031361) {
            p = WekaClassifier.N6ee5bf72199(i);
        } else if (((Double) i[0]).doubleValue() > -0.002914291076031361) {
            p = WekaClassifier.N2aa669bd256(i);
        }
        return p;
    }
    static double N6ee5bf72199(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() <= -29.262425756010366) {
            p = WekaClassifier.N73c156f4200(i);
        } else if (((Double) i[10]).doubleValue() > -29.262425756010366) {
            p = WekaClassifier.N3a019129247(i);
        }
        return p;
    }
    static double N73c156f4200(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 1;
        } else if (((Double) i[6]).doubleValue() <= -26.151058504419616) {
            p = WekaClassifier.N36a56f57201(i);
        } else if (((Double) i[6]).doubleValue() > -26.151058504419616) {
            p = WekaClassifier.N26219a1d241(i);
        }
        return p;
    }
    static double N36a56f57201(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= -25.778531270904317) {
            p = WekaClassifier.N614b9403202(i);
        } else if (((Double) i[5]).doubleValue() > -25.778531270904317) {
            p = WekaClassifier.Na71c240236(i);
        }
        return p;
    }
    static double N614b9403202(Object []i) {
        double p = Double.NaN;
        if (i[17] == null) {
            p = 1;
        } else if (((Double) i[17]).doubleValue() <= -35.457027253735255) {
            p = WekaClassifier.N2216b977203(i);
        } else if (((Double) i[17]).doubleValue() > -35.457027253735255) {
            p = 1;
        }
        return p;
    }
    static double N2216b977203(Object []i) {
        double p = Double.NaN;
        if (i[15] == null) {
            p = 1;
        } else if (((Double) i[15]).doubleValue() <= -65.56461486330925) {
            p = WekaClassifier.N5b992d37204(i);
        } else if (((Double) i[15]).doubleValue() > -65.56461486330925) {
            p = WekaClassifier.N619756b3209(i);
        }
        return p;
    }
    static double N5b992d37204(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= -24.259789947134394) {
            p = WekaClassifier.N46db2ec4205(i);
        } else if (((Double) i[3]).doubleValue() > -24.259789947134394) {
            p = 0;
        }
        return p;
    }
    static double N46db2ec4205(Object []i) {
        double p = Double.NaN;
        if (i[17] == null) {
            p = 1;
        } else if (((Double) i[17]).doubleValue() <= -43.343619528081966) {
            p = 1;
        } else if (((Double) i[17]).doubleValue() > -43.343619528081966) {
            p = WekaClassifier.N7b8d5190206(i);
        }
        return p;
    }
    static double N7b8d5190206(Object []i) {
        double p = Double.NaN;
        if (i[13] == null) {
            p = 1;
        } else if (((Double) i[13]).doubleValue() <= -39.58485213232736) {
            p = WekaClassifier.N6c478297207(i);
        } else if (((Double) i[13]).doubleValue() > -39.58485213232736) {
            p = 0;
        }
        return p;
    }
    static double N6c478297207(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= -0.2340437693622377) {
            p = WekaClassifier.N7e25eabd208(i);
        } else if (((Double) i[0]).doubleValue() > -0.2340437693622377) {
            p = 1;
        }
        return p;
    }
    static double N7e25eabd208(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= -28.262233921046654) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() > -28.262233921046654) {
            p = 0;
        }
        return p;
    }
    static double N619756b3209(Object []i) {
        double p = Double.NaN;
        if (i[19] == null) {
            p = 1;
        } else if (((Double) i[19]).doubleValue() <= -39.62165693927857) {
            p = WekaClassifier.N70879ac0210(i);
        } else if (((Double) i[19]).doubleValue() > -39.62165693927857) {
            p = 1;
        }
        return p;
    }
    static double N70879ac0210(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= -20.214201309748233) {
            p = WekaClassifier.N2084ed7d211(i);
        } else if (((Double) i[1]).doubleValue() > -20.214201309748233) {
            p = WekaClassifier.N6cb1bf57226(i);
        }
        return p;
    }
    static double N2084ed7d211(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 1;
        } else if (((Double) i[12]).doubleValue() <= -38.45597626458307) {
            p = WekaClassifier.N71258bd2212(i);
        } else if (((Double) i[12]).doubleValue() > -38.45597626458307) {
            p = 1;
        }
        return p;
    }
    static double N71258bd2212(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= -31.421806926303475) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() > -31.421806926303475) {
            p = WekaClassifier.N2a5c698b213(i);
        }
        return p;
    }
    static double N2a5c698b213(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= -26.745518421009074) {
            p = WekaClassifier.N66c1a79a214(i);
        } else if (((Double) i[2]).doubleValue() > -26.745518421009074) {
            p = 1;
        }
        return p;
    }
    static double N66c1a79a214(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() <= -36.29377523031141) {
            p = WekaClassifier.N61a9513a215(i);
        } else if (((Double) i[10]).doubleValue() > -36.29377523031141) {
            p = 1;
        }
        return p;
    }
    static double N61a9513a215(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 1;
        } else if (((Double) i[11]).doubleValue() <= -41.393246180690284) {
            p = WekaClassifier.N3c8f3dc6216(i);
        } else if (((Double) i[11]).doubleValue() > -41.393246180690284) {
            p = WekaClassifier.N354b2dd9219(i);
        }
        return p;
    }
    static double N3c8f3dc6216(Object []i) {
        double p = Double.NaN;
        if (i[17] == null) {
            p = 1;
        } else if (((Double) i[17]).doubleValue() <= -43.13614935562613) {
            p = 1;
        } else if (((Double) i[17]).doubleValue() > -43.13614935562613) {
            p = WekaClassifier.N75561bed217(i);
        }
        return p;
    }
    static double N75561bed217(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= -23.726794262133566) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() > -23.726794262133566) {
            p = WekaClassifier.N1e408faa218(i);
        }
        return p;
    }
    static double N1e408faa218(Object []i) {
        double p = Double.NaN;
        if (i[19] == null) {
            p = 1;
        } else if (((Double) i[19]).doubleValue() <= -47.8215768370025) {
            p = 1;
        } else if (((Double) i[19]).doubleValue() > -47.8215768370025) {
            p = 0;
        }
        return p;
    }
    static double N354b2dd9219(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -0.2839944160817325) {
            p = WekaClassifier.N706f47bb220(i);
        } else if (((Double) i[0]).doubleValue() > -0.2839944160817325) {
            p = WekaClassifier.N49955778224(i);
        }
        return p;
    }
    static double N706f47bb220(Object []i) {
        double p = Double.NaN;
        if (i[15] == null) {
            p = 0;
        } else if (((Double) i[15]).doubleValue() <= -52.862522620254666) {
            p = 0;
        } else if (((Double) i[15]).doubleValue() > -52.862522620254666) {
            p = WekaClassifier.N35a3b328221(i);
        }
        return p;
    }
    static double N35a3b328221(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 0;
        } else if (((Double) i[12]).doubleValue() <= -49.96668670733749) {
            p = WekaClassifier.N2f8457e9222(i);
        } else if (((Double) i[12]).doubleValue() > -49.96668670733749) {
            p = WekaClassifier.N43cd9225223(i);
        }
        return p;
    }
    static double N2f8457e9222(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -2.9441292078395165) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > -2.9441292078395165) {
            p = 0;
        }
        return p;
    }
    static double N43cd9225223(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() <= -30.482453104855416) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() > -30.482453104855416) {
            p = 1;
        }
        return p;
    }
    static double N49955778224(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= -29.172400851943852) {
            p = WekaClassifier.N61879791225(i);
        } else if (((Double) i[2]).doubleValue() > -29.172400851943852) {
            p = 0;
        }
        return p;
    }
    static double N61879791225(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= -34.79893780783982) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() > -34.79893780783982) {
            p = 1;
        }
        return p;
    }
    static double N6cb1bf57226(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -2.1957289958661406) {
            p = WekaClassifier.N43c2545e227(i);
        } else if (((Double) i[0]).doubleValue() > -2.1957289958661406) {
            p = 1;
        }
        return p;
    }
    static double N43c2545e227(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -3.7506131112068317) {
            p = WekaClassifier.N200fe5c9228(i);
        } else if (((Double) i[0]).doubleValue() > -3.7506131112068317) {
            p = WekaClassifier.N217cf0e1233(i);
        }
        return p;
    }
    static double N200fe5c9228(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 1;
        } else if (((Double) i[14]).doubleValue() <= -32.000808680298746) {
            p = WekaClassifier.N7d69d546229(i);
        } else if (((Double) i[14]).doubleValue() > -32.000808680298746) {
            p = WekaClassifier.N120cc403232(i);
        }
        return p;
    }
    static double N7d69d546229(Object []i) {
        double p = Double.NaN;
        if (i[13] == null) {
            p = 1;
        } else if (((Double) i[13]).doubleValue() <= -37.9871181963269) {
            p = 1;
        } else if (((Double) i[13]).doubleValue() > -37.9871181963269) {
            p = WekaClassifier.N1cc386bb230(i);
        }
        return p;
    }
    static double N1cc386bb230(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() <= -31.26529029337342) {
            p = WekaClassifier.N4df241d9231(i);
        } else if (((Double) i[10]).doubleValue() > -31.26529029337342) {
            p = 0;
        }
        return p;
    }
    static double N4df241d9231(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() <= -56.31049166307857) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() > -56.31049166307857) {
            p = 1;
        }
        return p;
    }
    static double N120cc403232(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= -20.01508860966009) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() > -20.01508860966009) {
            p = 0;
        }
        return p;
    }
    static double N217cf0e1233(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= -3.142964458112523) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() > -3.142964458112523) {
            p = WekaClassifier.N218a5c2b234(i);
        }
        return p;
    }
    static double N218a5c2b234(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 0;
        } else if (((Double) i[5]).doubleValue() <= -32.00085779528759) {
            p = WekaClassifier.N7ea92d4a235(i);
        } else if (((Double) i[5]).doubleValue() > -32.00085779528759) {
            p = 1;
        }
        return p;
    }
    static double N7ea92d4a235(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= -19.758998422835603) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() > -19.758998422835603) {
            p = 0;
        }
        return p;
    }
    static double Na71c240236(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= -24.368900306805358) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() > -24.368900306805358) {
            p = WekaClassifier.N4c4cc017237(i);
        }
        return p;
    }
    static double N4c4cc017237(Object []i) {
        double p = Double.NaN;
        if (i[17] == null) {
            p = 0;
        } else if (((Double) i[17]).doubleValue() <= -33.48121603500324) {
            p = WekaClassifier.N3f54b6b1238(i);
        } else if (((Double) i[17]).doubleValue() > -33.48121603500324) {
            p = 1;
        }
        return p;
    }
    static double N3f54b6b1238(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 1;
        } else if (((Double) i[8]).doubleValue() <= -35.63103635389368) {
            p = 1;
        } else if (((Double) i[8]).doubleValue() > -35.63103635389368) {
            p = WekaClassifier.N8201f6c239(i);
        }
        return p;
    }
    static double N8201f6c239(Object []i) {
        double p = Double.NaN;
        if (i[17] == null) {
            p = 1;
        } else if (((Double) i[17]).doubleValue() <= -47.11063318347753) {
            p = WekaClassifier.Ncc7bfea240(i);
        } else if (((Double) i[17]).doubleValue() > -47.11063318347753) {
            p = 0;
        }
        return p;
    }
    static double Ncc7bfea240(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= -27.219151530105087) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() > -27.219151530105087) {
            p = 1;
        }
        return p;
    }
    static double N26219a1d241(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 0;
        } else if (((Double) i[7]).doubleValue() <= -39.6489670957624) {
            p = WekaClassifier.N3cda4156242(i);
        } else if (((Double) i[7]).doubleValue() > -39.6489670957624) {
            p = WekaClassifier.N2f5ba085245(i);
        }
        return p;
    }
    static double N3cda4156242(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() <= -31.321459357916126) {
            p = WekaClassifier.N3409e2de243(i);
        } else if (((Double) i[8]).doubleValue() > -31.321459357916126) {
            p = 1;
        }
        return p;
    }
    static double N3409e2de243(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= -25.508518752155542) {
            p = WekaClassifier.N580335a244(i);
        } else if (((Double) i[4]).doubleValue() > -25.508518752155542) {
            p = 1;
        }
        return p;
    }
    static double N580335a244(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 0;
        } else if (((Double) i[5]).doubleValue() <= -30.79377492005733) {
            p = 0;
        } else if (((Double) i[5]).doubleValue() > -30.79377492005733) {
            p = 1;
        }
        return p;
    }
    static double N2f5ba085245(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= -49.66557940529729) {
            p = WekaClassifier.N416594c9246(i);
        } else if (((Double) i[9]).doubleValue() > -49.66557940529729) {
            p = 1;
        }
        return p;
    }
    static double N416594c9246(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= -29.3255950009909) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() > -29.3255950009909) {
            p = 1;
        }
        return p;
    }
    static double N3a019129247(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= -35.4648098759285) {
            p = WekaClassifier.N3e9f6fd0248(i);
        } else if (((Double) i[4]).doubleValue() > -35.4648098759285) {
            p = WekaClassifier.N17a2ec5e251(i);
        }
        return p;
    }
    static double N3e9f6fd0248(Object []i) {
        double p = Double.NaN;
        if (i[18] == null) {
            p = 0;
        } else if (((Double) i[18]).doubleValue() <= -32.130484876681805) {
            p = WekaClassifier.N4cb2af0e249(i);
        } else if (((Double) i[18]).doubleValue() > -32.130484876681805) {
            p = 1;
        }
        return p;
    }
    static double N4cb2af0e249(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 1;
        } else if (((Double) i[12]).doubleValue() <= -35.225219823351196) {
            p = WekaClassifier.N211ca98d250(i);
        } else if (((Double) i[12]).doubleValue() > -35.225219823351196) {
            p = 0;
        }
        return p;
    }
    static double N211ca98d250(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() <= -41.406014457248546) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() > -41.406014457248546) {
            p = 1;
        }
        return p;
    }
    static double N17a2ec5e251(Object []i) {
        double p = Double.NaN;
        if (i[15] == null) {
            p = 1;
        } else if (((Double) i[15]).doubleValue() <= -27.610684102736133) {
            p = WekaClassifier.N5206f095252(i);
        } else if (((Double) i[15]).doubleValue() > -27.610684102736133) {
            p = 0;
        }
        return p;
    }
    static double N5206f095252(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 1;
        } else if (((Double) i[12]).doubleValue() <= -27.920098885418717) {
            p = WekaClassifier.Nb95ff04253(i);
        } else if (((Double) i[12]).doubleValue() > -27.920098885418717) {
            p = WekaClassifier.N4fc1ba88255(i);
        }
        return p;
    }
    static double Nb95ff04253(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= -19.606063923674093) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() > -19.606063923674093) {
            p = WekaClassifier.N4f817f3a254(i);
        }
        return p;
    }
    static double N4f817f3a254(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= -6.958677964868073) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() > -6.958677964868073) {
            p = 1;
        }
        return p;
    }
    static double N4fc1ba88255(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() <= -29.14615596782321) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() > -29.14615596782321) {
            p = 1;
        }
        return p;
    }
    static double N2aa669bd256(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() <= -47.145733867147804) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() > -47.145733867147804) {
            p = WekaClassifier.Neefce32257(i);
        }
        return p;
    }
    static double Neefce32257(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= -24.08205322100153) {
            p = WekaClassifier.N4a53087a258(i);
        } else if (((Double) i[2]).doubleValue() > -24.08205322100153) {
            p = 0;
        }
        return p;
    }
    static double N4a53087a258(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= -28.88370901097793) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() > -28.88370901097793) {
            p = WekaClassifier.N804ee42259(i);
        }
        return p;
    }
    static double N804ee42259(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() <= -53.78225865748919) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() > -53.78225865748919) {
            p = 1;
        }
        return p;
    }
    static double N1176857e260(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() <= -28.70993087579782) {
            p = WekaClassifier.N6118573c261(i);
        } else if (((Double) i[4]).doubleValue() > -28.70993087579782) {
            p = WekaClassifier.N1c830d7a263(i);
        }
        return p;
    }
    static double N6118573c261(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= -20.588003456322788) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() > -20.588003456322788) {
            p = WekaClassifier.N33da93bd262(i);
        }
        return p;
    }
    static double N33da93bd262(Object []i) {
        double p = Double.NaN;
        if (i[19] == null) {
            p = 0;
        } else if (((Double) i[19]).doubleValue() <= -47.8518068382635) {
            p = 0;
        } else if (((Double) i[19]).doubleValue() > -47.8518068382635) {
            p = 1;
        }
        return p;
    }
    static double N1c830d7a263(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() <= -29.977979333306934) {
            p = WekaClassifier.N39fb36e1264(i);
        } else if (((Double) i[3]).doubleValue() > -29.977979333306934) {
            p = 1;
        }
        return p;
    }
    static double N39fb36e1264(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 0;
        } else if (((Double) i[5]).doubleValue() <= -28.092325839867733) {
            p = 0;
        } else if (((Double) i[5]).doubleValue() > -28.092325839867733) {
            p = 1;
        }
        return p;
    }
    static double N1af93755265(Object []i) {
        double p = Double.NaN;
        if (i[19] == null) {
            p = 0;
        } else if (((Double) i[19]).doubleValue() <= -30.74546594526451) {
            p = WekaClassifier.N7dd908cc266(i);
        } else if (((Double) i[19]).doubleValue() > -30.74546594526451) {
            p = WekaClassifier.N56861a18933(i);
        }
        return p;
    }
    static double N7dd908cc266(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= -31.142653977160794) {
            p = WekaClassifier.N79b532d0267(i);
        } else if (((Double) i[5]).doubleValue() > -31.142653977160794) {
            p = WekaClassifier.N344e37ca636(i);
        }
        return p;
    }
    static double N79b532d0267(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 1;
        } else if (((Double) i[12]).doubleValue() <= -31.35954502086601) {
            p = WekaClassifier.N19995f39268(i);
        } else if (((Double) i[12]).doubleValue() > -31.35954502086601) {
            p = WekaClassifier.N61f04c3a602(i);
        }
        return p;
    }
    static double N19995f39268(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() <= -40.22277467400945) {
            p = WekaClassifier.N4a0990c0269(i);
        } else if (((Double) i[10]).doubleValue() > -40.22277467400945) {
            p = WekaClassifier.N5d8083b5487(i);
        }
        return p;
    }
    static double N4a0990c0269(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() <= -23.299214685931723) {
            p = WekaClassifier.N7f236e25270(i);
        } else if (((Double) i[4]).doubleValue() > -23.299214685931723) {
            p = WekaClassifier.N6309020c484(i);
        }
        return p;
    }
    static double N7f236e25270(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 1;
        } else if (((Double) i[11]).doubleValue() <= -42.902034392224465) {
            p = WekaClassifier.N2f50e0a3271(i);
        } else if (((Double) i[11]).doubleValue() > -42.902034392224465) {
            p = WekaClassifier.N7460ffd6339(i);
        }
        return p;
    }
    static double N2f50e0a3271(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -1.0662502965894376) {
            p = WekaClassifier.N7c6302e7272(i);
        } else if (((Double) i[0]).doubleValue() > -1.0662502965894376) {
            p = WekaClassifier.N3d3f5175317(i);
        }
        return p;
    }
    static double N7c6302e7272(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() <= -37.88623905224701) {
            p = WekaClassifier.N7aea023b273(i);
        } else if (((Double) i[3]).doubleValue() > -37.88623905224701) {
            p = WekaClassifier.N1e83e8de281(i);
        }
        return p;
    }
    static double N7aea023b273(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() <= -36.907286060270664) {
            p = WekaClassifier.N1e5c0905274(i);
        } else if (((Double) i[4]).doubleValue() > -36.907286060270664) {
            p = WekaClassifier.N3621a795275(i);
        }
        return p;
    }
    static double N1e5c0905274(Object []i) {
        double p = Double.NaN;
        if (i[16] == null) {
            p = 0;
        } else if (((Double) i[16]).doubleValue() <= -53.402032641671646) {
            p = 0;
        } else if (((Double) i[16]).doubleValue() > -53.402032641671646) {
            p = 1;
        }
        return p;
    }
    static double N3621a795275(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -7.59967442946369) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > -7.59967442946369) {
            p = WekaClassifier.N52b1ef8c276(i);
        }
        return p;
    }
    static double N52b1ef8c276(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 0;
        } else if (((Double) i[9]).doubleValue() <= -32.868869356092446) {
            p = WekaClassifier.N78e0d43b277(i);
        } else if (((Double) i[9]).doubleValue() > -32.868869356092446) {
            p = 1;
        }
        return p;
    }
    static double N78e0d43b277(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() <= -31.176388208463983) {
            p = WekaClassifier.N60aee03278(i);
        } else if (((Double) i[8]).doubleValue() > -31.176388208463983) {
            p = WekaClassifier.N60bcb9fe280(i);
        }
        return p;
    }
    static double N60aee03278(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= -13.813585394000924) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() > -13.813585394000924) {
            p = WekaClassifier.N3d2cec58279(i);
        }
        return p;
    }
    static double N3d2cec58279(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= -31.41467219511844) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() > -31.41467219511844) {
            p = 1;
        }
        return p;
    }
    static double N60bcb9fe280(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= -17.7001216195346) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() > -17.7001216195346) {
            p = 1;
        }
        return p;
    }
    static double N1e83e8de281(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= -34.327324028791224) {
            p = WekaClassifier.N4f2877fb282(i);
        } else if (((Double) i[5]).doubleValue() > -34.327324028791224) {
            p = WekaClassifier.Nfad70f9303(i);
        }
        return p;
    }
    static double N4f2877fb282(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 1;
        } else if (((Double) i[14]).doubleValue() <= -37.976537887863756) {
            p = WekaClassifier.N15bc1c6a283(i);
        } else if (((Double) i[14]).doubleValue() > -37.976537887863756) {
            p = WekaClassifier.N2c8af084295(i);
        }
        return p;
    }
    static double N15bc1c6a283(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() <= -28.24110786094525) {
            p = WekaClassifier.N10ca346a284(i);
        } else if (((Double) i[4]).doubleValue() > -28.24110786094525) {
            p = 1;
        }
        return p;
    }
    static double N10ca346a284(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() <= -37.23731113418117) {
            p = WekaClassifier.N118efbb5285(i);
        } else if (((Double) i[7]).doubleValue() > -37.23731113418117) {
            p = WekaClassifier.N4fa2c489289(i);
        }
        return p;
    }
    static double N118efbb5285(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 1;
        } else if (((Double) i[14]).doubleValue() <= -42.3515514618571) {
            p = 1;
        } else if (((Double) i[14]).doubleValue() > -42.3515514618571) {
            p = WekaClassifier.N1d15c1d0286(i);
        }
        return p;
    }
    static double N1d15c1d0286(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= -40.46708282207257) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() > -40.46708282207257) {
            p = WekaClassifier.N683fd154287(i);
        }
        return p;
    }
    static double N683fd154287(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() <= -46.76111652396159) {
            p = WekaClassifier.N2997d15d288(i);
        } else if (((Double) i[7]).doubleValue() > -46.76111652396159) {
            p = 1;
        }
        return p;
    }
    static double N2997d15d288(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() <= -49.56269014474595) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() > -49.56269014474595) {
            p = 0;
        }
        return p;
    }
    static double N4fa2c489289(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() <= -48.25693929356806) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() > -48.25693929356806) {
            p = WekaClassifier.N7c0a87ec290(i);
        }
        return p;
    }
    static double N7c0a87ec290(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= -15.649482418976191) {
            p = WekaClassifier.N6a294c48291(i);
        } else if (((Double) i[1]).doubleValue() > -15.649482418976191) {
            p = 1;
        }
        return p;
    }
    static double N6a294c48291(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 0;
        } else if (((Double) i[14]).doubleValue() <= -41.180551673888445) {
            p = WekaClassifier.N7d237569292(i);
        } else if (((Double) i[14]).doubleValue() > -41.180551673888445) {
            p = WekaClassifier.Nc61b64c294(i);
        }
        return p;
    }
    static double N7d237569292(Object []i) {
        double p = Double.NaN;
        if (i[17] == null) {
            p = 1;
        } else if (((Double) i[17]).doubleValue() <= -42.97392625434869) {
            p = WekaClassifier.N247c60c8293(i);
        } else if (((Double) i[17]).doubleValue() > -42.97392625434869) {
            p = 0;
        }
        return p;
    }
    static double N247c60c8293(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= -36.602444834796614) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() > -36.602444834796614) {
            p = 1;
        }
        return p;
    }
    static double Nc61b64c294(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 1;
        } else if (((Double) i[6]).doubleValue() <= -30.669661194894633) {
            p = 1;
        } else if (((Double) i[6]).doubleValue() > -30.669661194894633) {
            p = 0;
        }
        return p;
    }
    static double N2c8af084295(Object []i) {
        double p = Double.NaN;
        if (i[18] == null) {
            p = 1;
        } else if (((Double) i[18]).doubleValue() <= -43.26062840321011) {
            p = WekaClassifier.N4ae45041296(i);
        } else if (((Double) i[18]).doubleValue() > -43.26062840321011) {
            p = WekaClassifier.Nc8b17c4298(i);
        }
        return p;
    }
    static double N4ae45041296(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() <= -56.979813614858) {
            p = WekaClassifier.Nd5903f5297(i);
        } else if (((Double) i[10]).doubleValue() > -56.979813614858) {
            p = 1;
        }
        return p;
    }
    static double Nd5903f5297(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() <= -41.50230028508716) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() > -41.50230028508716) {
            p = 1;
        }
        return p;
    }
    static double Nc8b17c4298(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= -39.15348849817335) {
            p = WekaClassifier.N777ed801299(i);
        } else if (((Double) i[9]).doubleValue() > -39.15348849817335) {
            p = WekaClassifier.Ne920ffa302(i);
        }
        return p;
    }
    static double N777ed801299(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= -7.222790507325591) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() > -7.222790507325591) {
            p = WekaClassifier.N1f70e8f7300(i);
        }
        return p;
    }
    static double N1f70e8f7300(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 0;
        } else if (((Double) i[14]).doubleValue() <= -34.0621821642941) {
            p = WekaClassifier.N5a730647301(i);
        } else if (((Double) i[14]).doubleValue() > -34.0621821642941) {
            p = 1;
        }
        return p;
    }
    static double N5a730647301(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= -25.985131042356308) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() > -25.985131042356308) {
            p = 0;
        }
        return p;
    }
    static double Ne920ffa302(Object []i) {
        double p = Double.NaN;
        if (i[16] == null) {
            p = 0;
        } else if (((Double) i[16]).doubleValue() <= -29.087368351462025) {
            p = 0;
        } else if (((Double) i[16]).doubleValue() > -29.087368351462025) {
            p = 1;
        }
        return p;
    }
    static double Nfad70f9303(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= -37.011136358223126) {
            p = WekaClassifier.N170216ab304(i);
        } else if (((Double) i[2]).doubleValue() > -37.011136358223126) {
            p = WekaClassifier.N4b7243a7306(i);
        }
        return p;
    }
    static double N170216ab304(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= -6.843371183593774) {
            p = WekaClassifier.N55817b32305(i);
        } else if (((Double) i[0]).doubleValue() > -6.843371183593774) {
            p = 1;
        }
        return p;
    }
    static double N55817b32305(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() <= -38.84744384458903) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() > -38.84744384458903) {
            p = 0;
        }
        return p;
    }
    static double N4b7243a7306(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= -30.342016563952036) {
            p = WekaClassifier.N2f3cd888307(i);
        } else if (((Double) i[4]).doubleValue() > -30.342016563952036) {
            p = WekaClassifier.N4f8af8f6315(i);
        }
        return p;
    }
    static double N2f3cd888307(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= -29.296493795236124) {
            p = WekaClassifier.N280c248a308(i);
        } else if (((Double) i[3]).doubleValue() > -29.296493795236124) {
            p = WekaClassifier.N2fbc884f310(i);
        }
        return p;
    }
    static double N280c248a308(Object []i) {
        double p = Double.NaN;
        if (i[16] == null) {
            p = 0;
        } else if (((Double) i[16]).doubleValue() <= -62.28973911563879) {
            p = 0;
        } else if (((Double) i[16]).doubleValue() > -62.28973911563879) {
            p = WekaClassifier.N760a8252309(i);
        }
        return p;
    }
    static double N760a8252309(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() <= -55.15928748494322) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() > -55.15928748494322) {
            p = 1;
        }
        return p;
    }
    static double N2fbc884f310(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= -16.663572161353386) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() > -16.663572161353386) {
            p = WekaClassifier.N668deda8311(i);
        }
        return p;
    }
    static double N668deda8311(Object []i) {
        double p = Double.NaN;
        if (i[16] == null) {
            p = 0;
        } else if (((Double) i[16]).doubleValue() <= -39.77746272514966) {
            p = WekaClassifier.N2f6cad87312(i);
        } else if (((Double) i[16]).doubleValue() > -39.77746272514966) {
            p = 0;
        }
        return p;
    }
    static double N2f6cad87312(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= -28.767928795237033) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() > -28.767928795237033) {
            p = WekaClassifier.Ndd6a22a313(i);
        }
        return p;
    }
    static double Ndd6a22a313(Object []i) {
        double p = Double.NaN;
        if (i[15] == null) {
            p = 0;
        } else if (((Double) i[15]).doubleValue() <= -42.71420737522318) {
            p = WekaClassifier.N46e3bd2f314(i);
        } else if (((Double) i[15]).doubleValue() > -42.71420737522318) {
            p = 1;
        }
        return p;
    }
    static double N46e3bd2f314(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 0;
        } else if (((Double) i[11]).doubleValue() <= -44.00271280252611) {
            p = 0;
        } else if (((Double) i[11]).doubleValue() > -44.00271280252611) {
            p = 1;
        }
        return p;
    }
    static double N4f8af8f6315(Object []i) {
        double p = Double.NaN;
        if (i[18] == null) {
            p = 1;
        } else if (((Double) i[18]).doubleValue() <= -35.06698755658418) {
            p = WekaClassifier.N5c07415316(i);
        } else if (((Double) i[18]).doubleValue() > -35.06698755658418) {
            p = 0;
        }
        return p;
    }
    static double N5c07415316(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() <= -32.729918769478445) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() > -32.729918769478445) {
            p = 1;
        }
        return p;
    }
    static double N3d3f5175317(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= -16.614455731556255) {
            p = WekaClassifier.N666e8938318(i);
        } else if (((Double) i[1]).doubleValue() > -16.614455731556255) {
            p = WekaClassifier.N2f7d23d0327(i);
        }
        return p;
    }
    static double N666e8938318(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= -31.41494238626394) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() > -31.41494238626394) {
            p = WekaClassifier.N7ebb904b319(i);
        }
        return p;
    }
    static double N7ebb904b319(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= -43.468726620958805) {
            p = WekaClassifier.N785d2355320(i);
        } else if (((Double) i[9]).doubleValue() > -43.468726620958805) {
            p = WekaClassifier.Nf80fc76323(i);
        }
        return p;
    }
    static double N785d2355320(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() <= -64.06978840501874) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() > -64.06978840501874) {
            p = WekaClassifier.N3fae71d2321(i);
        }
        return p;
    }
    static double N3fae71d2321(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() <= -35.447128761634616) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() > -35.447128761634616) {
            p = WekaClassifier.N2d1b0856322(i);
        }
        return p;
    }
    static double N2d1b0856322(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= -37.29334792285) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() > -37.29334792285) {
            p = 0;
        }
        return p;
    }
    static double Nf80fc76323(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= -31.65428724548412) {
            p = WekaClassifier.N1ed62158324(i);
        } else if (((Double) i[4]).doubleValue() > -31.65428724548412) {
            p = WekaClassifier.N27961818326(i);
        }
        return p;
    }
    static double N1ed62158324(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() <= -25.797945317489795) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() > -25.797945317489795) {
            p = WekaClassifier.N523af3b1325(i);
        }
        return p;
    }
    static double N523af3b1325(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 1;
        } else if (((Double) i[6]).doubleValue() <= -41.71781300797464) {
            p = 1;
        } else if (((Double) i[6]).doubleValue() > -41.71781300797464) {
            p = 0;
        }
        return p;
    }
    static double N27961818326(Object []i) {
        double p = Double.NaN;
        if (i[16] == null) {
            p = 0;
        } else if (((Double) i[16]).doubleValue() <= -42.07826809082389) {
            p = 0;
        } else if (((Double) i[16]).doubleValue() > -42.07826809082389) {
            p = 1;
        }
        return p;
    }
    static double N2f7d23d0327(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= -24.27958467228593) {
            p = WekaClassifier.N8e1b86328(i);
        } else if (((Double) i[2]).doubleValue() > -24.27958467228593) {
            p = WekaClassifier.N2fc3cc4a335(i);
        }
        return p;
    }
    static double N8e1b86328(Object []i) {
        double p = Double.NaN;
        if (i[15] == null) {
            p = 1;
        } else if (((Double) i[15]).doubleValue() <= -37.42565980109166) {
            p = WekaClassifier.N5acc75d329(i);
        } else if (((Double) i[15]).doubleValue() > -37.42565980109166) {
            p = WekaClassifier.N246af822332(i);
        }
        return p;
    }
    static double N5acc75d329(Object []i) {
        double p = Double.NaN;
        if (i[19] == null) {
            p = 1;
        } else if (((Double) i[19]).doubleValue() <= -38.604819194489735) {
            p = 1;
        } else if (((Double) i[19]).doubleValue() > -38.604819194489735) {
            p = WekaClassifier.N12ed5928330(i);
        }
        return p;
    }
    static double N12ed5928330(Object []i) {
        double p = Double.NaN;
        if (i[18] == null) {
            p = 0;
        } else if (((Double) i[18]).doubleValue() <= -45.27699214863936) {
            p = WekaClassifier.N54488b06331(i);
        } else if (((Double) i[18]).doubleValue() > -45.27699214863936) {
            p = 1;
        }
        return p;
    }
    static double N54488b06331(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -0.20698005345771264) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > -0.20698005345771264) {
            p = 0;
        }
        return p;
    }
    static double N246af822332(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= -31.861050161910946) {
            p = WekaClassifier.N471f45dd333(i);
        } else if (((Double) i[5]).doubleValue() > -31.861050161910946) {
            p = 0;
        }
        return p;
    }
    static double N471f45dd333(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 0;
        } else if (((Double) i[12]).doubleValue() <= -55.64813414047202) {
            p = 0;
        } else if (((Double) i[12]).doubleValue() > -55.64813414047202) {
            p = WekaClassifier.N3fc3600f334(i);
        }
        return p;
    }
    static double N3fc3600f334(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() <= -59.184542012750306) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() > -59.184542012750306) {
            p = 1;
        }
        return p;
    }
    static double N2fc3cc4a335(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= -30.9893860762998) {
            p = WekaClassifier.N5c1b8a78336(i);
        } else if (((Double) i[4]).doubleValue() > -30.9893860762998) {
            p = 1;
        }
        return p;
    }
    static double N5c1b8a78336(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 0;
        } else if (((Double) i[9]).doubleValue() <= -36.94558710290515) {
            p = WekaClassifier.N61171d8b337(i);
        } else if (((Double) i[9]).doubleValue() > -36.94558710290515) {
            p = 1;
        }
        return p;
    }
    static double N61171d8b337(Object []i) {
        double p = Double.NaN;
        if (i[18] == null) {
            p = 0;
        } else if (((Double) i[18]).doubleValue() <= -36.25553789014867) {
            p = WekaClassifier.N45f0cabe338(i);
        } else if (((Double) i[18]).doubleValue() > -36.25553789014867) {
            p = 1;
        }
        return p;
    }
    static double N45f0cabe338(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= -31.40362128345572) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() > -31.40362128345572) {
            p = 0;
        }
        return p;
    }
    static double N7460ffd6339(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= -14.131924931859103) {
            p = WekaClassifier.N74a8f368340(i);
        } else if (((Double) i[1]).doubleValue() > -14.131924931859103) {
            p = WekaClassifier.N3d1edd05466(i);
        }
        return p;
    }
    static double N74a8f368340(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= -23.546675387110618) {
            p = WekaClassifier.N2d8a5333341(i);
        } else if (((Double) i[2]).doubleValue() > -23.546675387110618) {
            p = WekaClassifier.Nb2a0b5f457(i);
        }
        return p;
    }
    static double N2d8a5333341(Object []i) {
        double p = Double.NaN;
        if (i[18] == null) {
            p = 0;
        } else if (((Double) i[18]).doubleValue() <= -35.34525872531238) {
            p = WekaClassifier.N6eecc906342(i);
        } else if (((Double) i[18]).doubleValue() > -35.34525872531238) {
            p = WekaClassifier.N4af9b81a447(i);
        }
        return p;
    }
    static double N6eecc906342(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() <= -24.71452624957275) {
            p = WekaClassifier.N1d010542343(i);
        } else if (((Double) i[3]).doubleValue() > -24.71452624957275) {
            p = WekaClassifier.N3ccb92bf440(i);
        }
        return p;
    }
    static double N1d010542343(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() <= -45.76375420647897) {
            p = WekaClassifier.N2e819639344(i);
        } else if (((Double) i[7]).doubleValue() > -45.76375420647897) {
            p = WekaClassifier.N4158ca0350(i);
        }
        return p;
    }
    static double N2e819639344(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() <= -28.27100960037309) {
            p = WekaClassifier.N51ed4b11345(i);
        } else if (((Double) i[4]).doubleValue() > -28.27100960037309) {
            p = 0;
        }
        return p;
    }
    static double N51ed4b11345(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() <= -35.70182942930085) {
            p = WekaClassifier.N59c11cd3346(i);
        } else if (((Double) i[3]).doubleValue() > -35.70182942930085) {
            p = WekaClassifier.N4c7f39bc347(i);
        }
        return p;
    }
    static double N59c11cd3346(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= -30.35520140815478) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() > -30.35520140815478) {
            p = 0;
        }
        return p;
    }
    static double N4c7f39bc347(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= -32.30536461659158) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() > -32.30536461659158) {
            p = WekaClassifier.N6e6d5e54348(i);
        }
        return p;
    }
    static double N6e6d5e54348(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= -26.251661183059646) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() > -26.251661183059646) {
            p = WekaClassifier.N55e3254b349(i);
        }
        return p;
    }
    static double N55e3254b349(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() <= -25.72989421521423) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() > -25.72989421521423) {
            p = 1;
        }
        return p;
    }
    static double N4158ca0350(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 0;
        } else if (((Double) i[12]).doubleValue() <= -48.420711603807646) {
            p = WekaClassifier.N3112f747351(i);
        } else if (((Double) i[12]).doubleValue() > -48.420711603807646) {
            p = WekaClassifier.N7e6a9c07370(i);
        }
        return p;
    }
    static double N3112f747351(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= -2.1655343106702034) {
            p = WekaClassifier.N358990cf352(i);
        } else if (((Double) i[0]).doubleValue() > -2.1655343106702034) {
            p = WekaClassifier.N68de4999361(i);
        }
        return p;
    }
    static double N358990cf352(Object []i) {
        double p = Double.NaN;
        if (i[16] == null) {
            p = 0;
        } else if (((Double) i[16]).doubleValue() <= -34.73950760023061) {
            p = WekaClassifier.N790c2248353(i);
        } else if (((Double) i[16]).doubleValue() > -34.73950760023061) {
            p = 0;
        }
        return p;
    }
    static double N790c2248353(Object []i) {
        double p = Double.NaN;
        if (i[17] == null) {
            p = 0;
        } else if (((Double) i[17]).doubleValue() <= -33.30647056446918) {
            p = WekaClassifier.N5154d145354(i);
        } else if (((Double) i[17]).doubleValue() > -33.30647056446918) {
            p = 1;
        }
        return p;
    }
    static double N5154d145354(Object []i) {
        double p = Double.NaN;
        if (i[15] == null) {
            p = 1;
        } else if (((Double) i[15]).doubleValue() <= -59.76025951298432) {
            p = 1;
        } else if (((Double) i[15]).doubleValue() > -59.76025951298432) {
            p = WekaClassifier.N775abce7355(i);
        }
        return p;
    }
    static double N775abce7355(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 1;
        } else if (((Double) i[11]).doubleValue() <= -38.534602380986925) {
            p = WekaClassifier.Ne2c452b356(i);
        } else if (((Double) i[11]).doubleValue() > -38.534602380986925) {
            p = WekaClassifier.N162a28c4357(i);
        }
        return p;
    }
    static double Ne2c452b356(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() <= -43.6907879821543) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() > -43.6907879821543) {
            p = 0;
        }
        return p;
    }
    static double N162a28c4357(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 0;
        } else if (((Double) i[7]).doubleValue() <= -32.27046154953092) {
            p = WekaClassifier.N61031dbd358(i);
        } else if (((Double) i[7]).doubleValue() > -32.27046154953092) {
            p = 0;
        }
        return p;
    }
    static double N61031dbd358(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= -28.269009633321495) {
            p = WekaClassifier.N439c28fe359(i);
        } else if (((Double) i[2]).doubleValue() > -28.269009633321495) {
            p = 0;
        }
        return p;
    }
    static double N439c28fe359(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() <= -50.85977136278405) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() > -50.85977136278405) {
            p = WekaClassifier.N2f7538bb360(i);
        }
        return p;
    }
    static double N2f7538bb360(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() <= -42.26390395999852) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() > -42.26390395999852) {
            p = 1;
        }
        return p;
    }
    static double N68de4999361(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= -16.493247229497314) {
            p = WekaClassifier.N11495fca362(i);
        } else if (((Double) i[1]).doubleValue() > -16.493247229497314) {
            p = WekaClassifier.N7462a064366(i);
        }
        return p;
    }
    static double N11495fca362(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= -27.470225144816368) {
            p = WekaClassifier.N33305ec5363(i);
        } else if (((Double) i[2]).doubleValue() > -27.470225144816368) {
            p = WekaClassifier.N2f8e1d50365(i);
        }
        return p;
    }
    static double N33305ec5363(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= -35.3923953004932) {
            p = WekaClassifier.N358618f8364(i);
        } else if (((Double) i[2]).doubleValue() > -35.3923953004932) {
            p = 0;
        }
        return p;
    }
    static double N358618f8364(Object []i) {
        double p = Double.NaN;
        if (i[15] == null) {
            p = 0;
        } else if (((Double) i[15]).doubleValue() <= -38.77720355852301) {
            p = 0;
        } else if (((Double) i[15]).doubleValue() > -38.77720355852301) {
            p = 1;
        }
        return p;
    }
    static double N2f8e1d50365(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() <= -44.18638840915471) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() > -44.18638840915471) {
            p = 1;
        }
        return p;
    }
    static double N7462a064366(Object []i) {
        double p = Double.NaN;
        if (i[13] == null) {
            p = 1;
        } else if (((Double) i[13]).doubleValue() <= -46.58541802968593) {
            p = WekaClassifier.N45951e5b367(i);
        } else if (((Double) i[13]).doubleValue() > -46.58541802968593) {
            p = WekaClassifier.N40518fc9368(i);
        }
        return p;
    }
    static double N45951e5b367(Object []i) {
        double p = Double.NaN;
        if (i[15] == null) {
            p = 1;
        } else if (((Double) i[15]).doubleValue() <= -38.10826447667545) {
            p = 1;
        } else if (((Double) i[15]).doubleValue() > -38.10826447667545) {
            p = 0;
        }
        return p;
    }
    static double N40518fc9368(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= -30.681104546498304) {
            p = WekaClassifier.N1f6a6e0e369(i);
        } else if (((Double) i[2]).doubleValue() > -30.681104546498304) {
            p = 0;
        }
        return p;
    }
    static double N1f6a6e0e369(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= -0.3164325458478672) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() > -0.3164325458478672) {
            p = 1;
        }
        return p;
    }
    static double N7e6a9c07370(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 0;
        } else if (((Double) i[12]).doubleValue() <= -37.75939063997649) {
            p = WekaClassifier.N13e02257371(i);
        } else if (((Double) i[12]).doubleValue() > -37.75939063997649) {
            p = WekaClassifier.N71e4acf0418(i);
        }
        return p;
    }
    static double N13e02257371(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -5.616067625664236) {
            p = WekaClassifier.N5f83c825372(i);
        } else if (((Double) i[0]).doubleValue() > -5.616067625664236) {
            p = WekaClassifier.N2b9594ef375(i);
        }
        return p;
    }
    static double N5f83c825372(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 0;
        } else if (((Double) i[7]).doubleValue() <= -34.97626078359268) {
            p = WekaClassifier.N1355c7c5373(i);
        } else if (((Double) i[7]).doubleValue() > -34.97626078359268) {
            p = WekaClassifier.N3975fb0c374(i);
        }
        return p;
    }
    static double N1355c7c5373(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() <= -31.52301773754047) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() > -31.52301773754047) {
            p = 0;
        }
        return p;
    }
    static double N3975fb0c374(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() <= -24.49430759923636) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() > -24.49430759923636) {
            p = 0;
        }
        return p;
    }
    static double N2b9594ef375(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= -16.60822450669537) {
            p = WekaClassifier.N6a16b358376(i);
        } else if (((Double) i[1]).doubleValue() > -16.60822450669537) {
            p = WekaClassifier.N68084ab1401(i);
        }
        return p;
    }
    static double N6a16b358376(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() <= -41.56371596950463) {
            p = WekaClassifier.N57403a30377(i);
        } else if (((Double) i[6]).doubleValue() > -41.56371596950463) {
            p = WekaClassifier.N99ad2cb385(i);
        }
        return p;
    }
    static double N57403a30377(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 0;
        } else if (((Double) i[9]).doubleValue() <= -35.91649587313572) {
            p = WekaClassifier.N417b064f378(i);
        } else if (((Double) i[9]).doubleValue() > -35.91649587313572) {
            p = 0;
        }
        return p;
    }
    static double N417b064f378(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= -31.974815683021113) {
            p = WekaClassifier.N46cec063379(i);
        } else if (((Double) i[4]).doubleValue() > -31.974815683021113) {
            p = WekaClassifier.N16a6ac78384(i);
        }
        return p;
    }
    static double N46cec063379(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 0;
        } else if (((Double) i[14]).doubleValue() <= -36.34451836210859) {
            p = WekaClassifier.N199d3791380(i);
        } else if (((Double) i[14]).doubleValue() > -36.34451836210859) {
            p = WekaClassifier.N66f72e88383(i);
        }
        return p;
    }
    static double N199d3791380(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 0;
        } else if (((Double) i[5]).doubleValue() <= -35.39313090956638) {
            p = WekaClassifier.N4f5a0f28381(i);
        } else if (((Double) i[5]).doubleValue() > -35.39313090956638) {
            p = 0;
        }
        return p;
    }
    static double N4f5a0f28381(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -2.511672274439597) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > -2.511672274439597) {
            p = WekaClassifier.N560a21f2382(i);
        }
        return p;
    }
    static double N560a21f2382(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= -29.33064858221838) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() > -29.33064858221838) {
            p = 1;
        }
        return p;
    }
    static double N66f72e88383(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 1;
        } else if (((Double) i[14]).doubleValue() <= -34.54744730315226) {
            p = 1;
        } else if (((Double) i[14]).doubleValue() > -34.54744730315226) {
            p = 0;
        }
        return p;
    }
    static double N16a6ac78384(Object []i) {
        double p = Double.NaN;
        if (i[16] == null) {
            p = 1;
        } else if (((Double) i[16]).doubleValue() <= -38.9433327105328) {
            p = 1;
        } else if (((Double) i[16]).doubleValue() > -38.9433327105328) {
            p = 0;
        }
        return p;
    }
    static double N99ad2cb385(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= -28.198158815849993) {
            p = WekaClassifier.Ne1877bb386(i);
        } else if (((Double) i[4]).doubleValue() > -28.198158815849993) {
            p = 0;
        }
        return p;
    }
    static double Ne1877bb386(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= -28.446897715772884) {
            p = WekaClassifier.N51c49b9e387(i);
        } else if (((Double) i[3]).doubleValue() > -28.446897715772884) {
            p = WekaClassifier.N7b68d3b0394(i);
        }
        return p;
    }
    static double N51c49b9e387(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 0;
        } else if (((Double) i[5]).doubleValue() <= -41.84939691264748) {
            p = WekaClassifier.N72a238b2388(i);
        } else if (((Double) i[5]).doubleValue() > -41.84939691264748) {
            p = WekaClassifier.N2df1a0a7389(i);
        }
        return p;
    }
    static double N72a238b2388(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 1;
        } else if (((Double) i[14]).doubleValue() <= -45.034538849954004) {
            p = 1;
        } else if (((Double) i[14]).doubleValue() > -45.034538849954004) {
            p = 0;
        }
        return p;
    }
    static double N2df1a0a7389(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 1;
        } else if (((Double) i[11]).doubleValue() <= -33.17431860677067) {
            p = WekaClassifier.N6099bf0d390(i);
        } else if (((Double) i[11]).doubleValue() > -33.17431860677067) {
            p = 0;
        }
        return p;
    }
    static double N6099bf0d390(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() <= -51.14546283669501) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() > -51.14546283669501) {
            p = WekaClassifier.N15f4c0eb391(i);
        }
        return p;
    }
    static double N15f4c0eb391(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 1;
        } else if (((Double) i[8]).doubleValue() <= -41.405463140402006) {
            p = WekaClassifier.N76700d4f392(i);
        } else if (((Double) i[8]).doubleValue() > -41.405463140402006) {
            p = 1;
        }
        return p;
    }
    static double N76700d4f392(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= -30.345404307750016) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() > -30.345404307750016) {
            p = WekaClassifier.N56a47fbe393(i);
        }
        return p;
    }
    static double N56a47fbe393(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= -30.39244304738181) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() > -30.39244304738181) {
            p = 1;
        }
        return p;
    }
    static double N7b68d3b0394(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= -25.131246142307447) {
            p = WekaClassifier.N4828b7ae395(i);
        } else if (((Double) i[2]).doubleValue() > -25.131246142307447) {
            p = 1;
        }
        return p;
    }
    static double N4828b7ae395(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= -32.475781640903776) {
            p = WekaClassifier.N3e44c191396(i);
        } else if (((Double) i[4]).doubleValue() > -32.475781640903776) {
            p = WekaClassifier.N63e8ede4400(i);
        }
        return p;
    }
    static double N3e44c191396(Object []i) {
        double p = Double.NaN;
        if (i[16] == null) {
            p = 0;
        } else if (((Double) i[16]).doubleValue() <= -44.42995465275215) {
            p = 0;
        } else if (((Double) i[16]).doubleValue() > -44.42995465275215) {
            p = WekaClassifier.N4be80068397(i);
        }
        return p;
    }
    static double N4be80068397(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() <= -26.869888742061065) {
            p = WekaClassifier.N7620aff6398(i);
        } else if (((Double) i[3]).doubleValue() > -26.869888742061065) {
            p = 0;
        }
        return p;
    }
    static double N7620aff6398(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= -28.848674314229378) {
            p = WekaClassifier.N7b38f35b399(i);
        } else if (((Double) i[2]).doubleValue() > -28.848674314229378) {
            p = 1;
        }
        return p;
    }
    static double N7b38f35b399(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() <= -41.16989196743825) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() > -41.16989196743825) {
            p = 0;
        }
        return p;
    }
    static double N63e8ede4400(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= -27.523745123054645) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() > -27.523745123054645) {
            p = 0;
        }
        return p;
    }
    static double N68084ab1401(Object []i) {
        double p = Double.NaN;
        if (i[13] == null) {
            p = 1;
        } else if (((Double) i[13]).doubleValue() <= -44.253045615716545) {
            p = WekaClassifier.N1b240759402(i);
        } else if (((Double) i[13]).doubleValue() > -44.253045615716545) {
            p = WekaClassifier.N2ca0fd3c408(i);
        }
        return p;
    }
    static double N1b240759402(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= -36.557403294937195) {
            p = WekaClassifier.N27ba8d4d403(i);
        } else if (((Double) i[9]).doubleValue() > -36.557403294937195) {
            p = WekaClassifier.N6168bfd9407(i);
        }
        return p;
    }
    static double N27ba8d4d403(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 1;
        } else if (((Double) i[11]).doubleValue() <= -36.47225334742086) {
            p = WekaClassifier.N319c393404(i);
        } else if (((Double) i[11]).doubleValue() > -36.47225334742086) {
            p = WekaClassifier.N124b8838406(i);
        }
        return p;
    }
    static double N319c393404(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= -39.2405082332417) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() > -39.2405082332417) {
            p = WekaClassifier.N296e5c83405(i);
        }
        return p;
    }
    static double N296e5c83405(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= -16.305079333391028) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() > -16.305079333391028) {
            p = 1;
        }
        return p;
    }
    static double N124b8838406(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 0;
        } else if (((Double) i[5]).doubleValue() <= -33.19649460884459) {
            p = 0;
        } else if (((Double) i[5]).doubleValue() > -33.19649460884459) {
            p = 1;
        }
        return p;
    }
    static double N6168bfd9407(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= -33.410900915884625) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() > -33.410900915884625) {
            p = 0;
        }
        return p;
    }
    static double N2ca0fd3c408(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= -30.3882218886782) {
            p = WekaClassifier.N7771366f409(i);
        } else if (((Double) i[2]).doubleValue() > -30.3882218886782) {
            p = WekaClassifier.N48594115413(i);
        }
        return p;
    }
    static double N7771366f409(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() <= -27.313097220916774) {
            p = WekaClassifier.N39357af1410(i);
        } else if (((Double) i[4]).doubleValue() > -27.313097220916774) {
            p = 0;
        }
        return p;
    }
    static double N39357af1410(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= -26.884279302452036) {
            p = WekaClassifier.N1d079c79411(i);
        } else if (((Double) i[3]).doubleValue() > -26.884279302452036) {
            p = 1;
        }
        return p;
    }
    static double N1d079c79411(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() <= -51.19119583580458) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() > -51.19119583580458) {
            p = WekaClassifier.N3665dbf8412(i);
        }
        return p;
    }
    static double N3665dbf8412(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 0;
        } else if (((Double) i[14]).doubleValue() <= -36.82273378426409) {
            p = 0;
        } else if (((Double) i[14]).doubleValue() > -36.82273378426409) {
            p = 1;
        }
        return p;
    }
    static double N48594115413(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() <= -25.44390821094604) {
            p = WekaClassifier.N5a29581d414(i);
        } else if (((Double) i[3]).doubleValue() > -25.44390821094604) {
            p = WekaClassifier.N619df96e417(i);
        }
        return p;
    }
    static double N5a29581d414(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 0;
        } else if (((Double) i[7]).doubleValue() <= -36.61927773022227) {
            p = WekaClassifier.N7b6cf375415(i);
        } else if (((Double) i[7]).doubleValue() > -36.61927773022227) {
            p = 0;
        }
        return p;
    }
    static double N7b6cf375415(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= -49.832384736817275) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() > -49.832384736817275) {
            p = WekaClassifier.N634e5dfb416(i);
        }
        return p;
    }
    static double N634e5dfb416(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= -14.688645990767746) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() > -14.688645990767746) {
            p = 1;
        }
        return p;
    }
    static double N619df96e417(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 1;
        } else if (((Double) i[8]).doubleValue() <= -43.31226359107434) {
            p = 1;
        } else if (((Double) i[8]).doubleValue() > -43.31226359107434) {
            p = 0;
        }
        return p;
    }
    static double N71e4acf0418(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 1;
        } else if (((Double) i[6]).doubleValue() <= -32.61837149556146) {
            p = WekaClassifier.N6d0f1ee2419(i);
        } else if (((Double) i[6]).doubleValue() > -32.61837149556146) {
            p = WekaClassifier.N3e2a03b0436(i);
        }
        return p;
    }
    static double N6d0f1ee2419(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -0.270996840715263) {
            p = WekaClassifier.N7c3f273d420(i);
        } else if (((Double) i[0]).doubleValue() > -0.270996840715263) {
            p = WekaClassifier.N29cb45b3434(i);
        }
        return p;
    }
    static double N7c3f273d420(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= -26.847161312694414) {
            p = WekaClassifier.N72e7f75d421(i);
        } else if (((Double) i[2]).doubleValue() > -26.847161312694414) {
            p = WekaClassifier.N601d2952433(i);
        }
        return p;
    }
    static double N72e7f75d421(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 0;
        } else if (((Double) i[9]).doubleValue() <= -33.30214500804215) {
            p = WekaClassifier.N26b046dd422(i);
        } else if (((Double) i[9]).doubleValue() > -33.30214500804215) {
            p = 1;
        }
        return p;
    }
    static double N26b046dd422(Object []i) {
        double p = Double.NaN;
        if (i[16] == null) {
            p = 1;
        } else if (((Double) i[16]).doubleValue() <= -58.2525402562474) {
            p = 1;
        } else if (((Double) i[16]).doubleValue() > -58.2525402562474) {
            p = WekaClassifier.N33ddb4e7423(i);
        }
        return p;
    }
    static double N33ddb4e7423(Object []i) {
        double p = Double.NaN;
        if (i[13] == null) {
            p = 0;
        } else if (((Double) i[13]).doubleValue() <= -45.16185123717855) {
            p = WekaClassifier.N365e6b6e424(i);
        } else if (((Double) i[13]).doubleValue() > -45.16185123717855) {
            p = WekaClassifier.N5fec18ed426(i);
        }
        return p;
    }
    static double N365e6b6e424(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 0;
        } else if (((Double) i[11]).doubleValue() <= -41.4555348358496) {
            p = WekaClassifier.N7bce2fe7425(i);
        } else if (((Double) i[11]).doubleValue() > -41.4555348358496) {
            p = 0;
        }
        return p;
    }
    static double N7bce2fe7425(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= -17.53419604411645) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() > -17.53419604411645) {
            p = 1;
        }
        return p;
    }
    static double N5fec18ed426(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 1;
        } else if (((Double) i[14]).doubleValue() <= -32.76728143135399) {
            p = WekaClassifier.N1c8e57b427(i);
        } else if (((Double) i[14]).doubleValue() > -32.76728143135399) {
            p = 0;
        }
        return p;
    }
    static double N1c8e57b427(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() <= -41.52990213112483) {
            p = WekaClassifier.N4408fb37428(i);
        } else if (((Double) i[10]).doubleValue() > -41.52990213112483) {
            p = 0;
        }
        return p;
    }
    static double N4408fb37428(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() <= -41.890932291015325) {
            p = WekaClassifier.N4e334546429(i);
        } else if (((Double) i[6]).doubleValue() > -41.890932291015325) {
            p = WekaClassifier.N3782c77f431(i);
        }
        return p;
    }
    static double N4e334546429(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= -35.66157928530205) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() > -35.66157928530205) {
            p = WekaClassifier.N7127171d430(i);
        }
        return p;
    }
    static double N7127171d430(Object []i) {
        double p = Double.NaN;
        if (i[16] == null) {
            p = 1;
        } else if (((Double) i[16]).doubleValue() <= -38.6652086870252) {
            p = 1;
        } else if (((Double) i[16]).doubleValue() > -38.6652086870252) {
            p = 0;
        }
        return p;
    }
    static double N3782c77f431(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= -28.58661138252743) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() > -28.58661138252743) {
            p = WekaClassifier.N34d053fb432(i);
        }
        return p;
    }
    static double N34d053fb432(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 1;
        } else if (((Double) i[6]).doubleValue() <= -37.596889091296106) {
            p = 1;
        } else if (((Double) i[6]).doubleValue() > -37.596889091296106) {
            p = 0;
        }
        return p;
    }
    static double N601d2952433(Object []i) {
        double p = Double.NaN;
        if (i[19] == null) {
            p = 1;
        } else if (((Double) i[19]).doubleValue() <= -36.24425898247838) {
            p = 1;
        } else if (((Double) i[19]).doubleValue() > -36.24425898247838) {
            p = 0;
        }
        return p;
    }
    static double N29cb45b3434(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() <= -34.179365811598984) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() > -34.179365811598984) {
            p = WekaClassifier.N853c6ca435(i);
        }
        return p;
    }
    static double N853c6ca435(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= -32.5282688466496) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() > -32.5282688466496) {
            p = 1;
        }
        return p;
    }
    static double N3e2a03b0436(Object []i) {
        double p = Double.NaN;
        if (i[18] == null) {
            p = 0;
        } else if (((Double) i[18]).doubleValue() <= -40.55771073531758) {
            p = WekaClassifier.N37f4ea9e437(i);
        } else if (((Double) i[18]).doubleValue() > -40.55771073531758) {
            p = 0;
        }
        return p;
    }
    static double N37f4ea9e437(Object []i) {
        double p = Double.NaN;
        if (i[18] == null) {
            p = 0;
        } else if (((Double) i[18]).doubleValue() <= -41.740746162355826) {
            p = WekaClassifier.N4461c70e438(i);
        } else if (((Double) i[18]).doubleValue() > -41.740746162355826) {
            p = 1;
        }
        return p;
    }
    static double N4461c70e438(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() <= -30.297969237572445) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() > -30.297969237572445) {
            p = WekaClassifier.N52922cde439(i);
        }
        return p;
    }
    static double N52922cde439(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= -15.186723557403575) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() > -15.186723557403575) {
            p = 0;
        }
        return p;
    }
    static double N3ccb92bf440(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() <= -29.94417993186829) {
            p = WekaClassifier.N2c7b2fa2441(i);
        } else if (((Double) i[7]).doubleValue() > -29.94417993186829) {
            p = 1;
        }
        return p;
    }
    static double N2c7b2fa2441(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() <= -35.69838190697364) {
            p = WekaClassifier.N66e8c494442(i);
        } else if (((Double) i[4]).doubleValue() > -35.69838190697364) {
            p = WekaClassifier.N25dff04b443(i);
        }
        return p;
    }
    static double N66e8c494442(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() <= -63.54993185956268) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() > -63.54993185956268) {
            p = 1;
        }
        return p;
    }
    static double N25dff04b443(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= -15.698490313201752) {
            p = WekaClassifier.N45e1c025444(i);
        } else if (((Double) i[1]).doubleValue() > -15.698490313201752) {
            p = 0;
        }
        return p;
    }
    static double N45e1c025444(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= -34.72613282847562) {
            p = WekaClassifier.N3012f104445(i);
        } else if (((Double) i[5]).doubleValue() > -34.72613282847562) {
            p = WekaClassifier.N107e4ff6446(i);
        }
        return p;
    }
    static double N3012f104445(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 0;
        } else if (((Double) i[7]).doubleValue() <= -43.213573151575446) {
            p = 0;
        } else if (((Double) i[7]).doubleValue() > -43.213573151575446) {
            p = 1;
        }
        return p;
    }
    static double N107e4ff6446(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 0;
        } else if (((Double) i[12]).doubleValue() <= -43.5603435331385) {
            p = 0;
        } else if (((Double) i[12]).doubleValue() > -43.5603435331385) {
            p = 1;
        }
        return p;
    }
    static double N4af9b81a447(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= -1.2774784397665897) {
            p = WekaClassifier.N152a988448(i);
        } else if (((Double) i[0]).doubleValue() > -1.2774784397665897) {
            p = WekaClassifier.N2a705afd454(i);
        }
        return p;
    }
    static double N152a988448(Object []i) {
        double p = Double.NaN;
        if (i[16] == null) {
            p = 1;
        } else if (((Double) i[16]).doubleValue() <= -43.49935914512784) {
            p = WekaClassifier.N26eff277449(i);
        } else if (((Double) i[16]).doubleValue() > -43.49935914512784) {
            p = WekaClassifier.N5738be57452(i);
        }
        return p;
    }
    static double N26eff277449(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() <= -37.39723978872666) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() > -37.39723978872666) {
            p = WekaClassifier.N440c18a3450(i);
        }
        return p;
    }
    static double N440c18a3450(Object []i) {
        double p = Double.NaN;
        if (i[18] == null) {
            p = 0;
        } else if (((Double) i[18]).doubleValue() <= -31.221478712843027) {
            p = WekaClassifier.N43324150451(i);
        } else if (((Double) i[18]).doubleValue() > -31.221478712843027) {
            p = 1;
        }
        return p;
    }
    static double N43324150451(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() <= -32.50041907313021) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() > -32.50041907313021) {
            p = 1;
        }
        return p;
    }
    static double N5738be57452(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 0;
        } else if (((Double) i[14]).doubleValue() <= -44.66945236117901) {
            p = WekaClassifier.Ne9d828d453(i);
        } else if (((Double) i[14]).doubleValue() > -44.66945236117901) {
            p = 0;
        }
        return p;
    }
    static double Ne9d828d453(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= -16.524350412082065) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() > -16.524350412082065) {
            p = 1;
        }
        return p;
    }
    static double N2a705afd454(Object []i) {
        double p = Double.NaN;
        if (i[18] == null) {
            p = 1;
        } else if (((Double) i[18]).doubleValue() <= -33.424956353174274) {
            p = WekaClassifier.N7b99b622455(i);
        } else if (((Double) i[18]).doubleValue() > -33.424956353174274) {
            p = 1;
        }
        return p;
    }
    static double N7b99b622455(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= -35.827005670482244) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() > -35.827005670482244) {
            p = WekaClassifier.N69c17500456(i);
        }
        return p;
    }
    static double N69c17500456(Object []i) {
        double p = Double.NaN;
        if (i[13] == null) {
            p = 1;
        } else if (((Double) i[13]).doubleValue() <= -47.12896096911504) {
            p = 1;
        } else if (((Double) i[13]).doubleValue() > -47.12896096911504) {
            p = 0;
        }
        return p;
    }
    static double Nb2a0b5f457(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -1.548562316469372) {
            p = WekaClassifier.N23a50f75458(i);
        } else if (((Double) i[0]).doubleValue() > -1.548562316469372) {
            p = WekaClassifier.N1d89802b464(i);
        }
        return p;
    }
    static double N23a50f75458(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() <= -48.578725035956666) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() > -48.578725035956666) {
            p = WekaClassifier.N153b9585459(i);
        }
        return p;
    }
    static double N153b9585459(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -7.271548690324316) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > -7.271548690324316) {
            p = WekaClassifier.N77b08b57460(i);
        }
        return p;
    }
    static double N77b08b57460(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 1;
        } else if (((Double) i[14]).doubleValue() <= -39.67338023416667) {
            p = WekaClassifier.N2c1b160d461(i);
        } else if (((Double) i[14]).doubleValue() > -39.67338023416667) {
            p = WekaClassifier.N274e6a5c462(i);
        }
        return p;
    }
    static double N2c1b160d461(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() <= -34.45960791215663) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() > -34.45960791215663) {
            p = 1;
        }
        return p;
    }
    static double N274e6a5c462(Object []i) {
        double p = Double.NaN;
        if (i[19] == null) {
            p = 1;
        } else if (((Double) i[19]).doubleValue() <= -43.20868382120596) {
            p = WekaClassifier.N6e10548d463(i);
        } else if (((Double) i[19]).doubleValue() > -43.20868382120596) {
            p = 0;
        }
        return p;
    }
    static double N6e10548d463(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= -33.34604425743373) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() > -33.34604425743373) {
            p = 1;
        }
        return p;
    }
    static double N1d89802b464(Object []i) {
        double p = Double.NaN;
        if (i[13] == null) {
            p = 1;
        } else if (((Double) i[13]).doubleValue() <= -44.28661019072355) {
            p = WekaClassifier.N69d656e9465(i);
        } else if (((Double) i[13]).doubleValue() > -44.28661019072355) {
            p = 1;
        }
        return p;
    }
    static double N69d656e9465(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 1;
        } else if (((Double) i[12]).doubleValue() <= -41.245096223502756) {
            p = 1;
        } else if (((Double) i[12]).doubleValue() > -41.245096223502756) {
            p = 0;
        }
        return p;
    }
    static double N3d1edd05466(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -0.6912949070431864) {
            p = WekaClassifier.N51465217467(i);
        } else if (((Double) i[0]).doubleValue() > -0.6912949070431864) {
            p = WekaClassifier.N5f26e67e482(i);
        }
        return p;
    }
    static double N51465217467(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= -40.07407153413871) {
            p = WekaClassifier.N9f18cc468(i);
        } else if (((Double) i[5]).doubleValue() > -40.07407153413871) {
            p = WekaClassifier.Nb8c6e83472(i);
        }
        return p;
    }
    static double N9f18cc468(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() <= -39.55549105958426) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() > -39.55549105958426) {
            p = WekaClassifier.N5ba57728469(i);
        }
        return p;
    }
    static double N5ba57728469(Object []i) {
        double p = Double.NaN;
        if (i[16] == null) {
            p = 0;
        } else if (((Double) i[16]).doubleValue() <= -48.697039259678085) {
            p = 0;
        } else if (((Double) i[16]).doubleValue() > -48.697039259678085) {
            p = WekaClassifier.N10986fac470(i);
        }
        return p;
    }
    static double N10986fac470(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= -30.78471418027749) {
            p = WekaClassifier.N73ad5142471(i);
        } else if (((Double) i[3]).doubleValue() > -30.78471418027749) {
            p = 1;
        }
        return p;
    }
    static double N73ad5142471(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() <= -30.715861266160164) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() > -30.715861266160164) {
            p = 0;
        }
        return p;
    }
    static double Nb8c6e83472(Object []i) {
        double p = Double.NaN;
        if (i[16] == null) {
            p = 1;
        } else if (((Double) i[16]).doubleValue() <= -48.46380489432862) {
            p = WekaClassifier.N7b6054ed473(i);
        } else if (((Double) i[16]).doubleValue() > -48.46380489432862) {
            p = WekaClassifier.N2856b122474(i);
        }
        return p;
    }
    static double N7b6054ed473(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 1;
        } else if (((Double) i[8]).doubleValue() <= -31.76205355461547) {
            p = 1;
        } else if (((Double) i[8]).doubleValue() > -31.76205355461547) {
            p = 0;
        }
        return p;
    }
    static double N2856b122474(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= -12.905948402674383) {
            p = WekaClassifier.N31e8c22b475(i);
        } else if (((Double) i[1]).doubleValue() > -12.905948402674383) {
            p = WekaClassifier.N51be5077480(i);
        }
        return p;
    }
    static double N31e8c22b475(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 0;
        } else if (((Double) i[9]).doubleValue() <= -33.141281533268895) {
            p = WekaClassifier.N59f84ae3476(i);
        } else if (((Double) i[9]).doubleValue() > -33.141281533268895) {
            p = 1;
        }
        return p;
    }
    static double N59f84ae3476(Object []i) {
        double p = Double.NaN;
        if (i[18] == null) {
            p = 0;
        } else if (((Double) i[18]).doubleValue() <= -40.61856211606259) {
            p = WekaClassifier.N2046aa0d477(i);
        } else if (((Double) i[18]).doubleValue() > -40.61856211606259) {
            p = 0;
        }
        return p;
    }
    static double N2046aa0d477(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() <= -38.91118915566621) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() > -38.91118915566621) {
            p = WekaClassifier.N3d84c086478(i);
        }
        return p;
    }
    static double N3d84c086478(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() <= -36.87172030931695) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() > -36.87172030931695) {
            p = WekaClassifier.N4a0ab487479(i);
        }
        return p;
    }
    static double N4a0ab487479(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() <= -31.98540760316964) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() > -31.98540760316964) {
            p = 1;
        }
        return p;
    }
    static double N51be5077480(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 1;
        } else if (((Double) i[14]).doubleValue() <= -39.42522473917461) {
            p = 1;
        } else if (((Double) i[14]).doubleValue() > -39.42522473917461) {
            p = WekaClassifier.N443d9e8f481(i);
        }
        return p;
    }
    static double N443d9e8f481(Object []i) {
        double p = Double.NaN;
        if (i[18] == null) {
            p = 1;
        } else if (((Double) i[18]).doubleValue() <= -40.690296377481744) {
            p = 1;
        } else if (((Double) i[18]).doubleValue() > -40.690296377481744) {
            p = 0;
        }
        return p;
    }
    static double N5f26e67e482(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= -22.642187679182122) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() > -22.642187679182122) {
            p = WekaClassifier.N4017df91483(i);
        }
        return p;
    }
    static double N4017df91483(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= -0.2402697912792391) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() > -0.2402697912792391) {
            p = 1;
        }
        return p;
    }
    static double N6309020c484(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() <= -24.995694806879392) {
            p = WekaClassifier.N4b682104485(i);
        } else if (((Double) i[3]).doubleValue() > -24.995694806879392) {
            p = 1;
        }
        return p;
    }
    static double N4b682104485(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= -26.052684242100728) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() > -26.052684242100728) {
            p = WekaClassifier.N23953b01486(i);
        }
        return p;
    }
    static double N23953b01486(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -7.549330541297174) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > -7.549330541297174) {
            p = 0;
        }
        return p;
    }
    static double N5d8083b5487(Object []i) {
        double p = Double.NaN;
        if (i[15] == null) {
            p = 1;
        } else if (((Double) i[15]).doubleValue() <= -31.16594115727252) {
            p = WekaClassifier.N76b2e36b488(i);
        } else if (((Double) i[15]).doubleValue() > -31.16594115727252) {
            p = WekaClassifier.N18281a92591(i);
        }
        return p;
    }
    static double N76b2e36b488(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -1.1770208645553453) {
            p = WekaClassifier.N7c589cb8489(i);
        } else if (((Double) i[0]).doubleValue() > -1.1770208645553453) {
            p = WekaClassifier.N54207394560(i);
        }
        return p;
    }
    static double N7c589cb8489(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() <= -41.78978631250448) {
            p = WekaClassifier.N769fed01490(i);
        } else if (((Double) i[4]).doubleValue() > -41.78978631250448) {
            p = WekaClassifier.N60c43c77502(i);
        }
        return p;
    }
    static double N769fed01490(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -4.675482369570361) {
            p = WekaClassifier.N2fdb454c491(i);
        } else if (((Double) i[0]).doubleValue() > -4.675482369570361) {
            p = WekaClassifier.N7616ba41493(i);
        }
        return p;
    }
    static double N2fdb454c491(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() <= -30.450907910215257) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() > -30.450907910215257) {
            p = WekaClassifier.N4e135267492(i);
        }
        return p;
    }
    static double N4e135267492(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= -26.24997275082875) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() > -26.24997275082875) {
            p = 0;
        }
        return p;
    }
    static double N7616ba41493(Object []i) {
        double p = Double.NaN;
        if (i[17] == null) {
            p = 1;
        } else if (((Double) i[17]).doubleValue() <= -36.29649344619483) {
            p = WekaClassifier.N7fe8b667494(i);
        } else if (((Double) i[17]).doubleValue() > -36.29649344619483) {
            p = 1;
        }
        return p;
    }
    static double N7fe8b667494(Object []i) {
        double p = Double.NaN;
        if (i[19] == null) {
            p = 1;
        } else if (((Double) i[19]).doubleValue() <= -39.07280739079603) {
            p = WekaClassifier.Naec7df3495(i);
        } else if (((Double) i[19]).doubleValue() > -39.07280739079603) {
            p = WekaClassifier.N4eb4df24499(i);
        }
        return p;
    }
    static double Naec7df3495(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() <= -47.55695195182194) {
            p = WekaClassifier.N5eb896a3496(i);
        } else if (((Double) i[4]).doubleValue() > -47.55695195182194) {
            p = 1;
        }
        return p;
    }
    static double N5eb896a3496(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= -16.878757594078508) {
            p = WekaClassifier.N1d3ffb87497(i);
        } else if (((Double) i[1]).doubleValue() > -16.878757594078508) {
            p = 1;
        }
        return p;
    }
    static double N1d3ffb87497(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 0;
        } else if (((Double) i[9]).doubleValue() <= -35.139758541993984) {
            p = WekaClassifier.N27de3dc9498(i);
        } else if (((Double) i[9]).doubleValue() > -35.139758541993984) {
            p = 1;
        }
        return p;
    }
    static double N27de3dc9498(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 1;
        } else if (((Double) i[12]).doubleValue() <= -50.326841105762846) {
            p = 1;
        } else if (((Double) i[12]).doubleValue() > -50.326841105762846) {
            p = 0;
        }
        return p;
    }
    static double N4eb4df24499(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 0;
        } else if (((Double) i[11]).doubleValue() <= -31.949201344610838) {
            p = WekaClassifier.N54a355df500(i);
        } else if (((Double) i[11]).doubleValue() > -31.949201344610838) {
            p = 1;
        }
        return p;
    }
    static double N54a355df500(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= -14.132988930190045) {
            p = WekaClassifier.N36227f0f501(i);
        } else if (((Double) i[1]).doubleValue() > -14.132988930190045) {
            p = 1;
        }
        return p;
    }
    static double N36227f0f501(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -3.5022983357362847) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > -3.5022983357362847) {
            p = 0;
        }
        return p;
    }
    static double N60c43c77502(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() <= -34.465096053361385) {
            p = WekaClassifier.N86192b4503(i);
        } else if (((Double) i[3]).doubleValue() > -34.465096053361385) {
            p = WekaClassifier.N6b14aa73525(i);
        }
        return p;
    }
    static double N86192b4503(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= -31.7677462919189) {
            p = WekaClassifier.N462233ca504(i);
        } else if (((Double) i[2]).doubleValue() > -31.7677462919189) {
            p = WekaClassifier.N7a6e13ca513(i);
        }
        return p;
    }
    static double N462233ca504(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() <= -28.96876436894943) {
            p = WekaClassifier.N63dde606505(i);
        } else if (((Double) i[4]).doubleValue() > -28.96876436894943) {
            p = WekaClassifier.Ncf7d0b2512(i);
        }
        return p;
    }
    static double N63dde606505(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() <= -30.089255415881567) {
            p = WekaClassifier.N223b498e506(i);
        } else if (((Double) i[7]).doubleValue() > -30.089255415881567) {
            p = WekaClassifier.N54e34d4510(i);
        }
        return p;
    }
    static double N223b498e506(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= -37.64031437698877) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() > -37.64031437698877) {
            p = WekaClassifier.N26cb9b4f507(i);
        }
        return p;
    }
    static double N26cb9b4f507(Object []i) {
        double p = Double.NaN;
        if (i[19] == null) {
            p = 1;
        } else if (((Double) i[19]).doubleValue() <= -43.829455156277575) {
            p = WekaClassifier.N7120503f508(i);
        } else if (((Double) i[19]).doubleValue() > -43.829455156277575) {
            p = 1;
        }
        return p;
    }
    static double N7120503f508(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= -16.006233642589528) {
            p = WekaClassifier.N7d4175cb509(i);
        } else if (((Double) i[1]).doubleValue() > -16.006233642589528) {
            p = 1;
        }
        return p;
    }
    static double N7d4175cb509(Object []i) {
        double p = Double.NaN;
        if (i[16] == null) {
            p = 0;
        } else if (((Double) i[16]).doubleValue() <= -34.66607989987458) {
            p = 0;
        } else if (((Double) i[16]).doubleValue() > -34.66607989987458) {
            p = 1;
        }
        return p;
    }
    static double N54e34d4510(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() <= -35.601508381324734) {
            p = WekaClassifier.N7fa5c6d1511(i);
        } else if (((Double) i[10]).doubleValue() > -35.601508381324734) {
            p = 1;
        }
        return p;
    }
    static double N7fa5c6d1511(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -6.900995677510231) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > -6.900995677510231) {
            p = 0;
        }
        return p;
    }
    static double Ncf7d0b2512(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() <= -28.643197782562297) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() > -28.643197782562297) {
            p = 1;
        }
        return p;
    }
    static double N7a6e13ca513(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -3.902051301853966) {
            p = WekaClassifier.Nef260c7514(i);
        } else if (((Double) i[0]).doubleValue() > -3.902051301853966) {
            p = WekaClassifier.N7ae38bcb518(i);
        }
        return p;
    }
    static double Nef260c7514(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= -38.270010965653604) {
            p = WekaClassifier.N5fb0bc86515(i);
        } else if (((Double) i[5]).doubleValue() > -38.270010965653604) {
            p = WekaClassifier.N678a2ba5517(i);
        }
        return p;
    }
    static double N5fb0bc86515(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= -22.334162208557302) {
            p = WekaClassifier.N6d709582516(i);
        } else if (((Double) i[2]).doubleValue() > -22.334162208557302) {
            p = 0;
        }
        return p;
    }
    static double N6d709582516(Object []i) {
        double p = Double.NaN;
        if (i[17] == null) {
            p = 0;
        } else if (((Double) i[17]).doubleValue() <= -48.21433859987071) {
            p = 0;
        } else if (((Double) i[17]).doubleValue() > -48.21433859987071) {
            p = 1;
        }
        return p;
    }
    static double N678a2ba5517(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() <= -34.70838033826528) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() > -34.70838033826528) {
            p = 1;
        }
        return p;
    }
    static double N7ae38bcb518(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= -1.6160888249732963) {
            p = WekaClassifier.N20ed4c9d519(i);
        } else if (((Double) i[0]).doubleValue() > -1.6160888249732963) {
            p = WekaClassifier.N532183f0523(i);
        }
        return p;
    }
    static double N20ed4c9d519(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 0;
        } else if (((Double) i[11]).doubleValue() <= -34.14525326411385) {
            p = WekaClassifier.N49d80187520(i);
        } else if (((Double) i[11]).doubleValue() > -34.14525326411385) {
            p = WekaClassifier.N1962bde5522(i);
        }
        return p;
    }
    static double N49d80187520(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= -13.86560434489769) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() > -13.86560434489769) {
            p = WekaClassifier.N7f39dc1a521(i);
        }
        return p;
    }
    static double N7f39dc1a521(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 1;
        } else if (((Double) i[12]).doubleValue() <= -39.08642422104402) {
            p = 1;
        } else if (((Double) i[12]).doubleValue() > -39.08642422104402) {
            p = 0;
        }
        return p;
    }
    static double N1962bde5522(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() <= -34.83364643460895) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() > -34.83364643460895) {
            p = 1;
        }
        return p;
    }
    static double N532183f0523(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= -1.4056080316876134) {
            p = WekaClassifier.N5a7c642a524(i);
        } else if (((Double) i[0]).doubleValue() > -1.4056080316876134) {
            p = 1;
        }
        return p;
    }
    static double N5a7c642a524(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() <= -34.5302714781826) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() > -34.5302714781826) {
            p = 0;
        }
        return p;
    }
    static double N6b14aa73525(Object []i) {
        double p = Double.NaN;
        if (i[18] == null) {
            p = 1;
        } else if (((Double) i[18]).doubleValue() <= -36.42422966429186) {
            p = WekaClassifier.N6715bf61526(i);
        } else if (((Double) i[18]).doubleValue() > -36.42422966429186) {
            p = WekaClassifier.N412d7821554(i);
        }
        return p;
    }
    static double N6715bf61526(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -1.3861980650433523) {
            p = WekaClassifier.N38749e70527(i);
        } else if (((Double) i[0]).doubleValue() > -1.3861980650433523) {
            p = WekaClassifier.N602df724550(i);
        }
        return p;
    }
    static double N38749e70527(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= -46.85016428935137) {
            p = WekaClassifier.N110e060528(i);
        } else if (((Double) i[9]).doubleValue() > -46.85016428935137) {
            p = WekaClassifier.N77fef160534(i);
        }
        return p;
    }
    static double N110e060528(Object []i) {
        double p = Double.NaN;
        if (i[16] == null) {
            p = 1;
        } else if (((Double) i[16]).doubleValue() <= -29.113838443398027) {
            p = WekaClassifier.N4f998503529(i);
        } else if (((Double) i[16]).doubleValue() > -29.113838443398027) {
            p = 0;
        }
        return p;
    }
    static double N4f998503529(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() <= -29.785332826865307) {
            p = WekaClassifier.N53dd526530(i);
        } else if (((Double) i[10]).doubleValue() > -29.785332826865307) {
            p = WekaClassifier.N1c819333533(i);
        }
        return p;
    }
    static double N53dd526530(Object []i) {
        double p = Double.NaN;
        if (i[19] == null) {
            p = 1;
        } else if (((Double) i[19]).doubleValue() <= -37.7354772529351) {
            p = WekaClassifier.N19a64cef531(i);
        } else if (((Double) i[19]).doubleValue() > -37.7354772529351) {
            p = 1;
        }
        return p;
    }
    static double N19a64cef531(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= -15.150846049706502) {
            p = WekaClassifier.N1fb3bc5b532(i);
        } else if (((Double) i[1]).doubleValue() > -15.150846049706502) {
            p = 1;
        }
        return p;
    }
    static double N1fb3bc5b532(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= -59.447110296312786) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() > -59.447110296312786) {
            p = 0;
        }
        return p;
    }
    static double N1c819333533(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 0;
        } else if (((Double) i[11]).doubleValue() <= -38.38858155527717) {
            p = 0;
        } else if (((Double) i[11]).doubleValue() > -38.38858155527717) {
            p = 1;
        }
        return p;
    }
    static double N77fef160534(Object []i) {
        double p = Double.NaN;
        if (i[16] == null) {
            p = 1;
        } else if (((Double) i[16]).doubleValue() <= -37.2000068308371) {
            p = WekaClassifier.N5c140a44535(i);
        } else if (((Double) i[16]).doubleValue() > -37.2000068308371) {
            p = WekaClassifier.N79348a5b542(i);
        }
        return p;
    }
    static double N5c140a44535(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 1;
        } else if (((Double) i[6]).doubleValue() <= -38.0517853331115) {
            p = WekaClassifier.N5ec734f9536(i);
        } else if (((Double) i[6]).doubleValue() > -38.0517853331115) {
            p = 1;
        }
        return p;
    }
    static double N5ec734f9536(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -4.131839660973107) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > -4.131839660973107) {
            p = WekaClassifier.N4e4f3c19537(i);
        }
        return p;
    }
    static double N4e4f3c19537(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= -31.759822237821435) {
            p = WekaClassifier.N4ebab141538(i);
        } else if (((Double) i[5]).doubleValue() > -31.759822237821435) {
            p = 0;
        }
        return p;
    }
    static double N4ebab141538(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= -18.39840318522097) {
            p = WekaClassifier.N3200c4f8539(i);
        } else if (((Double) i[1]).doubleValue() > -18.39840318522097) {
            p = WekaClassifier.N55875ebd540(i);
        }
        return p;
    }
    static double N3200c4f8539(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= -38.49505188285043) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() > -38.49505188285043) {
            p = 0;
        }
        return p;
    }
    static double N55875ebd540(Object []i) {
        double p = Double.NaN;
        if (i[13] == null) {
            p = 1;
        } else if (((Double) i[13]).doubleValue() <= -47.202976219127954) {
            p = WekaClassifier.N621f1fe0541(i);
        } else if (((Double) i[13]).doubleValue() > -47.202976219127954) {
            p = 1;
        }
        return p;
    }
    static double N621f1fe0541(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= -27.084942501230096) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() > -27.084942501230096) {
            p = 0;
        }
        return p;
    }
    static double N79348a5b542(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= -15.52132643553956) {
            p = WekaClassifier.N4d27b681543(i);
        } else if (((Double) i[1]).doubleValue() > -15.52132643553956) {
            p = WekaClassifier.N15188217547(i);
        }
        return p;
    }
    static double N4d27b681543(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 1;
        } else if (((Double) i[6]).doubleValue() <= -35.50358980919662) {
            p = 1;
        } else if (((Double) i[6]).doubleValue() > -35.50358980919662) {
            p = WekaClassifier.N22ba6b2e544(i);
        }
        return p;
    }
    static double N22ba6b2e544(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 1;
        } else if (((Double) i[14]).doubleValue() <= -32.942060805493796) {
            p = WekaClassifier.N38409086545(i);
        } else if (((Double) i[14]).doubleValue() > -32.942060805493796) {
            p = WekaClassifier.N657ba387546(i);
        }
        return p;
    }
    static double N38409086545(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() <= -33.040434682351005) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() > -33.040434682351005) {
            p = 1;
        }
        return p;
    }
    static double N657ba387546(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= -2.7680901333128745) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() > -2.7680901333128745) {
            p = 1;
        }
        return p;
    }
    static double N15188217547(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() <= -32.876243340619425) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() > -32.876243340619425) {
            p = WekaClassifier.N640a6881548(i);
        }
        return p;
    }
    static double N640a6881548(Object []i) {
        double p = Double.NaN;
        if (i[15] == null) {
            p = 1;
        } else if (((Double) i[15]).doubleValue() <= -40.45598957523789) {
            p = 1;
        } else if (((Double) i[15]).doubleValue() > -40.45598957523789) {
            p = WekaClassifier.N58f20026549(i);
        }
        return p;
    }
    static double N58f20026549(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() <= -27.282886108163005) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() > -27.282886108163005) {
            p = 1;
        }
        return p;
    }
    static double N602df724550(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() <= -36.05857878428084) {
            p = WekaClassifier.N3174d90c551(i);
        } else if (((Double) i[10]).doubleValue() > -36.05857878428084) {
            p = 1;
        }
        return p;
    }
    static double N3174d90c551(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() <= -43.27895731671653) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() > -43.27895731671653) {
            p = WekaClassifier.N60de1c3552(i);
        }
        return p;
    }
    static double N60de1c3552(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 0;
        } else if (((Double) i[9]).doubleValue() <= -32.78716847619961) {
            p = WekaClassifier.N4e363214553(i);
        } else if (((Double) i[9]).doubleValue() > -32.78716847619961) {
            p = 1;
        }
        return p;
    }
    static double N4e363214553(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= -30.42305315543169) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() > -30.42305315543169) {
            p = 0;
        }
        return p;
    }
    static double N412d7821554(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= -6.20981645945206) {
            p = WekaClassifier.N568665b1555(i);
        } else if (((Double) i[0]).doubleValue() > -6.20981645945206) {
            p = 1;
        }
        return p;
    }
    static double N568665b1555(Object []i) {
        double p = Double.NaN;
        if (i[16] == null) {
            p = 1;
        } else if (((Double) i[16]).doubleValue() <= -45.304514559400666) {
            p = 1;
        } else if (((Double) i[16]).doubleValue() > -45.304514559400666) {
            p = WekaClassifier.N3f6c855b556(i);
        }
        return p;
    }
    static double N3f6c855b556(Object []i) {
        double p = Double.NaN;
        if (i[17] == null) {
            p = 0;
        } else if (((Double) i[17]).doubleValue() <= -40.66221558411888) {
            p = 0;
        } else if (((Double) i[17]).doubleValue() > -40.66221558411888) {
            p = WekaClassifier.N4035b630557(i);
        }
        return p;
    }
    static double N4035b630557(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 1;
        } else if (((Double) i[11]).doubleValue() <= -38.900633264921765) {
            p = WekaClassifier.N6a733267558(i);
        } else if (((Double) i[11]).doubleValue() > -38.900633264921765) {
            p = WekaClassifier.Nf3d7975559(i);
        }
        return p;
    }
    static double N6a733267558(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 0;
        } else if (((Double) i[12]).doubleValue() <= -43.04934527569839) {
            p = 0;
        } else if (((Double) i[12]).doubleValue() > -43.04934527569839) {
            p = 1;
        }
        return p;
    }
    static double Nf3d7975559(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() <= -37.067044342218864) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() > -37.067044342218864) {
            p = 1;
        }
        return p;
    }
    static double N54207394560(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 1;
        } else if (((Double) i[14]).doubleValue() <= -35.174236040143) {
            p = WekaClassifier.N39c9db16561(i);
        } else if (((Double) i[14]).doubleValue() > -35.174236040143) {
            p = WekaClassifier.N4d4c4e6c589(i);
        }
        return p;
    }
    static double N39c9db16561(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= -33.49172741963692) {
            p = WekaClassifier.N4ada2642562(i);
        } else if (((Double) i[5]).doubleValue() > -33.49172741963692) {
            p = WekaClassifier.Na4525be575(i);
        }
        return p;
    }
    static double N4ada2642562(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() <= -41.93334458319677) {
            p = WekaClassifier.N2e4808bd563(i);
        } else if (((Double) i[4]).doubleValue() > -41.93334458319677) {
            p = WekaClassifier.N1c8ec556570(i);
        }
        return p;
    }
    static double N2e4808bd563(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= -28.66201639205342) {
            p = WekaClassifier.N79236233564(i);
        } else if (((Double) i[3]).doubleValue() > -28.66201639205342) {
            p = WekaClassifier.N15b6d8c6566(i);
        }
        return p;
    }
    static double N79236233564(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= -35.024312643294444) {
            p = WekaClassifier.Nec5076a565(i);
        } else if (((Double) i[2]).doubleValue() > -35.024312643294444) {
            p = 1;
        }
        return p;
    }
    static double Nec5076a565(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= -0.9560010401729357) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() > -0.9560010401729357) {
            p = 1;
        }
        return p;
    }
    static double N15b6d8c6566(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() <= -28.067651337038313) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() > -28.067651337038313) {
            p = WekaClassifier.N7bd5272d567(i);
        }
        return p;
    }
    static double N7bd5272d567(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= -16.71211094239532) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() > -16.71211094239532) {
            p = WekaClassifier.N1905f09e568(i);
        }
        return p;
    }
    static double N1905f09e568(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 0;
        } else if (((Double) i[14]).doubleValue() <= -49.25954874086611) {
            p = WekaClassifier.N3fdd5a83569(i);
        } else if (((Double) i[14]).doubleValue() > -49.25954874086611) {
            p = 1;
        }
        return p;
    }
    static double N3fdd5a83569(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -0.21483816288439073) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > -0.21483816288439073) {
            p = 0;
        }
        return p;
    }
    static double N1c8ec556570(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -0.028642494795150242) {
            p = WekaClassifier.N4e3065a5571(i);
        } else if (((Double) i[0]).doubleValue() > -0.028642494795150242) {
            p = WekaClassifier.N47956da4574(i);
        }
        return p;
    }
    static double N4e3065a5571(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 1;
        } else if (((Double) i[14]).doubleValue() <= -61.33780962155362) {
            p = WekaClassifier.N7887edfd572(i);
        } else if (((Double) i[14]).doubleValue() > -61.33780962155362) {
            p = 1;
        }
        return p;
    }
    static double N7887edfd572(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= -15.326606799618688) {
            p = WekaClassifier.N2d5ba92c573(i);
        } else if (((Double) i[1]).doubleValue() > -15.326606799618688) {
            p = 1;
        }
        return p;
    }
    static double N2d5ba92c573(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= -27.39661627735616) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() > -27.39661627735616) {
            p = 0;
        }
        return p;
    }
    static double N47956da4574(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() <= -35.3779000875875) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() > -35.3779000875875) {
            p = 1;
        }
        return p;
    }
    static double Na4525be575(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() <= -31.93536221909027) {
            p = WekaClassifier.N4deac90e576(i);
        } else if (((Double) i[4]).doubleValue() > -31.93536221909027) {
            p = 1;
        }
        return p;
    }
    static double N4deac90e576(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 0;
        } else if (((Double) i[12]).doubleValue() <= -41.55174243748188) {
            p = WekaClassifier.N3d881b56577(i);
        } else if (((Double) i[12]).doubleValue() > -41.55174243748188) {
            p = WekaClassifier.N68c59159585(i);
        }
        return p;
    }
    static double N3d881b56577(Object []i) {
        double p = Double.NaN;
        if (i[13] == null) {
            p = 1;
        } else if (((Double) i[13]).doubleValue() <= -39.17555150388644) {
            p = WekaClassifier.N511ca90e578(i);
        } else if (((Double) i[13]).doubleValue() > -39.17555150388644) {
            p = WekaClassifier.N20217034582(i);
        }
        return p;
    }
    static double N511ca90e578(Object []i) {
        double p = Double.NaN;
        if (i[15] == null) {
            p = 0;
        } else if (((Double) i[15]).doubleValue() <= -58.93344320424185) {
            p = 0;
        } else if (((Double) i[15]).doubleValue() > -58.93344320424185) {
            p = WekaClassifier.N72571e46579(i);
        }
        return p;
    }
    static double N72571e46579(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= -25.143078302526934) {
            p = WekaClassifier.N69ee0bbb580(i);
        } else if (((Double) i[3]).doubleValue() > -25.143078302526934) {
            p = WekaClassifier.N14c1ff7b581(i);
        }
        return p;
    }
    static double N69ee0bbb580(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= -41.089032605613156) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() > -41.089032605613156) {
            p = 1;
        }
        return p;
    }
    static double N14c1ff7b581(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 1;
        } else if (((Double) i[12]).doubleValue() <= -54.17506686300757) {
            p = 1;
        } else if (((Double) i[12]).doubleValue() > -54.17506686300757) {
            p = 0;
        }
        return p;
    }
    static double N20217034582(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= -0.25818684123338187) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() > -0.25818684123338187) {
            p = WekaClassifier.N6a4eef58583(i);
        }
        return p;
    }
    static double N6a4eef58583(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() <= -37.1951286171158) {
            p = WekaClassifier.N73e48279584(i);
        } else if (((Double) i[6]).doubleValue() > -37.1951286171158) {
            p = 1;
        }
        return p;
    }
    static double N73e48279584(Object []i) {
        double p = Double.NaN;
        if (i[16] == null) {
            p = 0;
        } else if (((Double) i[16]).doubleValue() <= -39.17086299503103) {
            p = 0;
        } else if (((Double) i[16]).doubleValue() > -39.17086299503103) {
            p = 1;
        }
        return p;
    }
    static double N68c59159585(Object []i) {
        double p = Double.NaN;
        if (i[17] == null) {
            p = 1;
        } else if (((Double) i[17]).doubleValue() <= -39.31547464296126) {
            p = 1;
        } else if (((Double) i[17]).doubleValue() > -39.31547464296126) {
            p = WekaClassifier.N43ceeca5586(i);
        }
        return p;
    }
    static double N43ceeca5586(Object []i) {
        double p = Double.NaN;
        if (i[16] == null) {
            p = 0;
        } else if (((Double) i[16]).doubleValue() <= -39.19895192137163) {
            p = WekaClassifier.N5ee7efab587(i);
        } else if (((Double) i[16]).doubleValue() > -39.19895192137163) {
            p = 1;
        }
        return p;
    }
    static double N5ee7efab587(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= -39.487867718602345) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() > -39.487867718602345) {
            p = WekaClassifier.N9474944588(i);
        }
        return p;
    }
    static double N9474944588(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 1;
        } else if (((Double) i[14]).doubleValue() <= -39.22327076356774) {
            p = 1;
        } else if (((Double) i[14]).doubleValue() > -39.22327076356774) {
            p = 0;
        }
        return p;
    }
    static double N4d4c4e6c589(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -0.06668147828142423) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > -0.06668147828142423) {
            p = WekaClassifier.N795338a4590(i);
        }
        return p;
    }
    static double N795338a4590(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() <= -34.12046051037042) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() > -34.12046051037042) {
            p = 0;
        }
        return p;
    }
    static double N18281a92591(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() <= -32.59635313084262) {
            p = WekaClassifier.N2b966dba592(i);
        } else if (((Double) i[3]).doubleValue() > -32.59635313084262) {
            p = WekaClassifier.N2437ccad596(i);
        }
        return p;
    }
    static double N2b966dba592(Object []i) {
        double p = Double.NaN;
        if (i[19] == null) {
            p = 0;
        } else if (((Double) i[19]).doubleValue() <= -31.953468378797954) {
            p = WekaClassifier.N406798a593(i);
        } else if (((Double) i[19]).doubleValue() > -31.953468378797954) {
            p = WekaClassifier.N3c549d20595(i);
        }
        return p;
    }
    static double N406798a593(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= -43.24098771635252) {
            p = WekaClassifier.N6470e7b6594(i);
        } else if (((Double) i[4]).doubleValue() > -43.24098771635252) {
            p = 0;
        }
        return p;
    }
    static double N6470e7b6594(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= -17.0920349765465) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() > -17.0920349765465) {
            p = 1;
        }
        return p;
    }
    static double N3c549d20595(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= -2.3905046478923424) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() > -2.3905046478923424) {
            p = 1;
        }
        return p;
    }
    static double N2437ccad596(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() <= -29.98149172899855) {
            p = WekaClassifier.N134a2b88597(i);
        } else if (((Double) i[10]).doubleValue() > -29.98149172899855) {
            p = 1;
        }
        return p;
    }
    static double N134a2b88597(Object []i) {
        double p = Double.NaN;
        if (i[15] == null) {
            p = 0;
        } else if (((Double) i[15]).doubleValue() <= -26.847176026583483) {
            p = WekaClassifier.N70e42300598(i);
        } else if (((Double) i[15]).doubleValue() > -26.847176026583483) {
            p = 1;
        }
        return p;
    }
    static double N70e42300598(Object []i) {
        double p = Double.NaN;
        if (i[13] == null) {
            p = 0;
        } else if (((Double) i[13]).doubleValue() <= -43.396894207541514) {
            p = 0;
        } else if (((Double) i[13]).doubleValue() > -43.396894207541514) {
            p = WekaClassifier.N68410da1599(i);
        }
        return p;
    }
    static double N68410da1599(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 1;
        } else if (((Double) i[8]).doubleValue() <= -35.35793258400382) {
            p = WekaClassifier.N7289f6a0600(i);
        } else if (((Double) i[8]).doubleValue() > -35.35793258400382) {
            p = 0;
        }
        return p;
    }
    static double N7289f6a0600(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 0;
        } else if (((Double) i[9]).doubleValue() <= -52.04252977170314) {
            p = 0;
        } else if (((Double) i[9]).doubleValue() > -52.04252977170314) {
            p = WekaClassifier.N305d9512601(i);
        }
        return p;
    }
    static double N305d9512601(Object []i) {
        double p = Double.NaN;
        if (i[13] == null) {
            p = 1;
        } else if (((Double) i[13]).doubleValue() <= -35.283111792867054) {
            p = 1;
        } else if (((Double) i[13]).doubleValue() > -35.283111792867054) {
            p = 0;
        }
        return p;
    }
    static double N61f04c3a602(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= -2.2538281694377886) {
            p = WekaClassifier.N1bc69a0603(i);
        } else if (((Double) i[0]).doubleValue() > -2.2538281694377886) {
            p = WekaClassifier.N68666f3e629(i);
        }
        return p;
    }
    static double N1bc69a0603(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() <= -36.4887936951571) {
            p = WekaClassifier.N3c3da3c1604(i);
        } else if (((Double) i[8]).doubleValue() > -36.4887936951571) {
            p = WekaClassifier.N72c04fff614(i);
        }
        return p;
    }
    static double N3c3da3c1604(Object []i) {
        double p = Double.NaN;
        if (i[16] == null) {
            p = 0;
        } else if (((Double) i[16]).doubleValue() <= -30.342902479471153) {
            p = WekaClassifier.N60144451605(i);
        } else if (((Double) i[16]).doubleValue() > -30.342902479471153) {
            p = WekaClassifier.N69ee2d5612(i);
        }
        return p;
    }
    static double N60144451605(Object []i) {
        double p = Double.NaN;
        if (i[15] == null) {
            p = 0;
        } else if (((Double) i[15]).doubleValue() <= -31.451592989699662) {
            p = WekaClassifier.N36645f5606(i);
        } else if (((Double) i[15]).doubleValue() > -31.451592989699662) {
            p = WekaClassifier.Ncdb55b3611(i);
        }
        return p;
    }
    static double N36645f5606(Object []i) {
        double p = Double.NaN;
        if (i[18] == null) {
            p = 0;
        } else if (((Double) i[18]).doubleValue() <= -35.388551393856744) {
            p = WekaClassifier.N6175cd50607(i);
        } else if (((Double) i[18]).doubleValue() > -35.388551393856744) {
            p = 0;
        }
        return p;
    }
    static double N6175cd50607(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() <= -30.734738176448907) {
            p = WekaClassifier.N30074914608(i);
        } else if (((Double) i[10]).doubleValue() > -30.734738176448907) {
            p = 0;
        }
        return p;
    }
    static double N30074914608(Object []i) {
        double p = Double.NaN;
        if (i[17] == null) {
            p = 0;
        } else if (((Double) i[17]).doubleValue() <= -33.197750344361964) {
            p = WekaClassifier.N72f3b589609(i);
        } else if (((Double) i[17]).doubleValue() > -33.197750344361964) {
            p = WekaClassifier.N430b0fcf610(i);
        }
        return p;
    }
    static double N72f3b589609(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() <= -31.07430100530069) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() > -31.07430100530069) {
            p = 1;
        }
        return p;
    }
    static double N430b0fcf610(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() <= -32.545171402478786) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() > -32.545171402478786) {
            p = 0;
        }
        return p;
    }
    static double Ncdb55b3611(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() <= -30.634978687156245) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() > -30.634978687156245) {
            p = 1;
        }
        return p;
    }
    static double N69ee2d5612(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= -17.41911956741653) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() > -17.41911956741653) {
            p = WekaClassifier.N69ae5072613(i);
        }
        return p;
    }
    static double N69ae5072613(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 1;
        } else if (((Double) i[11]).doubleValue() <= -33.24330974996236) {
            p = 1;
        } else if (((Double) i[11]).doubleValue() > -33.24330974996236) {
            p = 0;
        }
        return p;
    }
    static double N72c04fff614(Object []i) {
        double p = Double.NaN;
        if (i[17] == null) {
            p = 0;
        } else if (((Double) i[17]).doubleValue() <= -29.92912532227336) {
            p = WekaClassifier.N24e0ead9615(i);
        } else if (((Double) i[17]).doubleValue() > -29.92912532227336) {
            p = 1;
        }
        return p;
    }
    static double N24e0ead9615(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 1;
        } else if (((Double) i[6]).doubleValue() <= -41.56704599296751) {
            p = WekaClassifier.N55193cda616(i);
        } else if (((Double) i[6]).doubleValue() > -41.56704599296751) {
            p = WekaClassifier.N1df54971619(i);
        }
        return p;
    }
    static double N55193cda616(Object []i) {
        double p = Double.NaN;
        if (i[15] == null) {
            p = 1;
        } else if (((Double) i[15]).doubleValue() <= -29.41796688945366) {
            p = WekaClassifier.N4eafcbcb617(i);
        } else if (((Double) i[15]).doubleValue() > -29.41796688945366) {
            p = 0;
        }
        return p;
    }
    static double N4eafcbcb617(Object []i) {
        double p = Double.NaN;
        if (i[15] == null) {
            p = 0;
        } else if (((Double) i[15]).doubleValue() <= -42.03942287721512) {
            p = WekaClassifier.N3ee0ca56618(i);
        } else if (((Double) i[15]).doubleValue() > -42.03942287721512) {
            p = 1;
        }
        return p;
    }
    static double N3ee0ca56618(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= -45.15027047009134) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() > -45.15027047009134) {
            p = 0;
        }
        return p;
    }
    static double N1df54971619(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 0;
        } else if (((Double) i[5]).doubleValue() <= -36.091569661643604) {
            p = WekaClassifier.N11659f9620(i);
        } else if (((Double) i[5]).doubleValue() > -36.091569661643604) {
            p = WekaClassifier.N53dedbb625(i);
        }
        return p;
    }
    static double N11659f9620(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= -4.1000078833363816) {
            p = WekaClassifier.N31d73b83621(i);
        } else if (((Double) i[0]).doubleValue() > -4.1000078833363816) {
            p = 0;
        }
        return p;
    }
    static double N31d73b83621(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() <= -30.308939881123884) {
            p = WekaClassifier.N9ddf595622(i);
        } else if (((Double) i[10]).doubleValue() > -30.308939881123884) {
            p = WekaClassifier.Ndbed4ac624(i);
        }
        return p;
    }
    static double N9ddf595622(Object []i) {
        double p = Double.NaN;
        if (i[15] == null) {
            p = 1;
        } else if (((Double) i[15]).doubleValue() <= -30.894853502820446) {
            p = WekaClassifier.N3ed49b1e623(i);
        } else if (((Double) i[15]).doubleValue() > -30.894853502820446) {
            p = 0;
        }
        return p;
    }
    static double N3ed49b1e623(Object []i) {
        double p = Double.NaN;
        if (i[17] == null) {
            p = 0;
        } else if (((Double) i[17]).doubleValue() <= -41.67789014598006) {
            p = 0;
        } else if (((Double) i[17]).doubleValue() > -41.67789014598006) {
            p = 1;
        }
        return p;
    }
    static double Ndbed4ac624(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 0;
        } else if (((Double) i[7]).doubleValue() <= -28.594056411006562) {
            p = 0;
        } else if (((Double) i[7]).doubleValue() > -28.594056411006562) {
            p = 1;
        }
        return p;
    }
    static double N53dedbb625(Object []i) {
        double p = Double.NaN;
        if (i[18] == null) {
            p = 0;
        } else if (((Double) i[18]).doubleValue() <= -36.00234638854937) {
            p = WekaClassifier.N632ac1d4626(i);
        } else if (((Double) i[18]).doubleValue() > -36.00234638854937) {
            p = 0;
        }
        return p;
    }
    static double N632ac1d4626(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() <= -26.559442979880007) {
            p = WekaClassifier.N79bcaac4627(i);
        } else if (((Double) i[8]).doubleValue() > -26.559442979880007) {
            p = 1;
        }
        return p;
    }
    static double N79bcaac4627(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= -5.811207330887775) {
            p = WekaClassifier.N2dc1aeb628(i);
        } else if (((Double) i[0]).doubleValue() > -5.811207330887775) {
            p = 0;
        }
        return p;
    }
    static double N2dc1aeb628(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= -32.225603647252974) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() > -32.225603647252974) {
            p = 1;
        }
        return p;
    }
    static double N68666f3e629(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 0;
        } else if (((Double) i[11]).doubleValue() <= -34.28661492217704) {
            p = WekaClassifier.N5d772787630(i);
        } else if (((Double) i[11]).doubleValue() > -34.28661492217704) {
            p = WekaClassifier.N78ac8922633(i);
        }
        return p;
    }
    static double N5d772787630(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() <= -26.766469778169416) {
            p = WekaClassifier.N41814c67631(i);
        } else if (((Double) i[3]).doubleValue() > -26.766469778169416) {
            p = 1;
        }
        return p;
    }
    static double N41814c67631(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() <= -48.43825796167058) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() > -48.43825796167058) {
            p = WekaClassifier.N23e80dfe632(i);
        }
        return p;
    }
    static double N23e80dfe632(Object []i) {
        double p = Double.NaN;
        if (i[16] == null) {
            p = 0;
        } else if (((Double) i[16]).doubleValue() <= -37.42128223824797) {
            p = 0;
        } else if (((Double) i[16]).doubleValue() > -37.42128223824797) {
            p = 1;
        }
        return p;
    }
    static double N78ac8922633(Object []i) {
        double p = Double.NaN;
        if (i[17] == null) {
            p = 1;
        } else if (((Double) i[17]).doubleValue() <= -28.680661223198456) {
            p = WekaClassifier.N1c03d2af634(i);
        } else if (((Double) i[17]).doubleValue() > -28.680661223198456) {
            p = 0;
        }
        return p;
    }
    static double N1c03d2af634(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -1.9011270504455027) {
            p = WekaClassifier.N57aa573c635(i);
        } else if (((Double) i[0]).doubleValue() > -1.9011270504455027) {
            p = 1;
        }
        return p;
    }
    static double N57aa573c635(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() <= -31.593988858276948) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() > -31.593988858276948) {
            p = 1;
        }
        return p;
    }
    static double N344e37ca636(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= -28.875420190346873) {
            p = WekaClassifier.N28b75df8637(i);
        } else if (((Double) i[3]).doubleValue() > -28.875420190346873) {
            p = WekaClassifier.N6113d20e700(i);
        }
        return p;
    }
    static double N28b75df8637(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() <= -26.436889906168094) {
            p = WekaClassifier.N2aa374eb638(i);
        } else if (((Double) i[10]).doubleValue() > -26.436889906168094) {
            p = WekaClassifier.N4cb8562b697(i);
        }
        return p;
    }
    static double N2aa374eb638(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= -3.0793277330245132) {
            p = WekaClassifier.N2f35d534639(i);
        } else if (((Double) i[0]).doubleValue() > -3.0793277330245132) {
            p = WekaClassifier.N4474ad2b662(i);
        }
        return p;
    }
    static double N2f35d534639(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() <= -32.78440998053746) {
            p = WekaClassifier.N6a00577f640(i);
        } else if (((Double) i[4]).doubleValue() > -32.78440998053746) {
            p = WekaClassifier.N2952947c649(i);
        }
        return p;
    }
    static double N6a00577f640(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 1;
        } else if (((Double) i[8]).doubleValue() <= -33.61464899326907) {
            p = WekaClassifier.N784a9f5a641(i);
        } else if (((Double) i[8]).doubleValue() > -33.61464899326907) {
            p = 1;
        }
        return p;
    }
    static double N784a9f5a641(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 1;
        } else if (((Double) i[11]).doubleValue() <= -32.69098578343245) {
            p = WekaClassifier.N497fb894642(i);
        } else if (((Double) i[11]).doubleValue() > -32.69098578343245) {
            p = 1;
        }
        return p;
    }
    static double N497fb894642(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -3.293617077994213) {
            p = WekaClassifier.N48e258fa643(i);
        } else if (((Double) i[0]).doubleValue() > -3.293617077994213) {
            p = 0;
        }
        return p;
    }
    static double N48e258fa643(Object []i) {
        double p = Double.NaN;
        if (i[17] == null) {
            p = 1;
        } else if (((Double) i[17]).doubleValue() <= -37.35892400361334) {
            p = WekaClassifier.N20314536644(i);
        } else if (((Double) i[17]).doubleValue() > -37.35892400361334) {
            p = 1;
        }
        return p;
    }
    static double N20314536644(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= -24.330922844963723) {
            p = WekaClassifier.Ncadbe25645(i);
        } else if (((Double) i[2]).doubleValue() > -24.330922844963723) {
            p = 1;
        }
        return p;
    }
    static double Ncadbe25645(Object []i) {
        double p = Double.NaN;
        if (i[16] == null) {
            p = 1;
        } else if (((Double) i[16]).doubleValue() <= -36.25602616156892) {
            p = WekaClassifier.N38a21c3c646(i);
        } else if (((Double) i[16]).doubleValue() > -36.25602616156892) {
            p = WekaClassifier.N486f57c2648(i);
        }
        return p;
    }
    static double N38a21c3c646(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 1;
        } else if (((Double) i[12]).doubleValue() <= -38.06695222334789) {
            p = 1;
        } else if (((Double) i[12]).doubleValue() > -38.06695222334789) {
            p = WekaClassifier.N62dda65a647(i);
        }
        return p;
    }
    static double N62dda65a647(Object []i) {
        double p = Double.NaN;
        if (i[19] == null) {
            p = 1;
        } else if (((Double) i[19]).doubleValue() <= -42.536099167101085) {
            p = 1;
        } else if (((Double) i[19]).doubleValue() > -42.536099167101085) {
            p = 0;
        }
        return p;
    }
    static double N486f57c2648(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= -17.00713756333892) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() > -17.00713756333892) {
            p = 0;
        }
        return p;
    }
    static double N2952947c649(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 0;
        } else if (((Double) i[5]).doubleValue() <= -24.888269594970918) {
            p = WekaClassifier.N1b92e96650(i);
        } else if (((Double) i[5]).doubleValue() > -24.888269594970918) {
            p = WekaClassifier.N102ddc38661(i);
        }
        return p;
    }
    static double N1b92e96650(Object []i) {
        double p = Double.NaN;
        if (i[17] == null) {
            p = 0;
        } else if (((Double) i[17]).doubleValue() <= -30.4650351796519) {
            p = WekaClassifier.Ne59a78d651(i);
        } else if (((Double) i[17]).doubleValue() > -30.4650351796519) {
            p = 1;
        }
        return p;
    }
    static double Ne59a78d651(Object []i) {
        double p = Double.NaN;
        if (i[15] == null) {
            p = 0;
        } else if (((Double) i[15]).doubleValue() <= -35.474963817094945) {
            p = WekaClassifier.N3cba20c3652(i);
        } else if (((Double) i[15]).doubleValue() > -35.474963817094945) {
            p = WekaClassifier.N251f1933659(i);
        }
        return p;
    }
    static double N3cba20c3652(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() <= -35.47973020633788) {
            p = WekaClassifier.N1f6b25c653(i);
        } else if (((Double) i[8]).doubleValue() > -35.47973020633788) {
            p = WekaClassifier.N5fa2ef8658(i);
        }
        return p;
    }
    static double N1f6b25c653(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 0;
        } else if (((Double) i[12]).doubleValue() <= -32.213451552434584) {
            p = WekaClassifier.N4973e16a654(i);
        } else if (((Double) i[12]).doubleValue() > -32.213451552434584) {
            p = 0;
        }
        return p;
    }
    static double N4973e16a654(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= -15.901585842630013) {
            p = WekaClassifier.Na554206655(i);
        } else if (((Double) i[1]).doubleValue() > -15.901585842630013) {
            p = WekaClassifier.N5354fd49657(i);
        }
        return p;
    }
    static double Na554206655(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 1;
        } else if (((Double) i[14]).doubleValue() <= -30.776330881376346) {
            p = WekaClassifier.N6784c7b7656(i);
        } else if (((Double) i[14]).doubleValue() > -30.776330881376346) {
            p = 0;
        }
        return p;
    }
    static double N6784c7b7656(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= -35.61168748469925) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() > -35.61168748469925) {
            p = 0;
        }
        return p;
    }
    static double N5354fd49657(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 0;
        } else if (((Double) i[14]).doubleValue() <= -35.21489487084476) {
            p = 0;
        } else if (((Double) i[14]).doubleValue() > -35.21489487084476) {
            p = 1;
        }
        return p;
    }
    static double N5fa2ef8658(Object []i) {
        double p = Double.NaN;
        if (i[17] == null) {
            p = 0;
        } else if (((Double) i[17]).doubleValue() <= -42.529367414108634) {
            p = 0;
        } else if (((Double) i[17]).doubleValue() > -42.529367414108634) {
            p = 1;
        }
        return p;
    }
    static double N251f1933659(Object []i) {
        double p = Double.NaN;
        if (i[18] == null) {
            p = 0;
        } else if (((Double) i[18]).doubleValue() <= -48.836957805636295) {
            p = WekaClassifier.N64e7cb58660(i);
        } else if (((Double) i[18]).doubleValue() > -48.836957805636295) {
            p = 0;
        }
        return p;
    }
    static double N64e7cb58660(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() <= -34.974460483110775) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() > -34.974460483110775) {
            p = 1;
        }
        return p;
    }
    static double N102ddc38661(Object []i) {
        double p = Double.NaN;
        if (i[18] == null) {
            p = 1;
        } else if (((Double) i[18]).doubleValue() <= -32.94559469417179) {
            p = 1;
        } else if (((Double) i[18]).doubleValue() > -32.94559469417179) {
            p = 0;
        }
        return p;
    }
    static double N4474ad2b662(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -0.1870282867911044) {
            p = WekaClassifier.N19fff217663(i);
        } else if (((Double) i[0]).doubleValue() > -0.1870282867911044) {
            p = WekaClassifier.N475447b1689(i);
        }
        return p;
    }
    static double N19fff217663(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() <= -29.23244996441458) {
            p = WekaClassifier.N4398477b664(i);
        } else if (((Double) i[7]).doubleValue() > -29.23244996441458) {
            p = WekaClassifier.N4428c1bf684(i);
        }
        return p;
    }
    static double N4398477b664(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 1;
        } else if (((Double) i[12]).doubleValue() <= -43.97119097991592) {
            p = WekaClassifier.N3daa8f2c665(i);
        } else if (((Double) i[12]).doubleValue() > -43.97119097991592) {
            p = WekaClassifier.N68ef2891676(i);
        }
        return p;
    }
    static double N3daa8f2c665(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 1;
        } else if (((Double) i[14]).doubleValue() <= -38.70798920551518) {
            p = WekaClassifier.N5c566047666(i);
        } else if (((Double) i[14]).doubleValue() > -38.70798920551518) {
            p = WekaClassifier.N45c88cd2673(i);
        }
        return p;
    }
    static double N5c566047666(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -1.868660757651945) {
            p = WekaClassifier.N3adf5e90667(i);
        } else if (((Double) i[0]).doubleValue() > -1.868660757651945) {
            p = WekaClassifier.N3b7d652f668(i);
        }
        return p;
    }
    static double N3adf5e90667(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= -34.297924938603586) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() > -34.297924938603586) {
            p = 0;
        }
        return p;
    }
    static double N3b7d652f668(Object []i) {
        double p = Double.NaN;
        if (i[16] == null) {
            p = 0;
        } else if (((Double) i[16]).doubleValue() <= -45.590840304393524) {
            p = WekaClassifier.N52c75e83669(i);
        } else if (((Double) i[16]).doubleValue() > -45.590840304393524) {
            p = WekaClassifier.N3dfc58c4670(i);
        }
        return p;
    }
    static double N52c75e83669(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= -31.56694997227333) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() > -31.56694997227333) {
            p = 0;
        }
        return p;
    }
    static double N3dfc58c4670(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() <= -36.38744629872072) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() > -36.38744629872072) {
            p = WekaClassifier.N7d17aa35671(i);
        }
        return p;
    }
    static double N7d17aa35671(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 0;
        } else if (((Double) i[5]).doubleValue() <= -28.736438088274465) {
            p = WekaClassifier.N2d93fca5672(i);
        } else if (((Double) i[5]).doubleValue() > -28.736438088274465) {
            p = 1;
        }
        return p;
    }
    static double N2d93fca5672(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= -41.724282446047226) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() > -41.724282446047226) {
            p = 0;
        }
        return p;
    }
    static double N45c88cd2673(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 1;
        } else if (((Double) i[11]).doubleValue() <= -32.21232980020996) {
            p = 1;
        } else if (((Double) i[11]).doubleValue() > -32.21232980020996) {
            p = WekaClassifier.N1a2dc6d7674(i);
        }
        return p;
    }
    static double N1a2dc6d7674(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() <= -30.093886047357223) {
            p = WekaClassifier.N5a2b91a5675(i);
        } else if (((Double) i[3]).doubleValue() > -30.093886047357223) {
            p = 1;
        }
        return p;
    }
    static double N5a2b91a5675(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() <= -39.593390323720975) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() > -39.593390323720975) {
            p = 0;
        }
        return p;
    }
    static double N68ef2891676(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() <= -43.885483606711645) {
            p = WekaClassifier.N69409742677(i);
        } else if (((Double) i[10]).doubleValue() > -43.885483606711645) {
            p = 1;
        }
        return p;
    }
    static double N69409742677(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= -34.59530323295201) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() > -34.59530323295201) {
            p = WekaClassifier.N1dafffc3678(i);
        }
        return p;
    }
    static double N1dafffc3678(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() <= -28.153558256763247) {
            p = WekaClassifier.N1b8ff36a679(i);
        } else if (((Double) i[4]).doubleValue() > -28.153558256763247) {
            p = 1;
        }
        return p;
    }
    static double N1b8ff36a679(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= -37.06129480755621) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() > -37.06129480755621) {
            p = WekaClassifier.Na35fb2a680(i);
        }
        return p;
    }
    static double Na35fb2a680(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= -36.786872895717934) {
            p = WekaClassifier.N67a287a9681(i);
        } else if (((Double) i[9]).doubleValue() > -36.786872895717934) {
            p = 0;
        }
        return p;
    }
    static double N67a287a9681(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 1;
        } else if (((Double) i[6]).doubleValue() <= -30.955823647060317) {
            p = WekaClassifier.N5113d79682(i);
        } else if (((Double) i[6]).doubleValue() > -30.955823647060317) {
            p = 0;
        }
        return p;
    }
    static double N5113d79682(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() <= -36.6349565740243) {
            p = WekaClassifier.N61619a12683(i);
        } else if (((Double) i[6]).doubleValue() > -36.6349565740243) {
            p = 1;
        }
        return p;
    }
    static double N61619a12683(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() <= -36.74127429565051) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() > -36.74127429565051) {
            p = 1;
        }
        return p;
    }
    static double N4428c1bf684(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= -33.23066705403507) {
            p = WekaClassifier.N37c4995c685(i);
        } else if (((Double) i[4]).doubleValue() > -33.23066705403507) {
            p = WekaClassifier.N566e2c56687(i);
        }
        return p;
    }
    static double N37c4995c685(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= -16.731343166570518) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() > -16.731343166570518) {
            p = WekaClassifier.N3b329028686(i);
        }
        return p;
    }
    static double N3b329028686(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 0;
        } else if (((Double) i[5]).doubleValue() <= -25.63866557737054) {
            p = 0;
        } else if (((Double) i[5]).doubleValue() > -25.63866557737054) {
            p = 1;
        }
        return p;
    }
    static double N566e2c56687(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() <= -29.3293374107367) {
            p = WekaClassifier.N54492a1d688(i);
        } else if (((Double) i[10]).doubleValue() > -29.3293374107367) {
            p = 0;
        }
        return p;
    }
    static double N54492a1d688(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -0.9440623831845443) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > -0.9440623831845443) {
            p = 0;
        }
        return p;
    }
    static double N475447b1689(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() <= -38.329416863193) {
            p = WekaClassifier.N68483ca3690(i);
        } else if (((Double) i[7]).doubleValue() > -38.329416863193) {
            p = WekaClassifier.N52676343692(i);
        }
        return p;
    }
    static double N68483ca3690(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 0;
        } else if (((Double) i[11]).doubleValue() <= -41.04349269562175) {
            p = WekaClassifier.N4fe3a160691(i);
        } else if (((Double) i[11]).doubleValue() > -41.04349269562175) {
            p = 1;
        }
        return p;
    }
    static double N4fe3a160691(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= -17.166983477315902) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() > -17.166983477315902) {
            p = 1;
        }
        return p;
    }
    static double N52676343692(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() <= -41.175900477241896) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() > -41.175900477241896) {
            p = WekaClassifier.N376bcf71693(i);
        }
        return p;
    }
    static double N376bcf71693(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 0;
        } else if (((Double) i[12]).doubleValue() <= -47.868508790392006) {
            p = 0;
        } else if (((Double) i[12]).doubleValue() > -47.868508790392006) {
            p = WekaClassifier.N1eef401b694(i);
        }
        return p;
    }
    static double N1eef401b694(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= -40.09272489411596) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() > -40.09272489411596) {
            p = WekaClassifier.N4cd50a07695(i);
        }
        return p;
    }
    static double N4cd50a07695(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 1;
        } else if (((Double) i[14]).doubleValue() <= -38.320235495737116) {
            p = WekaClassifier.N25c115a5696(i);
        } else if (((Double) i[14]).doubleValue() > -38.320235495737116) {
            p = 0;
        }
        return p;
    }
    static double N25c115a5696(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= -16.539548062331747) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() > -16.539548062331747) {
            p = 1;
        }
        return p;
    }
    static double N4cb8562b697(Object []i) {
        double p = Double.NaN;
        if (i[18] == null) {
            p = 0;
        } else if (((Double) i[18]).doubleValue() <= -31.220730222079137) {
            p = WekaClassifier.N2833383f698(i);
        } else if (((Double) i[18]).doubleValue() > -31.220730222079137) {
            p = 1;
        }
        return p;
    }
    static double N2833383f698(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= -17.742914674782824) {
            p = WekaClassifier.N4cd29a0c699(i);
        } else if (((Double) i[1]).doubleValue() > -17.742914674782824) {
            p = 0;
        }
        return p;
    }
    static double N4cd29a0c699(Object []i) {
        double p = Double.NaN;
        if (i[15] == null) {
            p = 1;
        } else if (((Double) i[15]).doubleValue() <= -36.589233091255586) {
            p = 1;
        } else if (((Double) i[15]).doubleValue() > -36.589233091255586) {
            p = 0;
        }
        return p;
    }
    static double N6113d20e700(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() <= -23.64054777564562) {
            p = WekaClassifier.N6f14d909701(i);
        } else if (((Double) i[6]).doubleValue() > -23.64054777564562) {
            p = 1;
        }
        return p;
    }
    static double N6f14d909701(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= -0.30488780256012404) {
            p = WekaClassifier.N5ed7e614702(i);
        } else if (((Double) i[0]).doubleValue() > -0.30488780256012404) {
            p = WekaClassifier.N76ad8498897(i);
        }
        return p;
    }
    static double N5ed7e614702(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= -26.08320139710283) {
            p = WekaClassifier.N68d1538703(i);
        } else if (((Double) i[4]).doubleValue() > -26.08320139710283) {
            p = WekaClassifier.N75ab448872(i);
        }
        return p;
    }
    static double N68d1538703(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -8.784048054953942) {
            p = WekaClassifier.N79f13445704(i);
        } else if (((Double) i[0]).doubleValue() > -8.784048054953942) {
            p = WekaClassifier.N71ef5a65712(i);
        }
        return p;
    }
    static double N79f13445704(Object []i) {
        double p = Double.NaN;
        if (i[16] == null) {
            p = 1;
        } else if (((Double) i[16]).doubleValue() <= -36.79745371614469) {
            p = WekaClassifier.N30e466e3705(i);
        } else if (((Double) i[16]).doubleValue() > -36.79745371614469) {
            p = WekaClassifier.N5c4bc6bc709(i);
        }
        return p;
    }
    static double N30e466e3705(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -9.313992729732234) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > -9.313992729732234) {
            p = WekaClassifier.N51e2c1ad706(i);
        }
        return p;
    }
    static double N51e2c1ad706(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= -14.8408004421008) {
            p = WekaClassifier.N3fa82a7c707(i);
        } else if (((Double) i[1]).doubleValue() > -14.8408004421008) {
            p = 0;
        }
        return p;
    }
    static double N3fa82a7c707(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 0;
        } else if (((Double) i[11]).doubleValue() <= -38.680204203360326) {
            p = WekaClassifier.N4f8b72d0708(i);
        } else if (((Double) i[11]).doubleValue() > -38.680204203360326) {
            p = 1;
        }
        return p;
    }
    static double N4f8b72d0708(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 1;
        } else if (((Double) i[12]).doubleValue() <= -33.4803727946786) {
            p = 1;
        } else if (((Double) i[12]).doubleValue() > -33.4803727946786) {
            p = 0;
        }
        return p;
    }
    static double N5c4bc6bc709(Object []i) {
        double p = Double.NaN;
        if (i[15] == null) {
            p = 0;
        } else if (((Double) i[15]).doubleValue() <= -35.37003739292944) {
            p = WekaClassifier.N1b639b31710(i);
        } else if (((Double) i[15]).doubleValue() > -35.37003739292944) {
            p = 1;
        }
        return p;
    }
    static double N1b639b31710(Object []i) {
        double p = Double.NaN;
        if (i[13] == null) {
            p = 0;
        } else if (((Double) i[13]).doubleValue() <= -39.649103931538065) {
            p = 0;
        } else if (((Double) i[13]).doubleValue() > -39.649103931538065) {
            p = WekaClassifier.N6566a9eb711(i);
        }
        return p;
    }
    static double N6566a9eb711(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() <= -31.605565911065465) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() > -31.605565911065465) {
            p = 0;
        }
        return p;
    }
    static double N71ef5a65712(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() <= -35.924827519122104) {
            p = WekaClassifier.N73130cc2713(i);
        } else if (((Double) i[10]).doubleValue() > -35.924827519122104) {
            p = WekaClassifier.N33b2e49d829(i);
        }
        return p;
    }
    static double N73130cc2713(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() <= -25.76860574397583) {
            p = WekaClassifier.N74aebb82714(i);
        } else if (((Double) i[3]).doubleValue() > -25.76860574397583) {
            p = WekaClassifier.N2840a8c5756(i);
        }
        return p;
    }
    static double N74aebb82714(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= -25.319601009955864) {
            p = WekaClassifier.N24577d0d715(i);
        } else if (((Double) i[2]).doubleValue() > -25.319601009955864) {
            p = WekaClassifier.N7496a4be744(i);
        }
        return p;
    }
    static double N24577d0d715(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= -37.74187835465423) {
            p = WekaClassifier.N2f603790716(i);
        } else if (((Double) i[2]).doubleValue() > -37.74187835465423) {
            p = WekaClassifier.N5aad38ad719(i);
        }
        return p;
    }
    static double N2f603790716(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= -7.0272141265617805) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() > -7.0272141265617805) {
            p = WekaClassifier.N447e5ba2717(i);
        }
        return p;
    }
    static double N447e5ba2717(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= -16.38157222387082) {
            p = WekaClassifier.N458d8a04718(i);
        } else if (((Double) i[1]).doubleValue() > -16.38157222387082) {
            p = 1;
        }
        return p;
    }
    static double N458d8a04718(Object []i) {
        double p = Double.NaN;
        if (i[15] == null) {
            p = 0;
        } else if (((Double) i[15]).doubleValue() <= -37.039921620607686) {
            p = 0;
        } else if (((Double) i[15]).doubleValue() > -37.039921620607686) {
            p = 1;
        }
        return p;
    }
    static double N5aad38ad719(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= -1.7761634462652083) {
            p = WekaClassifier.N745f58df720(i);
        } else if (((Double) i[0]).doubleValue() > -1.7761634462652083) {
            p = WekaClassifier.N25783a84735(i);
        }
        return p;
    }
    static double N745f58df720(Object []i) {
        double p = Double.NaN;
        if (i[18] == null) {
            p = 1;
        } else if (((Double) i[18]).doubleValue() <= -37.436060818881884) {
            p = WekaClassifier.N424abebd721(i);
        } else if (((Double) i[18]).doubleValue() > -37.436060818881884) {
            p = WekaClassifier.N3bd25588730(i);
        }
        return p;
    }
    static double N424abebd721(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -2.716838477272205) {
            p = WekaClassifier.N6b3ed15a722(i);
        } else if (((Double) i[0]).doubleValue() > -2.716838477272205) {
            p = WekaClassifier.N5c7398e6726(i);
        }
        return p;
    }
    static double N6b3ed15a722(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 1;
        } else if (((Double) i[12]).doubleValue() <= -33.55599736049764) {
            p = WekaClassifier.N5865e4c0723(i);
        } else if (((Double) i[12]).doubleValue() > -33.55599736049764) {
            p = 0;
        }
        return p;
    }
    static double N5865e4c0723(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= -26.23368087024505) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() > -26.23368087024505) {
            p = WekaClassifier.N5672d6b3724(i);
        }
        return p;
    }
    static double N5672d6b3724(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= -26.86549197264454) {
            p = WekaClassifier.N415a2596725(i);
        } else if (((Double) i[2]).doubleValue() > -26.86549197264454) {
            p = 0;
        }
        return p;
    }
    static double N415a2596725(Object []i) {
        double p = Double.NaN;
        if (i[16] == null) {
            p = 1;
        } else if (((Double) i[16]).doubleValue() <= -38.530922416471924) {
            p = 1;
        } else if (((Double) i[16]).doubleValue() > -38.530922416471924) {
            p = 0;
        }
        return p;
    }
    static double N5c7398e6726(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() <= -33.08135572718052) {
            p = WekaClassifier.N2b47244c727(i);
        } else if (((Double) i[6]).doubleValue() > -33.08135572718052) {
            p = 1;
        }
        return p;
    }
    static double N2b47244c727(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 0;
        } else if (((Double) i[12]).doubleValue() <= -45.940364565438905) {
            p = 0;
        } else if (((Double) i[12]).doubleValue() > -45.940364565438905) {
            p = WekaClassifier.N6bc0b8d9728(i);
        }
        return p;
    }
    static double N6bc0b8d9728(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 0;
        } else if (((Double) i[11]).doubleValue() <= -37.87816074024523) {
            p = WekaClassifier.N7b2646a2729(i);
        } else if (((Double) i[11]).doubleValue() > -37.87816074024523) {
            p = 0;
        }
        return p;
    }
    static double N7b2646a2729(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 0;
        } else if (((Double) i[11]).doubleValue() <= -43.247761156359715) {
            p = 0;
        } else if (((Double) i[11]).doubleValue() > -43.247761156359715) {
            p = 1;
        }
        return p;
    }
    static double N3bd25588730(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() <= -34.7950743655327) {
            p = WekaClassifier.N292573fa731(i);
        } else if (((Double) i[8]).doubleValue() > -34.7950743655327) {
            p = WekaClassifier.Ne975d7a733(i);
        }
        return p;
    }
    static double N292573fa731(Object []i) {
        double p = Double.NaN;
        if (i[17] == null) {
            p = 0;
        } else if (((Double) i[17]).doubleValue() <= -37.53851954696481) {
            p = 0;
        } else if (((Double) i[17]).doubleValue() > -37.53851954696481) {
            p = WekaClassifier.N47cd1077732(i);
        }
        return p;
    }
    static double N47cd1077732(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 0;
        } else if (((Double) i[5]).doubleValue() <= -25.876344153902266) {
            p = 0;
        } else if (((Double) i[5]).doubleValue() > -25.876344153902266) {
            p = 1;
        }
        return p;
    }
    static double Ne975d7a733(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= -28.094686290862) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() > -28.094686290862) {
            p = WekaClassifier.N27403735734(i);
        }
        return p;
    }
    static double N27403735734(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= -31.93077409415946) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() > -31.93077409415946) {
            p = 0;
        }
        return p;
    }
    static double N25783a84735(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 0;
        } else if (((Double) i[7]).doubleValue() <= -40.65643740700658) {
            p = WekaClassifier.Na19d8f4736(i);
        } else if (((Double) i[7]).doubleValue() > -40.65643740700658) {
            p = WekaClassifier.N7cc6ecbf739(i);
        }
        return p;
    }
    static double Na19d8f4736(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= -28.042764141970185) {
            p = WekaClassifier.N3ed12840737(i);
        } else if (((Double) i[2]).doubleValue() > -28.042764141970185) {
            p = 1;
        }
        return p;
    }
    static double N3ed12840737(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() <= -38.03321971504577) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() > -38.03321971504577) {
            p = WekaClassifier.N188e5930738(i);
        }
        return p;
    }
    static double N188e5930738(Object []i) {
        double p = Double.NaN;
        if (i[15] == null) {
            p = 0;
        } else if (((Double) i[15]).doubleValue() <= -36.37599763235309) {
            p = 0;
        } else if (((Double) i[15]).doubleValue() > -36.37599763235309) {
            p = 1;
        }
        return p;
    }
    static double N7cc6ecbf739(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= -31.375224535305005) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() > -31.375224535305005) {
            p = WekaClassifier.N38dc55ab740(i);
        }
        return p;
    }
    static double N38dc55ab740(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= -29.247500139177824) {
            p = WekaClassifier.Nf78e9d8741(i);
        } else if (((Double) i[4]).doubleValue() > -29.247500139177824) {
            p = 1;
        }
        return p;
    }
    static double Nf78e9d8741(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= -15.544690736872298) {
            p = WekaClassifier.N655576de742(i);
        } else if (((Double) i[1]).doubleValue() > -15.544690736872298) {
            p = 1;
        }
        return p;
    }
    static double N655576de742(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() <= -33.08278508526992) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() > -33.08278508526992) {
            p = WekaClassifier.N2e3dcddf743(i);
        }
        return p;
    }
    static double N2e3dcddf743(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() <= -48.55275825397521) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() > -48.55275825397521) {
            p = 1;
        }
        return p;
    }
    static double N7496a4be744(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= -17.613844069231206) {
            p = WekaClassifier.N3c68b5dd745(i);
        } else if (((Double) i[1]).doubleValue() > -17.613844069231206) {
            p = WekaClassifier.N3256afaa747(i);
        }
        return p;
    }
    static double N3c68b5dd745(Object []i) {
        double p = Double.NaN;
        if (i[15] == null) {
            p = 1;
        } else if (((Double) i[15]).doubleValue() <= -44.20458410920386) {
            p = WekaClassifier.N7245c708746(i);
        } else if (((Double) i[15]).doubleValue() > -44.20458410920386) {
            p = 1;
        }
        return p;
    }
    static double N7245c708746(Object []i) {
        double p = Double.NaN;
        if (i[17] == null) {
            p = 0;
        } else if (((Double) i[17]).doubleValue() <= -70.21407373179926) {
            p = 0;
        } else if (((Double) i[17]).doubleValue() > -70.21407373179926) {
            p = 1;
        }
        return p;
    }
    static double N3256afaa747(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= -33.27285305051906) {
            p = WekaClassifier.N73244e0a748(i);
        } else if (((Double) i[4]).doubleValue() > -33.27285305051906) {
            p = WekaClassifier.N563a3022750(i);
        }
        return p;
    }
    static double N73244e0a748(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= -24.552975792390306) {
            p = WekaClassifier.Na1bcbee749(i);
        } else if (((Double) i[2]).doubleValue() > -24.552975792390306) {
            p = 0;
        }
        return p;
    }
    static double Na1bcbee749(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= -15.36088852844783) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() > -15.36088852844783) {
            p = 0;
        }
        return p;
    }
    static double N563a3022750(Object []i) {
        double p = Double.NaN;
        if (i[18] == null) {
            p = 1;
        } else if (((Double) i[18]).doubleValue() <= -31.583695518031856) {
            p = WekaClassifier.N5196eeb0751(i);
        } else if (((Double) i[18]).doubleValue() > -31.583695518031856) {
            p = 0;
        }
        return p;
    }
    static double N5196eeb0751(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= -23.333108570430362) {
            p = WekaClassifier.N13be96752(i);
        } else if (((Double) i[2]).doubleValue() > -23.333108570430362) {
            p = 1;
        }
        return p;
    }
    static double N13be96752(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 0;
        } else if (((Double) i[14]).doubleValue() <= -54.62817466841121) {
            p = 0;
        } else if (((Double) i[14]).doubleValue() > -54.62817466841121) {
            p = WekaClassifier.N548341c1753(i);
        }
        return p;
    }
    static double N548341c1753(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= -24.297968362824758) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() > -24.297968362824758) {
            p = WekaClassifier.N53bfc053754(i);
        }
        return p;
    }
    static double N53bfc053754(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() <= -38.053059232130224) {
            p = WekaClassifier.N353a47fa755(i);
        } else if (((Double) i[10]).doubleValue() > -38.053059232130224) {
            p = 1;
        }
        return p;
    }
    static double N353a47fa755(Object []i) {
        double p = Double.NaN;
        if (i[18] == null) {
            p = 1;
        } else if (((Double) i[18]).doubleValue() <= -50.02268954684484) {
            p = 1;
        } else if (((Double) i[18]).doubleValue() > -50.02268954684484) {
            p = 0;
        }
        return p;
    }
    static double N2840a8c5756(Object []i) {
        double p = Double.NaN;
        if (i[17] == null) {
            p = 0;
        } else if (((Double) i[17]).doubleValue() <= -34.80060988298117) {
            p = WekaClassifier.N66037945757(i);
        } else if (((Double) i[17]).doubleValue() > -34.80060988298117) {
            p = WekaClassifier.N4a12efdf820(i);
        }
        return p;
    }
    static double N66037945757(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= -36.63931236032789) {
            p = WekaClassifier.N4b13908e758(i);
        } else if (((Double) i[4]).doubleValue() > -36.63931236032789) {
            p = WekaClassifier.N3282184f777(i);
        }
        return p;
    }
    static double N4b13908e758(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() <= -33.37421986622879) {
            p = WekaClassifier.N2cf11b81759(i);
        } else if (((Double) i[8]).doubleValue() > -33.37421986622879) {
            p = WekaClassifier.N735abadc773(i);
        }
        return p;
    }
    static double N2cf11b81759(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 0;
        } else if (((Double) i[9]).doubleValue() <= -35.79819307012484) {
            p = WekaClassifier.N15a985a760(i);
        } else if (((Double) i[9]).doubleValue() > -35.79819307012484) {
            p = WekaClassifier.N35c041be768(i);
        }
        return p;
    }
    static double N15a985a760(Object []i) {
        double p = Double.NaN;
        if (i[15] == null) {
            p = 0;
        } else if (((Double) i[15]).doubleValue() <= -48.50696711624599) {
            p = 0;
        } else if (((Double) i[15]).doubleValue() > -48.50696711624599) {
            p = WekaClassifier.N7cee1065761(i);
        }
        return p;
    }
    static double N7cee1065761(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 1;
        } else if (((Double) i[14]).doubleValue() <= -40.713067812117586) {
            p = WekaClassifier.N2b2e7896762(i);
        } else if (((Double) i[14]).doubleValue() > -40.713067812117586) {
            p = WekaClassifier.Neb9e418766(i);
        }
        return p;
    }
    static double N2b2e7896762(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -3.141788832303426) {
            p = WekaClassifier.Nfa75361763(i);
        } else if (((Double) i[0]).doubleValue() > -3.141788832303426) {
            p = WekaClassifier.N5a6a8287764(i);
        }
        return p;
    }
    static double Nfa75361763(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() <= -26.889370197597223) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() > -26.889370197597223) {
            p = 0;
        }
        return p;
    }
    static double N5a6a8287764(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() <= -41.8441594965111) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() > -41.8441594965111) {
            p = WekaClassifier.N568bdc97765(i);
        }
        return p;
    }
    static double N568bdc97765(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 1;
        } else if (((Double) i[8]).doubleValue() <= -44.58527385683351) {
            p = 1;
        } else if (((Double) i[8]).doubleValue() > -44.58527385683351) {
            p = 0;
        }
        return p;
    }
    static double Neb9e418766(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 0;
        } else if (((Double) i[5]).doubleValue() <= -29.99217984020946) {
            p = WekaClassifier.N3bb082f5767(i);
        } else if (((Double) i[5]).doubleValue() > -29.99217984020946) {
            p = 0;
        }
        return p;
    }
    static double N3bb082f5767(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= -57.60230054670897) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() > -57.60230054670897) {
            p = 0;
        }
        return p;
    }
    static double N35c041be768(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() <= -23.71385225120025) {
            p = WekaClassifier.N3d274cf5769(i);
        } else if (((Double) i[3]).doubleValue() > -23.71385225120025) {
            p = WekaClassifier.N749d005e772(i);
        }
        return p;
    }
    static double N3d274cf5769(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= -17.16661305460719) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() > -17.16661305460719) {
            p = WekaClassifier.N7c7fe66d770(i);
        }
        return p;
    }
    static double N7c7fe66d770(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() <= -24.998875783639853) {
            p = WekaClassifier.N4367643d771(i);
        } else if (((Double) i[3]).doubleValue() > -24.998875783639853) {
            p = 0;
        }
        return p;
    }
    static double N4367643d771(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -2.1005890003539776) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > -2.1005890003539776) {
            p = 0;
        }
        return p;
    }
    static double N749d005e772(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() <= -26.7021564558886) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() > -26.7021564558886) {
            p = 0;
        }
        return p;
    }
    static double N735abadc773(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() <= -23.917922744506143) {
            p = WekaClassifier.N70957654774(i);
        } else if (((Double) i[3]).doubleValue() > -23.917922744506143) {
            p = 0;
        }
        return p;
    }
    static double N70957654774(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -3.002291393150969) {
            p = WekaClassifier.N82ba2f7775(i);
        } else if (((Double) i[0]).doubleValue() > -3.002291393150969) {
            p = WekaClassifier.N14a8cc5c776(i);
        }
        return p;
    }
    static double N82ba2f7775(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() <= -32.65484262464468) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() > -32.65484262464468) {
            p = 1;
        }
        return p;
    }
    static double N14a8cc5c776(Object []i) {
        double p = Double.NaN;
        if (i[16] == null) {
            p = 0;
        } else if (((Double) i[16]).doubleValue() <= -38.288293322641735) {
            p = 0;
        } else if (((Double) i[16]).doubleValue() > -38.288293322641735) {
            p = 1;
        }
        return p;
    }
    static double N3282184f777(Object []i) {
        double p = Double.NaN;
        if (i[19] == null) {
            p = 0;
        } else if (((Double) i[19]).doubleValue() <= -34.07262533873006) {
            p = WekaClassifier.N69feff9d778(i);
        } else if (((Double) i[19]).doubleValue() > -34.07262533873006) {
            p = WekaClassifier.N29b17c57817(i);
        }
        return p;
    }
    static double N69feff9d778(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= -17.338876054945224) {
            p = WekaClassifier.N3c97c44f779(i);
        } else if (((Double) i[1]).doubleValue() > -17.338876054945224) {
            p = WekaClassifier.N20276dde789(i);
        }
        return p;
    }
    static double N3c97c44f779(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= -22.7268519915226) {
            p = WekaClassifier.N6e0f35ad780(i);
        } else if (((Double) i[2]).doubleValue() > -22.7268519915226) {
            p = WekaClassifier.N1d31dfd788(i);
        }
        return p;
    }
    static double N6e0f35ad780(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 0;
        } else if (((Double) i[5]).doubleValue() <= -26.535211810384922) {
            p = WekaClassifier.N4ced0843781(i);
        } else if (((Double) i[5]).doubleValue() > -26.535211810384922) {
            p = 0;
        }
        return p;
    }
    static double N4ced0843781(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= -28.10896068828435) {
            p = WekaClassifier.N52f11454782(i);
        } else if (((Double) i[4]).doubleValue() > -28.10896068828435) {
            p = WekaClassifier.N59e89f2b787(i);
        }
        return p;
    }
    static double N52f11454782(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= -18.91478763177068) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() > -18.91478763177068) {
            p = WekaClassifier.N504617f9783(i);
        }
        return p;
    }
    static double N504617f9783(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 0;
        } else if (((Double) i[14]).doubleValue() <= -50.5223742732158) {
            p = WekaClassifier.N4773e201784(i);
        } else if (((Double) i[14]).doubleValue() > -50.5223742732158) {
            p = 0;
        }
        return p;
    }
    static double N4773e201784(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -1.715110063350842) {
            p = WekaClassifier.N63f845bc785(i);
        } else if (((Double) i[0]).doubleValue() > -1.715110063350842) {
            p = 0;
        }
        return p;
    }
    static double N63f845bc785(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 0;
        } else if (((Double) i[12]).doubleValue() <= -43.5152897104076) {
            p = WekaClassifier.N3971be23786(i);
        } else if (((Double) i[12]).doubleValue() > -43.5152897104076) {
            p = 1;
        }
        return p;
    }
    static double N3971be23786(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= -17.35856026049383) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() > -17.35856026049383) {
            p = 1;
        }
        return p;
    }
    static double N59e89f2b787(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() <= -40.50651009906147) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() > -40.50651009906147) {
            p = 1;
        }
        return p;
    }
    static double N1d31dfd788(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 0;
        } else if (((Double) i[7]).doubleValue() <= -38.844794304431375) {
            p = 0;
        } else if (((Double) i[7]).doubleValue() > -38.844794304431375) {
            p = 1;
        }
        return p;
    }
    static double N20276dde789(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= -12.631408413934551) {
            p = WekaClassifier.N14134f5f790(i);
        } else if (((Double) i[1]).doubleValue() > -12.631408413934551) {
            p = WekaClassifier.N54891141816(i);
        }
        return p;
    }
    static double N14134f5f790(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() <= -27.454583180769216) {
            p = WekaClassifier.N91f8b31791(i);
        } else if (((Double) i[6]).doubleValue() > -27.454583180769216) {
            p = WekaClassifier.N2ccd0abc812(i);
        }
        return p;
    }
    static double N91f8b31791(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 0;
        } else if (((Double) i[14]).doubleValue() <= -43.01076707905153) {
            p = WekaClassifier.N10ba531a792(i);
        } else if (((Double) i[14]).doubleValue() > -43.01076707905153) {
            p = WekaClassifier.Nce4d794802(i);
        }
        return p;
    }
    static double N10ba531a792(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= -22.79826259284789) {
            p = WekaClassifier.Nbe8854e793(i);
        } else if (((Double) i[2]).doubleValue() > -22.79826259284789) {
            p = WekaClassifier.N7dd19126797(i);
        }
        return p;
    }
    static double Nbe8854e793(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= -14.128221653646477) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() > -14.128221653646477) {
            p = WekaClassifier.N58f5adb794(i);
        }
        return p;
    }
    static double N58f5adb794(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= -0.5881298088535374) {
            p = WekaClassifier.N70bc1f58795(i);
        } else if (((Double) i[0]).doubleValue() > -0.5881298088535374) {
            p = 1;
        }
        return p;
    }
    static double N70bc1f58795(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 0;
        } else if (((Double) i[5]).doubleValue() <= -29.30775207972502) {
            p = WekaClassifier.N325cb0d6796(i);
        } else if (((Double) i[5]).doubleValue() > -29.30775207972502) {
            p = 0;
        }
        return p;
    }
    static double N325cb0d6796(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() <= -31.641309519254463) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() > -31.641309519254463) {
            p = 0;
        }
        return p;
    }
    static double N7dd19126797(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= -15.732579824846248) {
            p = WekaClassifier.N2f755c5798(i);
        } else if (((Double) i[1]).doubleValue() > -15.732579824846248) {
            p = WekaClassifier.N1221dc1c799(i);
        }
        return p;
    }
    static double N2f755c5798(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 0;
        } else if (((Double) i[11]).doubleValue() <= -48.62108235432977) {
            p = 0;
        } else if (((Double) i[11]).doubleValue() > -48.62108235432977) {
            p = 1;
        }
        return p;
    }
    static double N1221dc1c799(Object []i) {
        double p = Double.NaN;
        if (i[17] == null) {
            p = 0;
        } else if (((Double) i[17]).doubleValue() <= -37.44599110401151) {
            p = WekaClassifier.N45ac048e800(i);
        } else if (((Double) i[17]).doubleValue() > -37.44599110401151) {
            p = 1;
        }
        return p;
    }
    static double N45ac048e800(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= -2.1596263200466836) {
            p = WekaClassifier.N3485f5bc801(i);
        } else if (((Double) i[0]).doubleValue() > -2.1596263200466836) {
            p = 0;
        }
        return p;
    }
    static double N3485f5bc801(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() <= -33.699936482518254) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() > -33.699936482518254) {
            p = 0;
        }
        return p;
    }
    static double Nce4d794802(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= -25.75272171103994) {
            p = WekaClassifier.N10392b28803(i);
        } else if (((Double) i[2]).doubleValue() > -25.75272171103994) {
            p = 0;
        }
        return p;
    }
    static double N10392b28803(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= -3.8021160771926077) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() > -3.8021160771926077) {
            p = WekaClassifier.N3594d5d5804(i);
        }
        return p;
    }
    static double N3594d5d5804(Object []i) {
        double p = Double.NaN;
        if (i[19] == null) {
            p = 0;
        } else if (((Double) i[19]).doubleValue() <= -52.56507852912758) {
            p = WekaClassifier.N2ea7eece805(i);
        } else if (((Double) i[19]).doubleValue() > -52.56507852912758) {
            p = WekaClassifier.N5f05d5ad809(i);
        }
        return p;
    }
    static double N2ea7eece805(Object []i) {
        double p = Double.NaN;
        if (i[19] == null) {
            p = 0;
        } else if (((Double) i[19]).doubleValue() <= -54.10469592852994) {
            p = WekaClassifier.N4d5c4f9806(i);
        } else if (((Double) i[19]).doubleValue() > -54.10469592852994) {
            p = 1;
        }
        return p;
    }
    static double N4d5c4f9806(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 0;
        } else if (((Double) i[7]).doubleValue() <= -33.056643813240484) {
            p = WekaClassifier.N5d6ccf20807(i);
        } else if (((Double) i[7]).doubleValue() > -33.056643813240484) {
            p = 0;
        }
        return p;
    }
    static double N5d6ccf20807(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 1;
        } else if (((Double) i[8]).doubleValue() <= -35.861679100007066) {
            p = WekaClassifier.N4ec59325808(i);
        } else if (((Double) i[8]).doubleValue() > -35.861679100007066) {
            p = 0;
        }
        return p;
    }
    static double N4ec59325808(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= -41.17833808239687) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() > -41.17833808239687) {
            p = 0;
        }
        return p;
    }
    static double N5f05d5ad809(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= -29.408098113088677) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() > -29.408098113088677) {
            p = WekaClassifier.N755d20b8810(i);
        }
        return p;
    }
    static double N755d20b8810(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 1;
        } else if (((Double) i[11]).doubleValue() <= -39.715596339677404) {
            p = WekaClassifier.N4ef3e4fc811(i);
        } else if (((Double) i[11]).doubleValue() > -39.715596339677404) {
            p = 0;
        }
        return p;
    }
    static double N4ef3e4fc811(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -1.3242634913737135) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > -1.3242634913737135) {
            p = 0;
        }
        return p;
    }
    static double N2ccd0abc812(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= -2.706738864588658) {
            p = WekaClassifier.N5d141a35813(i);
        } else if (((Double) i[0]).doubleValue() > -2.706738864588658) {
            p = WekaClassifier.N1055711d815(i);
        }
        return p;
    }
    static double N5d141a35813(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 0;
        } else if (((Double) i[14]).doubleValue() <= -39.863206504189606) {
            p = WekaClassifier.N4150a9cf814(i);
        } else if (((Double) i[14]).doubleValue() > -39.863206504189606) {
            p = 0;
        }
        return p;
    }
    static double N4150a9cf814(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -4.646112174429369) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > -4.646112174429369) {
            p = 0;
        }
        return p;
    }
    static double N1055711d815(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 0;
        } else if (((Double) i[5]).doubleValue() <= -28.837006440714596) {
            p = 0;
        } else if (((Double) i[5]).doubleValue() > -28.837006440714596) {
            p = 1;
        }
        return p;
    }
    static double N54891141816(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 1;
        } else if (((Double) i[8]).doubleValue() <= -39.59028143102691) {
            p = 1;
        } else if (((Double) i[8]).doubleValue() > -39.59028143102691) {
            p = 0;
        }
        return p;
    }
    static double N29b17c57817(Object []i) {
        double p = Double.NaN;
        if (i[13] == null) {
            p = 0;
        } else if (((Double) i[13]).doubleValue() <= -32.68748127143179) {
            p = WekaClassifier.N6d6bb67f818(i);
        } else if (((Double) i[13]).doubleValue() > -32.68748127143179) {
            p = 1;
        }
        return p;
    }
    static double N6d6bb67f818(Object []i) {
        double p = Double.NaN;
        if (i[16] == null) {
            p = 1;
        } else if (((Double) i[16]).doubleValue() <= -53.79008607234363) {
            p = 1;
        } else if (((Double) i[16]).doubleValue() > -53.79008607234363) {
            p = WekaClassifier.N568def56819(i);
        }
        return p;
    }
    static double N568def56819(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= -23.183258166454948) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() > -23.183258166454948) {
            p = 1;
        }
        return p;
    }
    static double N4a12efdf820(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= -17.17249444044056) {
            p = WekaClassifier.N68e3710e821(i);
        } else if (((Double) i[1]).doubleValue() > -17.17249444044056) {
            p = WekaClassifier.N588bfa23822(i);
        }
        return p;
    }
    static double N68e3710e821(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 1;
        } else if (((Double) i[6]).doubleValue() <= -32.13662331399401) {
            p = 1;
        } else if (((Double) i[6]).doubleValue() > -32.13662331399401) {
            p = 0;
        }
        return p;
    }
    static double N588bfa23822(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 1;
        } else if (((Double) i[11]).doubleValue() <= -45.4272126805126) {
            p = WekaClassifier.N61c5593b823(i);
        } else if (((Double) i[11]).doubleValue() > -45.4272126805126) {
            p = WekaClassifier.N3c743ecb824(i);
        }
        return p;
    }
    static double N61c5593b823(Object []i) {
        double p = Double.NaN;
        if (i[17] == null) {
            p = 0;
        } else if (((Double) i[17]).doubleValue() <= -33.73741736759251) {
            p = 0;
        } else if (((Double) i[17]).doubleValue() > -33.73741736759251) {
            p = 1;
        }
        return p;
    }
    static double N3c743ecb824(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 0;
        } else if (((Double) i[7]).doubleValue() <= -26.863622501960464) {
            p = WekaClassifier.N4fec534a825(i);
        } else if (((Double) i[7]).doubleValue() > -26.863622501960464) {
            p = 1;
        }
        return p;
    }
    static double N4fec534a825(Object []i) {
        double p = Double.NaN;
        if (i[19] == null) {
            p = 0;
        } else if (((Double) i[19]).doubleValue() <= -35.58767259806304) {
            p = WekaClassifier.N48b1f276826(i);
        } else if (((Double) i[19]).doubleValue() > -35.58767259806304) {
            p = WekaClassifier.N1e698219828(i);
        }
        return p;
    }
    static double N48b1f276826(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= -13.17980257476674) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() > -13.17980257476674) {
            p = WekaClassifier.N37666da827(i);
        }
        return p;
    }
    static double N37666da827(Object []i) {
        double p = Double.NaN;
        if (i[13] == null) {
            p = 1;
        } else if (((Double) i[13]).doubleValue() <= -38.33482707440179) {
            p = 1;
        } else if (((Double) i[13]).doubleValue() > -38.33482707440179) {
            p = 0;
        }
        return p;
    }
    static double N1e698219828(Object []i) {
        double p = Double.NaN;
        if (i[16] == null) {
            p = 1;
        } else if (((Double) i[16]).doubleValue() <= -47.270725490102784) {
            p = 1;
        } else if (((Double) i[16]).doubleValue() > -47.270725490102784) {
            p = 0;
        }
        return p;
    }
    static double N33b2e49d829(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= -25.006349659538166) {
            p = WekaClassifier.N74d782df830(i);
        } else if (((Double) i[3]).doubleValue() > -25.006349659538166) {
            p = WekaClassifier.N446229a3845(i);
        }
        return p;
    }
    static double N74d782df830(Object []i) {
        double p = Double.NaN;
        if (i[15] == null) {
            p = 1;
        } else if (((Double) i[15]).doubleValue() <= -32.163397236856646) {
            p = WekaClassifier.N44277a29831(i);
        } else if (((Double) i[15]).doubleValue() > -32.163397236856646) {
            p = 0;
        }
        return p;
    }
    static double N44277a29831(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 1;
        } else if (((Double) i[12]).doubleValue() <= -32.38302951911676) {
            p = WekaClassifier.N168c51fe832(i);
        } else if (((Double) i[12]).doubleValue() > -32.38302951911676) {
            p = WekaClassifier.N580d8e8a842(i);
        }
        return p;
    }
    static double N168c51fe832(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= -32.0007837263709) {
            p = WekaClassifier.N32bec9be833(i);
        } else if (((Double) i[2]).doubleValue() > -32.0007837263709) {
            p = WekaClassifier.N5beaf01835(i);
        }
        return p;
    }
    static double N32bec9be833(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() <= -65.3711720643242) {
            p = WekaClassifier.N7ab7644c834(i);
        } else if (((Double) i[8]).doubleValue() > -65.3711720643242) {
            p = 1;
        }
        return p;
    }
    static double N7ab7644c834(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= -2.1681679432513903) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() > -2.1681679432513903) {
            p = 1;
        }
        return p;
    }
    static double N5beaf01835(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() <= -40.64200127497634) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() > -40.64200127497634) {
            p = WekaClassifier.N71c91de9836(i);
        }
        return p;
    }
    static double N71c91de9836(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= -30.397565380286338) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() > -30.397565380286338) {
            p = WekaClassifier.N357ec957837(i);
        }
        return p;
    }
    static double N357ec957837(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() <= -34.619394607095344) {
            p = WekaClassifier.N742a4eb0838(i);
        } else if (((Double) i[6]).doubleValue() > -34.619394607095344) {
            p = WekaClassifier.N7e74003a841(i);
        }
        return p;
    }
    static double N742a4eb0838(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 1;
        } else if (((Double) i[6]).doubleValue() <= -39.08868256214541) {
            p = WekaClassifier.N49c2193839(i);
        } else if (((Double) i[6]).doubleValue() > -39.08868256214541) {
            p = 0;
        }
        return p;
    }
    static double N49c2193839(Object []i) {
        double p = Double.NaN;
        if (i[18] == null) {
            p = 1;
        } else if (((Double) i[18]).doubleValue() <= -42.13264708259954) {
            p = 1;
        } else if (((Double) i[18]).doubleValue() > -42.13264708259954) {
            p = WekaClassifier.N3d0352bc840(i);
        }
        return p;
    }
    static double N3d0352bc840(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= -39.83674764783373) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() > -39.83674764783373) {
            p = 0;
        }
        return p;
    }
    static double N7e74003a841(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= -29.13321290483701) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() > -29.13321290483701) {
            p = 1;
        }
        return p;
    }
    static double N580d8e8a842(Object []i) {
        double p = Double.NaN;
        if (i[16] == null) {
            p = 1;
        } else if (((Double) i[16]).doubleValue() <= -35.10743320402422) {
            p = WekaClassifier.N3d78bca1843(i);
        } else if (((Double) i[16]).doubleValue() > -35.10743320402422) {
            p = 0;
        }
        return p;
    }
    static double N3d78bca1843(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= -3.805725193318281) {
            p = WekaClassifier.N1a499f00844(i);
        } else if (((Double) i[0]).doubleValue() > -3.805725193318281) {
            p = 1;
        }
        return p;
    }
    static double N1a499f00844(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() <= -31.27403852972942) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() > -31.27403852972942) {
            p = 1;
        }
        return p;
    }
    static double N446229a3845(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() <= -31.147948293489105) {
            p = WekaClassifier.N70af967b846(i);
        } else if (((Double) i[10]).doubleValue() > -31.147948293489105) {
            p = WekaClassifier.Nc27fc23866(i);
        }
        return p;
    }
    static double N70af967b846(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 0;
        } else if (((Double) i[7]).doubleValue() <= -37.67706730592836) {
            p = WekaClassifier.N8cab17b847(i);
        } else if (((Double) i[7]).doubleValue() > -37.67706730592836) {
            p = WekaClassifier.N66b7e0cc854(i);
        }
        return p;
    }
    static double N8cab17b847(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 1;
        } else if (((Double) i[14]).doubleValue() <= -53.44348830799319) {
            p = 1;
        } else if (((Double) i[14]).doubleValue() > -53.44348830799319) {
            p = WekaClassifier.N5ead8efd848(i);
        }
        return p;
    }
    static double N5ead8efd848(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 0;
        } else if (((Double) i[12]).doubleValue() <= -29.77505900205297) {
            p = WekaClassifier.Nb579bba849(i);
        } else if (((Double) i[12]).doubleValue() > -29.77505900205297) {
            p = 1;
        }
        return p;
    }
    static double Nb579bba849(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -7.531763485848188) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > -7.531763485848188) {
            p = WekaClassifier.N747d8e5850(i);
        }
        return p;
    }
    static double N747d8e5850(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() <= -27.390717957982424) {
            p = WekaClassifier.N5adbe01f851(i);
        } else if (((Double) i[6]).doubleValue() > -27.390717957982424) {
            p = 1;
        }
        return p;
    }
    static double N5adbe01f851(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() <= -22.990526878363042) {
            p = WekaClassifier.N683357df852(i);
        } else if (((Double) i[3]).doubleValue() > -22.990526878363042) {
            p = 0;
        }
        return p;
    }
    static double N683357df852(Object []i) {
        double p = Double.NaN;
        if (i[13] == null) {
            p = 0;
        } else if (((Double) i[13]).doubleValue() <= -48.93088263140209) {
            p = 0;
        } else if (((Double) i[13]).doubleValue() > -48.93088263140209) {
            p = WekaClassifier.N5f8e9b28853(i);
        }
        return p;
    }
    static double N5f8e9b28853(Object []i) {
        double p = Double.NaN;
        if (i[17] == null) {
            p = 0;
        } else if (((Double) i[17]).doubleValue() <= -50.54819305779667) {
            p = 0;
        } else if (((Double) i[17]).doubleValue() > -50.54819305779667) {
            p = 1;
        }
        return p;
    }
    static double N66b7e0cc854(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 0;
        } else if (((Double) i[5]).doubleValue() <= -29.311646932409573) {
            p = WekaClassifier.N63e93f1d855(i);
        } else if (((Double) i[5]).doubleValue() > -29.311646932409573) {
            p = WekaClassifier.N6806e5cc860(i);
        }
        return p;
    }
    static double N63e93f1d855(Object []i) {
        double p = Double.NaN;
        if (i[19] == null) {
            p = 0;
        } else if (((Double) i[19]).doubleValue() <= -54.09081036410937) {
            p = 0;
        } else if (((Double) i[19]).doubleValue() > -54.09081036410937) {
            p = WekaClassifier.N11961110856(i);
        }
        return p;
    }
    static double N11961110856(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= -22.260250963804353) {
            p = WekaClassifier.N3aea8fd1857(i);
        } else if (((Double) i[2]).doubleValue() > -22.260250963804353) {
            p = 0;
        }
        return p;
    }
    static double N3aea8fd1857(Object []i) {
        double p = Double.NaN;
        if (i[16] == null) {
            p = 1;
        } else if (((Double) i[16]).doubleValue() <= -33.64563909272074) {
            p = WekaClassifier.N6302a9c0858(i);
        } else if (((Double) i[16]).doubleValue() > -33.64563909272074) {
            p = 0;
        }
        return p;
    }
    static double N6302a9c0858(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() <= -35.236638080659304) {
            p = WekaClassifier.N4939736a859(i);
        } else if (((Double) i[10]).doubleValue() > -35.236638080659304) {
            p = 1;
        }
        return p;
    }
    static double N4939736a859(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= -22.535832763609495) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() > -22.535832763609495) {
            p = 0;
        }
        return p;
    }
    static double N6806e5cc860(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() <= -35.882300253333085) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() > -35.882300253333085) {
            p = WekaClassifier.N67c6b1a861(i);
        }
        return p;
    }
    static double N67c6b1a861(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= -14.24306981785243) {
            p = WekaClassifier.N70c68ebc862(i);
        } else if (((Double) i[1]).doubleValue() > -14.24306981785243) {
            p = WekaClassifier.N2d91a2e8864(i);
        }
        return p;
    }
    static double N70c68ebc862(Object []i) {
        double p = Double.NaN;
        if (i[15] == null) {
            p = 0;
        } else if (((Double) i[15]).doubleValue() <= -34.64333520717029) {
            p = 0;
        } else if (((Double) i[15]).doubleValue() > -34.64333520717029) {
            p = WekaClassifier.N726611ed863(i);
        }
        return p;
    }
    static double N726611ed863(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= -28.79770600055076) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() > -28.79770600055076) {
            p = 1;
        }
        return p;
    }
    static double N2d91a2e8864(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -1.6334430977151797) {
            p = WekaClassifier.N485038fb865(i);
        } else if (((Double) i[0]).doubleValue() > -1.6334430977151797) {
            p = 0;
        }
        return p;
    }
    static double N485038fb865(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= -5.840458878055259) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() > -5.840458878055259) {
            p = 1;
        }
        return p;
    }
    static double Nc27fc23866(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= -26.523248900784566) {
            p = WekaClassifier.N4e0c6d33867(i);
        } else if (((Double) i[5]).doubleValue() > -26.523248900784566) {
            p = WekaClassifier.N6e2a10f8868(i);
        }
        return p;
    }
    static double N4e0c6d33867(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() <= -41.58579163504803) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() > -41.58579163504803) {
            p = 1;
        }
        return p;
    }
    static double N6e2a10f8868(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= -22.789018402231452) {
            p = WekaClassifier.N27f46a26869(i);
        } else if (((Double) i[2]).doubleValue() > -22.789018402231452) {
            p = 0;
        }
        return p;
    }
    static double N27f46a26869(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() <= -28.53068330524177) {
            p = WekaClassifier.N14014c1f870(i);
        } else if (((Double) i[4]).doubleValue() > -28.53068330524177) {
            p = 0;
        }
        return p;
    }
    static double N14014c1f870(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= -19.38237233039196) {
            p = WekaClassifier.N39c9de59871(i);
        } else if (((Double) i[3]).doubleValue() > -19.38237233039196) {
            p = 0;
        }
        return p;
    }
    static double N39c9de59871(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() <= -25.082735273664568) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() > -25.082735273664568) {
            p = 0;
        }
        return p;
    }
    static double N75ab448872(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= -2.954693965681841) {
            p = WekaClassifier.N37b5bdf873(i);
        } else if (((Double) i[0]).doubleValue() > -2.954693965681841) {
            p = WekaClassifier.N1ea5b8c3887(i);
        }
        return p;
    }
    static double N37b5bdf873(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 0;
        } else if (((Double) i[5]).doubleValue() <= -23.620544081667916) {
            p = WekaClassifier.N1d048e1b874(i);
        } else if (((Double) i[5]).doubleValue() > -23.620544081667916) {
            p = 1;
        }
        return p;
    }
    static double N1d048e1b874(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= -25.0488299657778) {
            p = WekaClassifier.N6ac8a0f4875(i);
        } else if (((Double) i[2]).doubleValue() > -25.0488299657778) {
            p = WekaClassifier.N671352ee883(i);
        }
        return p;
    }
    static double N6ac8a0f4875(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 1;
        } else if (((Double) i[11]).doubleValue() <= -40.628721645047705) {
            p = WekaClassifier.N3862b111876(i);
        } else if (((Double) i[11]).doubleValue() > -40.628721645047705) {
            p = WekaClassifier.N58538e0f878(i);
        }
        return p;
    }
    static double N3862b111876(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() <= -40.823865016853) {
            p = WekaClassifier.N611ea061877(i);
        } else if (((Double) i[8]).doubleValue() > -40.823865016853) {
            p = 1;
        }
        return p;
    }
    static double N611ea061877(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() <= -29.255379795524675) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() > -29.255379795524675) {
            p = 1;
        }
        return p;
    }
    static double N58538e0f878(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 0;
        } else if (((Double) i[7]).doubleValue() <= -28.361978519047256) {
            p = 0;
        } else if (((Double) i[7]).doubleValue() > -28.361978519047256) {
            p = WekaClassifier.N77334af1879(i);
        }
        return p;
    }
    static double N77334af1879(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 1;
        } else if (((Double) i[11]).doubleValue() <= -33.74679778560335) {
            p = 1;
        } else if (((Double) i[11]).doubleValue() > -33.74679778560335) {
            p = WekaClassifier.N5a74873f880(i);
        }
        return p;
    }
    static double N5a74873f880(Object []i) {
        double p = Double.NaN;
        if (i[15] == null) {
            p = 0;
        } else if (((Double) i[15]).doubleValue() <= -32.00956758577676) {
            p = WekaClassifier.N4efd39b8881(i);
        } else if (((Double) i[15]).doubleValue() > -32.00956758577676) {
            p = 0;
        }
        return p;
    }
    static double N4efd39b8881(Object []i) {
        double p = Double.NaN;
        if (i[17] == null) {
            p = 0;
        } else if (((Double) i[17]).doubleValue() <= -41.97646557318417) {
            p = 0;
        } else if (((Double) i[17]).doubleValue() > -41.97646557318417) {
            p = WekaClassifier.Na1af59e882(i);
        }
        return p;
    }
    static double Na1af59e882(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 1;
        } else if (((Double) i[14]).doubleValue() <= -29.74121101606718) {
            p = 1;
        } else if (((Double) i[14]).doubleValue() > -29.74121101606718) {
            p = 0;
        }
        return p;
    }
    static double N671352ee883(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= -14.179535344136923) {
            p = WekaClassifier.N19a06c4c884(i);
        } else if (((Double) i[1]).doubleValue() > -14.179535344136923) {
            p = WekaClassifier.N63dc1274886(i);
        }
        return p;
    }
    static double N19a06c4c884(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= -23.77295162745561) {
            p = WekaClassifier.N3eb7b639885(i);
        } else if (((Double) i[2]).doubleValue() > -23.77295162745561) {
            p = 1;
        }
        return p;
    }
    static double N3eb7b639885(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 0;
        } else if (((Double) i[5]).doubleValue() <= -27.976556255795465) {
            p = 0;
        } else if (((Double) i[5]).doubleValue() > -27.976556255795465) {
            p = 1;
        }
        return p;
    }
    static double N63dc1274886(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() <= -28.291366982269064) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() > -28.291366982269064) {
            p = 1;
        }
        return p;
    }
    static double N1ea5b8c3887(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() <= -24.414252344582177) {
            p = WekaClassifier.N4fd6557888(i);
        } else if (((Double) i[4]).doubleValue() > -24.414252344582177) {
            p = WekaClassifier.N3c1d37d3894(i);
        }
        return p;
    }
    static double N4fd6557888(Object []i) {
        double p = Double.NaN;
        if (i[18] == null) {
            p = 1;
        } else if (((Double) i[18]).doubleValue() <= -42.63940533869427) {
            p = 1;
        } else if (((Double) i[18]).doubleValue() > -42.63940533869427) {
            p = WekaClassifier.N7f81d8f889(i);
        }
        return p;
    }
    static double N7f81d8f889(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 0;
        } else if (((Double) i[12]).doubleValue() <= -49.98261877395509) {
            p = 0;
        } else if (((Double) i[12]).doubleValue() > -49.98261877395509) {
            p = WekaClassifier.N434e0b6890(i);
        }
        return p;
    }
    static double N434e0b6890(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= -23.134978278364237) {
            p = WekaClassifier.N37e43353891(i);
        } else if (((Double) i[3]).doubleValue() > -23.134978278364237) {
            p = WekaClassifier.N58dc3f25892(i);
        }
        return p;
    }
    static double N37e43353891(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -0.5592941435922612) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > -0.5592941435922612) {
            p = 0;
        }
        return p;
    }
    static double N58dc3f25892(Object []i) {
        double p = Double.NaN;
        if (i[13] == null) {
            p = 0;
        } else if (((Double) i[13]).doubleValue() <= -39.78288991290268) {
            p = 0;
        } else if (((Double) i[13]).doubleValue() > -39.78288991290268) {
            p = WekaClassifier.N1f0f55d4893(i);
        }
        return p;
    }
    static double N1f0f55d4893(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= -25.15487166108315) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() > -25.15487166108315) {
            p = 0;
        }
        return p;
    }
    static double N3c1d37d3894(Object []i) {
        double p = Double.NaN;
        if (i[19] == null) {
            p = 1;
        } else if (((Double) i[19]).doubleValue() <= -38.02325368156953) {
            p = 1;
        } else if (((Double) i[19]).doubleValue() > -38.02325368156953) {
            p = WekaClassifier.N2a75e5a8895(i);
        }
        return p;
    }
    static double N2a75e5a8895(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 0;
        } else if (((Double) i[9]).doubleValue() <= -47.75237520988282) {
            p = 0;
        } else if (((Double) i[9]).doubleValue() > -47.75237520988282) {
            p = WekaClassifier.N1369d2d4896(i);
        }
        return p;
    }
    static double N1369d2d4896(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() <= -28.584245009923244) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() > -28.584245009923244) {
            p = 0;
        }
        return p;
    }
    static double N76ad8498897(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= -16.314364286468063) {
            p = WekaClassifier.N23db8631898(i);
        } else if (((Double) i[1]).doubleValue() > -16.314364286468063) {
            p = WekaClassifier.N4f1ac447914(i);
        }
        return p;
    }
    static double N23db8631898(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() <= -38.38850029340261) {
            p = WekaClassifier.N26066f47899(i);
        } else if (((Double) i[10]).doubleValue() > -38.38850029340261) {
            p = WekaClassifier.N70770c2906(i);
        }
        return p;
    }
    static double N26066f47899(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= -26.035074396991234) {
            p = WekaClassifier.N7ba4e621900(i);
        } else if (((Double) i[2]).doubleValue() > -26.035074396991234) {
            p = WekaClassifier.N57029ee2904(i);
        }
        return p;
    }
    static double N7ba4e621900(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 0;
        } else if (((Double) i[9]).doubleValue() <= -44.15427503732527) {
            p = WekaClassifier.N61372489901(i);
        } else if (((Double) i[9]).doubleValue() > -44.15427503732527) {
            p = 0;
        }
        return p;
    }
    static double N61372489901(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= -16.838070159150057) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() > -16.838070159150057) {
            p = WekaClassifier.N1ea2cc90902(i);
        }
        return p;
    }
    static double N1ea2cc90902(Object []i) {
        double p = Double.NaN;
        if (i[15] == null) {
            p = 1;
        } else if (((Double) i[15]).doubleValue() <= -39.13123645075284) {
            p = WekaClassifier.Nbcbe454903(i);
        } else if (((Double) i[15]).doubleValue() > -39.13123645075284) {
            p = 0;
        }
        return p;
    }
    static double Nbcbe454903(Object []i) {
        double p = Double.NaN;
        if (i[13] == null) {
            p = 1;
        } else if (((Double) i[13]).doubleValue() <= -36.573517632168944) {
            p = 1;
        } else if (((Double) i[13]).doubleValue() > -36.573517632168944) {
            p = 0;
        }
        return p;
    }
    static double N57029ee2904(Object []i) {
        double p = Double.NaN;
        if (i[17] == null) {
            p = 1;
        } else if (((Double) i[17]).doubleValue() <= -37.007189988576954) {
            p = 1;
        } else if (((Double) i[17]).doubleValue() > -37.007189988576954) {
            p = WekaClassifier.Nfc9ebe7905(i);
        }
        return p;
    }
    static double Nfc9ebe7905(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= -17.731402266818016) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() > -17.731402266818016) {
            p = 0;
        }
        return p;
    }
    static double N70770c2906(Object []i) {
        double p = Double.NaN;
        if (i[15] == null) {
            p = 0;
        } else if (((Double) i[15]).doubleValue() <= -49.71052512702443) {
            p = WekaClassifier.N53bacd32907(i);
        } else if (((Double) i[15]).doubleValue() > -49.71052512702443) {
            p = WekaClassifier.N100cac29908(i);
        }
        return p;
    }
    static double N53bacd32907(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() <= -35.116011100178376) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() > -35.116011100178376) {
            p = 1;
        }
        return p;
    }
    static double N100cac29908(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 0;
        } else if (((Double) i[14]).doubleValue() <= -44.79141322660994) {
            p = WekaClassifier.N505afb1c909(i);
        } else if (((Double) i[14]).doubleValue() > -44.79141322660994) {
            p = WekaClassifier.N6c6710b5910(i);
        }
        return p;
    }
    static double N505afb1c909(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= -28.172927539103434) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() > -28.172927539103434) {
            p = 1;
        }
        return p;
    }
    static double N6c6710b5910(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() <= -58.61092647133046) {
            p = WekaClassifier.N69b18356911(i);
        } else if (((Double) i[8]).doubleValue() > -58.61092647133046) {
            p = WekaClassifier.N1c2917ad912(i);
        }
        return p;
    }
    static double N69b18356911(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -0.12754683385642807) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > -0.12754683385642807) {
            p = 0;
        }
        return p;
    }
    static double N1c2917ad912(Object []i) {
        double p = Double.NaN;
        if (i[13] == null) {
            p = 1;
        } else if (((Double) i[13]).doubleValue() <= -33.608209845251736) {
            p = 1;
        } else if (((Double) i[13]).doubleValue() > -33.608209845251736) {
            p = WekaClassifier.N1b2c8d2f913(i);
        }
        return p;
    }
    static double N1b2c8d2f913(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= -22.77814542301974) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() > -22.77814542301974) {
            p = 1;
        }
        return p;
    }
    static double N4f1ac447914(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= -31.249847917797883) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() > -31.249847917797883) {
            p = WekaClassifier.N2ad455c1915(i);
        }
        return p;
    }
    static double N2ad455c1915(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= -21.63241543579106) {
            p = WekaClassifier.N7e14bb49916(i);
        } else if (((Double) i[2]).doubleValue() > -21.63241543579106) {
            p = WekaClassifier.N52b750e932(i);
        }
        return p;
    }
    static double N7e14bb49916(Object []i) {
        double p = Double.NaN;
        if (i[16] == null) {
            p = 0;
        } else if (((Double) i[16]).doubleValue() <= -36.706227941625656) {
            p = WekaClassifier.N1ae0451917(i);
        } else if (((Double) i[16]).doubleValue() > -36.706227941625656) {
            p = WekaClassifier.N71f7c64e931(i);
        }
        return p;
    }
    static double N1ae0451917(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 0;
        } else if (((Double) i[12]).doubleValue() <= -40.0174652941342) {
            p = WekaClassifier.N180fd0df918(i);
        } else if (((Double) i[12]).doubleValue() > -40.0174652941342) {
            p = WekaClassifier.N3521c21d926(i);
        }
        return p;
    }
    static double N180fd0df918(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= -28.704850191486365) {
            p = WekaClassifier.N10fdf442919(i);
        } else if (((Double) i[2]).doubleValue() > -28.704850191486365) {
            p = WekaClassifier.N3a95d247921(i);
        }
        return p;
    }
    static double N10fdf442919(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= -15.195448985135016) {
            p = WekaClassifier.N4be8dbe7920(i);
        } else if (((Double) i[1]).doubleValue() > -15.195448985135016) {
            p = 1;
        }
        return p;
    }
    static double N4be8dbe7920(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 0;
        } else if (((Double) i[14]).doubleValue() <= -40.528193641611814) {
            p = 0;
        } else if (((Double) i[14]).doubleValue() > -40.528193641611814) {
            p = 1;
        }
        return p;
    }
    static double N3a95d247921(Object []i) {
        double p = Double.NaN;
        if (i[13] == null) {
            p = 0;
        } else if (((Double) i[13]).doubleValue() <= -43.30721833838926) {
            p = WekaClassifier.N5c7a64e2922(i);
        } else if (((Double) i[13]).doubleValue() > -43.30721833838926) {
            p = WekaClassifier.N2e6004a4924(i);
        }
        return p;
    }
    static double N5c7a64e2922(Object []i) {
        double p = Double.NaN;
        if (i[19] == null) {
            p = 1;
        } else if (((Double) i[19]).doubleValue() <= -35.971688303207365) {
            p = WekaClassifier.N235ac4cb923(i);
        } else if (((Double) i[19]).doubleValue() > -35.971688303207365) {
            p = 0;
        }
        return p;
    }
    static double N235ac4cb923(Object []i) {
        double p = Double.NaN;
        if (i[15] == null) {
            p = 1;
        } else if (((Double) i[15]).doubleValue() <= -38.62941403544172) {
            p = 1;
        } else if (((Double) i[15]).doubleValue() > -38.62941403544172) {
            p = 0;
        }
        return p;
    }
    static double N2e6004a4924(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= -30.033093105822953) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() > -30.033093105822953) {
            p = WekaClassifier.N3a73fcc5925(i);
        }
        return p;
    }
    static double N3a73fcc5925(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 1;
        } else if (((Double) i[11]).doubleValue() <= -33.28662431501722) {
            p = 1;
        } else if (((Double) i[11]).doubleValue() > -33.28662431501722) {
            p = 0;
        }
        return p;
    }
    static double N3521c21d926(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 1;
        } else if (((Double) i[11]).doubleValue() <= -34.65022209460104) {
            p = WekaClassifier.N402834ee927(i);
        } else if (((Double) i[11]).doubleValue() > -34.65022209460104) {
            p = 0;
        }
        return p;
    }
    static double N402834ee927(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() <= -38.776156361788516) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() > -38.776156361788516) {
            p = WekaClassifier.N6ec34d6b928(i);
        }
        return p;
    }
    static double N6ec34d6b928(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() <= -42.83459593424328) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() > -42.83459593424328) {
            p = WekaClassifier.N4b7301a2929(i);
        }
        return p;
    }
    static double N4b7301a2929(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 1;
        } else if (((Double) i[11]).doubleValue() <= -38.36788898114877) {
            p = 1;
        } else if (((Double) i[11]).doubleValue() > -38.36788898114877) {
            p = WekaClassifier.N70f913fb930(i);
        }
        return p;
    }
    static double N70f913fb930(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() <= -33.915749449072) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() > -33.915749449072) {
            p = 1;
        }
        return p;
    }
    static double N71f7c64e931(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -0.07898039521135303) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > -0.07898039521135303) {
            p = 0;
        }
        return p;
    }
    static double N52b750e932(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= -28.038125910316648) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() > -28.038125910316648) {
            p = 1;
        }
        return p;
    }
    static double N56861a18933(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= -35.249135685313846) {
            p = WekaClassifier.N6ed8adf8934(i);
        } else if (((Double) i[3]).doubleValue() > -35.249135685313846) {
            p = WekaClassifier.N558caef939(i);
        }
        return p;
    }
    static double N6ed8adf8934(Object []i) {
        double p = Double.NaN;
        if (i[18] == null) {
            p = 0;
        } else if (((Double) i[18]).doubleValue() <= -33.13071616789178) {
            p = WekaClassifier.N21d2c3db935(i);
        } else if (((Double) i[18]).doubleValue() > -33.13071616789178) {
            p = 1;
        }
        return p;
    }
    static double N21d2c3db935(Object []i) {
        double p = Double.NaN;
        if (i[16] == null) {
            p = 0;
        } else if (((Double) i[16]).doubleValue() <= -32.516451568491824) {
            p = WekaClassifier.N7f0f41ea936(i);
        } else if (((Double) i[16]).doubleValue() > -32.516451568491824) {
            p = 1;
        }
        return p;
    }
    static double N7f0f41ea936(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 0;
        } else if (((Double) i[5]).doubleValue() <= -25.44845786817263) {
            p = WekaClassifier.N19bfc2c9937(i);
        } else if (((Double) i[5]).doubleValue() > -25.44845786817263) {
            p = 1;
        }
        return p;
    }
    static double N19bfc2c9937(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() <= -28.419305704539088) {
            p = WekaClassifier.N32230b6b938(i);
        } else if (((Double) i[8]).doubleValue() > -28.419305704539088) {
            p = 1;
        }
        return p;
    }
    static double N32230b6b938(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= -40.478701283631366) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() > -40.478701283631366) {
            p = 0;
        }
        return p;
    }
    static double N558caef939(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= -19.806575892346267) {
            p = WekaClassifier.N5ddbbf940(i);
        } else if (((Double) i[2]).doubleValue() > -19.806575892346267) {
            p = WekaClassifier.N40d3e70c948(i);
        }
        return p;
    }
    static double N5ddbbf940(Object []i) {
        double p = Double.NaN;
        if (i[17] == null) {
            p = 1;
        } else if (((Double) i[17]).doubleValue() <= -36.72457243032096) {
            p = WekaClassifier.N6793f8f7941(i);
        } else if (((Double) i[17]).doubleValue() > -36.72457243032096) {
            p = 1;
        }
        return p;
    }
    static double N6793f8f7941(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 1;
        } else if (((Double) i[8]).doubleValue() <= -31.874631338586767) {
            p = WekaClassifier.N4d41df3d942(i);
        } else if (((Double) i[8]).doubleValue() > -31.874631338586767) {
            p = WekaClassifier.N5b345d2d946(i);
        }
        return p;
    }
    static double N4d41df3d942(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 1;
        } else if (((Double) i[12]).doubleValue() <= -31.980420685857737) {
            p = 1;
        } else if (((Double) i[12]).doubleValue() > -31.980420685857737) {
            p = WekaClassifier.Ne8d7bc8943(i);
        }
        return p;
    }
    static double Ne8d7bc8943(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 1;
        } else if (((Double) i[14]).doubleValue() <= -36.504880935480266) {
            p = WekaClassifier.N60e3d985944(i);
        } else if (((Double) i[14]).doubleValue() > -36.504880935480266) {
            p = 1;
        }
        return p;
    }
    static double N60e3d985944(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() <= -26.947822643904487) {
            p = WekaClassifier.N184fd12e945(i);
        } else if (((Double) i[10]).doubleValue() > -26.947822643904487) {
            p = 0;
        }
        return p;
    }
    static double N184fd12e945(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 1;
        } else if (((Double) i[8]).doubleValue() <= -38.371788478887424) {
            p = 1;
        } else if (((Double) i[8]).doubleValue() > -38.371788478887424) {
            p = 0;
        }
        return p;
    }
    static double N5b345d2d946(Object []i) {
        double p = Double.NaN;
        if (i[19] == null) {
            p = 0;
        } else if (((Double) i[19]).doubleValue() <= -29.01052426876505) {
            p = WekaClassifier.N3e022eb8947(i);
        } else if (((Double) i[19]).doubleValue() > -29.01052426876505) {
            p = 1;
        }
        return p;
    }
    static double N3e022eb8947(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= -33.50810673461186) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() > -33.50810673461186) {
            p = 0;
        }
        return p;
    }
    static double N40d3e70c948(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() <= -35.82110781187272) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() > -35.82110781187272) {
            p = WekaClassifier.N26738899949(i);
        }
        return p;
    }
    static double N26738899949(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= -13.042282289466037) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() > -13.042282289466037) {
            p = 0;
        }
        return p;
    }
    static double N5fd7644f950(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() <= -27.917250893358123) {
            p = WekaClassifier.N700ff6e3951(i);
        } else if (((Double) i[4]).doubleValue() > -27.917250893358123) {
            p = WekaClassifier.Nd7b9efc956(i);
        }
        return p;
    }
    static double N700ff6e3951(Object []i) {
        double p = Double.NaN;
        if (i[19] == null) {
            p = 1;
        } else if (((Double) i[19]).doubleValue() <= -41.12303299817453) {
            p = WekaClassifier.N2f3b8469952(i);
        } else if (((Double) i[19]).doubleValue() > -41.12303299817453) {
            p = 1;
        }
        return p;
    }
    static double N2f3b8469952(Object []i) {
        double p = Double.NaN;
        if (i[17] == null) {
            p = 0;
        } else if (((Double) i[17]).doubleValue() <= -43.960283547615774) {
            p = WekaClassifier.N15b6f657953(i);
        } else if (((Double) i[17]).doubleValue() > -43.960283547615774) {
            p = WekaClassifier.N71a70db2954(i);
        }
        return p;
    }
    static double N15b6f657953(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 0;
        } else if (((Double) i[5]).doubleValue() <= -40.11358591607299) {
            p = 0;
        } else if (((Double) i[5]).doubleValue() > -40.11358591607299) {
            p = 1;
        }
        return p;
    }
    static double N71a70db2954(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 1;
        } else if (((Double) i[8]).doubleValue() <= -46.38376798230739) {
            p = WekaClassifier.N7e90558b955(i);
        } else if (((Double) i[8]).doubleValue() > -46.38376798230739) {
            p = 1;
        }
        return p;
    }
    static double N7e90558b955(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= -39.5383744388163) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() > -39.5383744388163) {
            p = 1;
        }
        return p;
    }
    static double Nd7b9efc956(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() <= -31.26217447113932) {
            p = WekaClassifier.N2f5dd54a957(i);
        } else if (((Double) i[10]).doubleValue() > -31.26217447113932) {
            p = 1;
        }
        return p;
    }
    static double N2f5dd54a957(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() <= -31.346574593126917) {
            p = WekaClassifier.N66de878e958(i);
        } else if (((Double) i[6]).doubleValue() > -31.346574593126917) {
            p = 0;
        }
        return p;
    }
    static double N66de878e958(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 1;
        } else if (((Double) i[14]).doubleValue() <= -36.68683292358253) {
            p = 1;
        } else if (((Double) i[14]).doubleValue() > -36.68683292358253) {
            p = WekaClassifier.N1a9ebad3959(i);
        }
        return p;
    }
    static double N1a9ebad3959(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= -23.40009487301501) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() > -23.40009487301501) {
            p = 1;
        }
        return p;
    }
    static double N4bc34b02960(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= -25.43484374795762) {
            p = WekaClassifier.Naf520b5961(i);
        } else if (((Double) i[9]).doubleValue() > -25.43484374795762) {
            p = WekaClassifier.N14bf2b4d1128(i);
        }
        return p;
    }
    static double Naf520b5961(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= -17.770096364386262) {
            p = WekaClassifier.N18853492962(i);
        } else if (((Double) i[1]).doubleValue() > -17.770096364386262) {
            p = WekaClassifier.N5a1a564b1004(i);
        }
        return p;
    }
    static double N18853492962(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() <= -26.10308931750527) {
            p = WekaClassifier.N77224d73963(i);
        } else if (((Double) i[10]).doubleValue() > -26.10308931750527) {
            p = WekaClassifier.N1d70443e1000(i);
        }
        return p;
    }
    static double N77224d73963(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= -30.49470809741718) {
            p = WekaClassifier.N266883ce964(i);
        } else if (((Double) i[2]).doubleValue() > -30.49470809741718) {
            p = WekaClassifier.N6aafa319989(i);
        }
        return p;
    }
    static double N266883ce964(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 1;
        } else if (((Double) i[6]).doubleValue() <= -26.357796748364294) {
            p = WekaClassifier.N53bef3e965(i);
        } else if (((Double) i[6]).doubleValue() > -26.357796748364294) {
            p = WekaClassifier.N3541acc6986(i);
        }
        return p;
    }
    static double N53bef3e965(Object []i) {
        double p = Double.NaN;
        if (i[15] == null) {
            p = 1;
        } else if (((Double) i[15]).doubleValue() <= -30.23623574290348) {
            p = WekaClassifier.N34ab6aaf966(i);
        } else if (((Double) i[15]).doubleValue() > -30.23623574290348) {
            p = WekaClassifier.N2b24f1f9984(i);
        }
        return p;
    }
    static double N34ab6aaf966(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 1;
        } else if (((Double) i[8]).doubleValue() <= -27.834737577850916) {
            p = WekaClassifier.N5187e09c967(i);
        } else if (((Double) i[8]).doubleValue() > -27.834737577850916) {
            p = WekaClassifier.Nec49c87983(i);
        }
        return p;
    }
    static double N5187e09c967(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= -29.898327123044265) {
            p = WekaClassifier.N33137f91968(i);
        } else if (((Double) i[9]).doubleValue() > -29.898327123044265) {
            p = 1;
        }
        return p;
    }
    static double N33137f91968(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= -21.478152178107898) {
            p = WekaClassifier.N698b24d2969(i);
        } else if (((Double) i[1]).doubleValue() > -21.478152178107898) {
            p = WekaClassifier.N7258d4b1975(i);
        }
        return p;
    }
    static double N698b24d2969(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -2.3030237479957876) {
            p = WekaClassifier.N69ad55e970(i);
        } else if (((Double) i[0]).doubleValue() > -2.3030237479957876) {
            p = 1;
        }
        return p;
    }
    static double N69ad55e970(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -5.748363545328708) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > -5.748363545328708) {
            p = WekaClassifier.N68f75611971(i);
        }
        return p;
    }
    static double N68f75611971(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() <= -31.447786702837703) {
            p = WekaClassifier.N40b05369972(i);
        } else if (((Double) i[10]).doubleValue() > -31.447786702837703) {
            p = 0;
        }
        return p;
    }
    static double N40b05369972(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 0;
        } else if (((Double) i[11]).doubleValue() <= -43.81026640523899) {
            p = 0;
        } else if (((Double) i[11]).doubleValue() > -43.81026640523899) {
            p = WekaClassifier.N70ad4219973(i);
        }
        return p;
    }
    static double N70ad4219973(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() <= -46.620127809487954) {
            p = WekaClassifier.N204d4977974(i);
        } else if (((Double) i[10]).doubleValue() > -46.620127809487954) {
            p = 1;
        }
        return p;
    }
    static double N204d4977974(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() <= -23.166141579782703) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() > -23.166141579782703) {
            p = 1;
        }
        return p;
    }
    static double N7258d4b1975(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -4.156772709940228) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > -4.156772709940228) {
            p = WekaClassifier.N30b1ea88976(i);
        }
        return p;
    }
    static double N30b1ea88976(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() <= -28.059493297141078) {
            p = WekaClassifier.N2a96cb0d977(i);
        } else if (((Double) i[7]).doubleValue() > -28.059493297141078) {
            p = 0;
        }
        return p;
    }
    static double N2a96cb0d977(Object []i) {
        double p = Double.NaN;
        if (i[15] == null) {
            p = 0;
        } else if (((Double) i[15]).doubleValue() <= -36.89167819748704) {
            p = WekaClassifier.N60da39d9978(i);
        } else if (((Double) i[15]).doubleValue() > -36.89167819748704) {
            p = 1;
        }
        return p;
    }
    static double N60da39d9978(Object []i) {
        double p = Double.NaN;
        if (i[19] == null) {
            p = 0;
        } else if (((Double) i[19]).doubleValue() <= -51.31541429190855) {
            p = 0;
        } else if (((Double) i[19]).doubleValue() > -51.31541429190855) {
            p = WekaClassifier.N5493942f979(i);
        }
        return p;
    }
    static double N5493942f979(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= -18.350960664675384) {
            p = WekaClassifier.N6b49c19f980(i);
        } else if (((Double) i[1]).doubleValue() > -18.350960664675384) {
            p = 0;
        }
        return p;
    }
    static double N6b49c19f980(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= -33.49763667457) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() > -33.49763667457) {
            p = WekaClassifier.N771bb158981(i);
        }
        return p;
    }
    static double N771bb158981(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() <= -29.652826058425497) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() > -29.652826058425497) {
            p = WekaClassifier.N46be5a93982(i);
        }
        return p;
    }
    static double N46be5a93982(Object []i) {
        double p = Double.NaN;
        if (i[16] == null) {
            p = 1;
        } else if (((Double) i[16]).doubleValue() <= -37.686492520271976) {
            p = 1;
        } else if (((Double) i[16]).doubleValue() > -37.686492520271976) {
            p = 0;
        }
        return p;
    }
    static double Nec49c87983(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= -26.077553613624065) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() > -26.077553613624065) {
            p = 0;
        }
        return p;
    }
    static double N2b24f1f9984(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() <= -34.230077188730114) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() > -34.230077188730114) {
            p = WekaClassifier.N11f14b4985(i);
        }
        return p;
    }
    static double N11f14b4985(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() <= -25.356279163718078) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() > -25.356279163718078) {
            p = 1;
        }
        return p;
    }
    static double N3541acc6986(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 1;
        } else if (((Double) i[12]).doubleValue() <= -33.08520093296581) {
            p = WekaClassifier.N1fcb3e4d987(i);
        } else if (((Double) i[12]).doubleValue() > -33.08520093296581) {
            p = 0;
        }
        return p;
    }
    static double N1fcb3e4d987(Object []i) {
        double p = Double.NaN;
        if (i[16] == null) {
            p = 1;
        } else if (((Double) i[16]).doubleValue() <= -34.1299206090035) {
            p = 1;
        } else if (((Double) i[16]).doubleValue() > -34.1299206090035) {
            p = WekaClassifier.N136caf74988(i);
        }
        return p;
    }
    static double N136caf74988(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 1;
        } else if (((Double) i[14]).doubleValue() <= -37.5940077878206) {
            p = 1;
        } else if (((Double) i[14]).doubleValue() > -37.5940077878206) {
            p = 0;
        }
        return p;
    }
    static double N6aafa319989(Object []i) {
        double p = Double.NaN;
        if (i[18] == null) {
            p = 1;
        } else if (((Double) i[18]).doubleValue() <= -31.71287657640395) {
            p = WekaClassifier.N52301516990(i);
        } else if (((Double) i[18]).doubleValue() > -31.71287657640395) {
            p = WekaClassifier.N48e6e817995(i);
        }
        return p;
    }
    static double N52301516990(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= -19.768742773684252) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() > -19.768742773684252) {
            p = WekaClassifier.N144f604b991(i);
        }
        return p;
    }
    static double N144f604b991(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 1;
        } else if (((Double) i[12]).doubleValue() <= -30.342846952962258) {
            p = 1;
        } else if (((Double) i[12]).doubleValue() > -30.342846952962258) {
            p = WekaClassifier.N622e6ab9992(i);
        }
        return p;
    }
    static double N622e6ab9992(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() <= -28.611602675011525) {
            p = WekaClassifier.N758eaa8e993(i);
        } else if (((Double) i[3]).doubleValue() > -28.611602675011525) {
            p = 1;
        }
        return p;
    }
    static double N758eaa8e993(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= -24.8442676988854) {
            p = WekaClassifier.N2744898c994(i);
        } else if (((Double) i[4]).doubleValue() > -24.8442676988854) {
            p = 1;
        }
        return p;
    }
    static double N2744898c994(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= -49.243176514821386) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() > -49.243176514821386) {
            p = 0;
        }
        return p;
    }
    static double N48e6e817995(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= -27.852484893506542) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() > -27.852484893506542) {
            p = WekaClassifier.N590c3810996(i);
        }
        return p;
    }
    static double N590c3810996(Object []i) {
        double p = Double.NaN;
        if (i[17] == null) {
            p = 0;
        } else if (((Double) i[17]).doubleValue() <= -34.14373083541317) {
            p = WekaClassifier.N59562365997(i);
        } else if (((Double) i[17]).doubleValue() > -34.14373083541317) {
            p = 1;
        }
        return p;
    }
    static double N59562365997(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() <= -27.85182662754635) {
            p = WekaClassifier.N5addc92a998(i);
        } else if (((Double) i[6]).doubleValue() > -27.85182662754635) {
            p = 1;
        }
        return p;
    }
    static double N5addc92a998(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 0;
        } else if (((Double) i[11]).doubleValue() <= -26.34999234994454) {
            p = WekaClassifier.N25042436999(i);
        } else if (((Double) i[11]).doubleValue() > -26.34999234994454) {
            p = 1;
        }
        return p;
    }
    static double N25042436999(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= -18.566380197767835) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() > -18.566380197767835) {
            p = 1;
        }
        return p;
    }
    static double N1d70443e1000(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= -30.234179024364252) {
            p = WekaClassifier.N75d501fe1001(i);
        } else if (((Double) i[4]).doubleValue() > -30.234179024364252) {
            p = 1;
        }
        return p;
    }
    static double N75d501fe1001(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 0;
        } else if (((Double) i[5]).doubleValue() <= -24.504310405257762) {
            p = WekaClassifier.N417512f71002(i);
        } else if (((Double) i[5]).doubleValue() > -24.504310405257762) {
            p = 1;
        }
        return p;
    }
    static double N417512f71002(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 0;
        } else if (((Double) i[9]).doubleValue() <= -27.56645786757086) {
            p = WekaClassifier.N45d4bb7b1003(i);
        } else if (((Double) i[9]).doubleValue() > -27.56645786757086) {
            p = 1;
        }
        return p;
    }
    static double N45d4bb7b1003(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 1;
        } else if (((Double) i[8]).doubleValue() <= -41.13405144364235) {
            p = 1;
        } else if (((Double) i[8]).doubleValue() > -41.13405144364235) {
            p = 0;
        }
        return p;
    }
    static double N5a1a564b1004(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 1;
        } else if (((Double) i[6]).doubleValue() <= -23.626482156600684) {
            p = WekaClassifier.N79d66071005(i);
        } else if (((Double) i[6]).doubleValue() > -23.626482156600684) {
            p = WekaClassifier.N3f5560b21126(i);
        }
        return p;
    }
    static double N79d66071005(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= -20.497176147296386) {
            p = WekaClassifier.N6e163ea91006(i);
        } else if (((Double) i[3]).doubleValue() > -20.497176147296386) {
            p = WekaClassifier.N10d76fa71118(i);
        }
        return p;
    }
    static double N6e163ea91006(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= -13.250426493280145) {
            p = WekaClassifier.Nef94f731007(i);
        } else if (((Double) i[1]).doubleValue() > -13.250426493280145) {
            p = WekaClassifier.N5e01ffa11107(i);
        }
        return p;
    }
    static double Nef94f731007(Object []i) {
        double p = Double.NaN;
        if (i[17] == null) {
            p = 1;
        } else if (((Double) i[17]).doubleValue() <= -32.593064140640095) {
            p = WekaClassifier.N659e8e91008(i);
        } else if (((Double) i[17]).doubleValue() > -32.593064140640095) {
            p = WekaClassifier.N78773ecc1098(i);
        }
        return p;
    }
    static double N659e8e91008(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= -25.403289352258618) {
            p = WekaClassifier.N6a981b7b1009(i);
        } else if (((Double) i[4]).doubleValue() > -25.403289352258618) {
            p = WekaClassifier.N5bac73421087(i);
        }
        return p;
    }
    static double N6a981b7b1009(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= -29.82733592827453) {
            p = WekaClassifier.N352483f71010(i);
        } else if (((Double) i[5]).doubleValue() > -29.82733592827453) {
            p = WekaClassifier.N352f39191051(i);
        }
        return p;
    }
    static double N352483f71010(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 1;
        } else if (((Double) i[12]).doubleValue() <= -33.45034966728932) {
            p = WekaClassifier.N7162d0f71011(i);
        } else if (((Double) i[12]).doubleValue() > -33.45034966728932) {
            p = WekaClassifier.N6c48530d1039(i);
        }
        return p;
    }
    static double N7162d0f71011(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() <= -33.524022671534354) {
            p = WekaClassifier.N38b570921012(i);
        } else if (((Double) i[10]).doubleValue() > -33.524022671534354) {
            p = 1;
        }
        return p;
    }
    static double N38b570921012(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= -20.897924189161063) {
            p = WekaClassifier.N125cf73c1013(i);
        } else if (((Double) i[2]).doubleValue() > -20.897924189161063) {
            p = 1;
        }
        return p;
    }
    static double N125cf73c1013(Object []i) {
        double p = Double.NaN;
        if (i[13] == null) {
            p = 1;
        } else if (((Double) i[13]).doubleValue() <= -31.418469091340626) {
            p = WekaClassifier.N376e5bb1014(i);
        } else if (((Double) i[13]).doubleValue() > -31.418469091340626) {
            p = 1;
        }
        return p;
    }
    static double N376e5bb1014(Object []i) {
        double p = Double.NaN;
        if (i[18] == null) {
            p = 1;
        } else if (((Double) i[18]).doubleValue() <= -33.39462618504021) {
            p = WekaClassifier.N6474784a1015(i);
        } else if (((Double) i[18]).doubleValue() > -33.39462618504021) {
            p = WekaClassifier.N61b7b6371035(i);
        }
        return p;
    }
    static double N6474784a1015(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -1.260775445821956) {
            p = WekaClassifier.N77d6a5b61016(i);
        } else if (((Double) i[0]).doubleValue() > -1.260775445821956) {
            p = WekaClassifier.N1316f5721025(i);
        }
        return p;
    }
    static double N77d6a5b61016(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() <= -33.88808672613723) {
            p = WekaClassifier.N24649671017(i);
        } else if (((Double) i[3]).doubleValue() > -33.88808672613723) {
            p = WekaClassifier.N35c2dec1021(i);
        }
        return p;
    }
    static double N24649671017(Object []i) {
        double p = Double.NaN;
        if (i[15] == null) {
            p = 1;
        } else if (((Double) i[15]).doubleValue() <= -38.33281950288963) {
            p = WekaClassifier.N36293fa91018(i);
        } else if (((Double) i[15]).doubleValue() > -38.33281950288963) {
            p = WekaClassifier.N7158b70e1019(i);
        }
        return p;
    }
    static double N36293fa91018(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= -17.032004211136588) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() > -17.032004211136588) {
            p = 1;
        }
        return p;
    }
    static double N7158b70e1019(Object []i) {
        double p = Double.NaN;
        if (i[13] == null) {
            p = 1;
        } else if (((Double) i[13]).doubleValue() <= -56.95445502435582) {
            p = 1;
        } else if (((Double) i[13]).doubleValue() > -56.95445502435582) {
            p = WekaClassifier.N33e157861020(i);
        }
        return p;
    }
    static double N33e157861020(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -7.468851940258382) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > -7.468851940258382) {
            p = 0;
        }
        return p;
    }
    static double N35c2dec1021(Object []i) {
        double p = Double.NaN;
        if (i[16] == null) {
            p = 1;
        } else if (((Double) i[16]).doubleValue() <= -33.775327957973275) {
            p = WekaClassifier.N7c779e591022(i);
        } else if (((Double) i[16]).doubleValue() > -33.775327957973275) {
            p = WekaClassifier.N714795fb1024(i);
        }
        return p;
    }
    static double N7c779e591022(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= -41.60304951994968) {
            p = WekaClassifier.N4823b61e1023(i);
        } else if (((Double) i[5]).doubleValue() > -41.60304951994968) {
            p = 1;
        }
        return p;
    }
    static double N4823b61e1023(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 0;
        } else if (((Double) i[5]).doubleValue() <= -51.12788931414733) {
            p = 0;
        } else if (((Double) i[5]).doubleValue() > -51.12788931414733) {
            p = 1;
        }
        return p;
    }
    static double N714795fb1024(Object []i) {
        double p = Double.NaN;
        if (i[16] == null) {
            p = 0;
        } else if (((Double) i[16]).doubleValue() <= -32.023293511966855) {
            p = 0;
        } else if (((Double) i[16]).doubleValue() > -32.023293511966855) {
            p = 1;
        }
        return p;
    }
    static double N1316f5721025(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= -22.80558852432538) {
            p = WekaClassifier.N5353341f1026(i);
        } else if (((Double) i[3]).doubleValue() > -22.80558852432538) {
            p = 0;
        }
        return p;
    }
    static double N5353341f1026(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() <= -37.7313719442033) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() > -37.7313719442033) {
            p = WekaClassifier.N615eb2d1027(i);
        }
        return p;
    }
    static double N615eb2d1027(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= -16.414104832597125) {
            p = WekaClassifier.N4b305e591028(i);
        } else if (((Double) i[1]).doubleValue() > -16.414104832597125) {
            p = WekaClassifier.N2590bd0e1030(i);
        }
        return p;
    }
    static double N4b305e591028(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= -28.17750821549485) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() > -28.17750821549485) {
            p = WekaClassifier.N6fa98f281029(i);
        }
        return p;
    }
    static double N6fa98f281029(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() <= -39.548629996683005) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() > -39.548629996683005) {
            p = 1;
        }
        return p;
    }
    static double N2590bd0e1030(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= -0.4946748072150271) {
            p = WekaClassifier.Ncf566121031(i);
        } else if (((Double) i[0]).doubleValue() > -0.4946748072150271) {
            p = WekaClassifier.N46558d191034(i);
        }
        return p;
    }
    static double Ncf566121031(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 0;
        } else if (((Double) i[12]).doubleValue() <= -43.17792951215399) {
            p = 0;
        } else if (((Double) i[12]).doubleValue() > -43.17792951215399) {
            p = WekaClassifier.N45fe23431032(i);
        }
        return p;
    }
    static double N45fe23431032(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= -25.55548522570626) {
            p = WekaClassifier.N660d341b1033(i);
        } else if (((Double) i[2]).doubleValue() > -25.55548522570626) {
            p = 1;
        }
        return p;
    }
    static double N660d341b1033(Object []i) {
        double p = Double.NaN;
        if (i[18] == null) {
            p = 0;
        } else if (((Double) i[18]).doubleValue() <= -37.79843884573952) {
            p = 0;
        } else if (((Double) i[18]).doubleValue() > -37.79843884573952) {
            p = 1;
        }
        return p;
    }
    static double N46558d191034(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= -23.840619998941172) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() > -23.840619998941172) {
            p = 0;
        }
        return p;
    }
    static double N61b7b6371035(Object []i) {
        double p = Double.NaN;
        if (i[19] == null) {
            p = 0;
        } else if (((Double) i[19]).doubleValue() <= -35.17586948590407) {
            p = WekaClassifier.N55e765791036(i);
        } else if (((Double) i[19]).doubleValue() > -35.17586948590407) {
            p = 1;
        }
        return p;
    }
    static double N55e765791036(Object []i) {
        double p = Double.NaN;
        if (i[16] == null) {
            p = 1;
        } else if (((Double) i[16]).doubleValue() <= -48.2283444625514) {
            p = 1;
        } else if (((Double) i[16]).doubleValue() > -48.2283444625514) {
            p = WekaClassifier.N5a453e321037(i);
        }
        return p;
    }
    static double N5a453e321037(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= -42.055252347566245) {
            p = WekaClassifier.N30925d261038(i);
        } else if (((Double) i[4]).doubleValue() > -42.055252347566245) {
            p = 0;
        }
        return p;
    }
    static double N30925d261038(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= -48.09584382863156) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() > -48.09584382863156) {
            p = 1;
        }
        return p;
    }
    static double N6c48530d1039(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= -1.9407967675030378) {
            p = WekaClassifier.N26a2f501040(i);
        } else if (((Double) i[0]).doubleValue() > -1.9407967675030378) {
            p = WekaClassifier.N3afad1651049(i);
        }
        return p;
    }
    static double N26a2f501040(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= -39.09256707326013) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() > -39.09256707326013) {
            p = WekaClassifier.N712d35811041(i);
        }
        return p;
    }
    static double N712d35811041(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 0;
        } else if (((Double) i[11]).doubleValue() <= -31.134049305994495) {
            p = WekaClassifier.N53f43def1042(i);
        } else if (((Double) i[11]).doubleValue() > -31.134049305994495) {
            p = WekaClassifier.N44398dfc1046(i);
        }
        return p;
    }
    static double N53f43def1042(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() <= -30.808597301951185) {
            p = WekaClassifier.N7d8adca71043(i);
        } else if (((Double) i[8]).doubleValue() > -30.808597301951185) {
            p = WekaClassifier.N2ec97ce91044(i);
        }
        return p;
    }
    static double N7d8adca71043(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 0;
        } else if (((Double) i[14]).doubleValue() <= -27.638604482385105) {
            p = 0;
        } else if (((Double) i[14]).doubleValue() > -27.638604482385105) {
            p = 1;
        }
        return p;
    }
    static double N2ec97ce91044(Object []i) {
        double p = Double.NaN;
        if (i[15] == null) {
            p = 1;
        } else if (((Double) i[15]).doubleValue() <= -35.00069037990502) {
            p = WekaClassifier.N36d0d58c1045(i);
        } else if (((Double) i[15]).doubleValue() > -35.00069037990502) {
            p = 0;
        }
        return p;
    }
    static double N36d0d58c1045(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 1;
        } else if (((Double) i[14]).doubleValue() <= -32.34382993515864) {
            p = 1;
        } else if (((Double) i[14]).doubleValue() > -32.34382993515864) {
            p = 0;
        }
        return p;
    }
    static double N44398dfc1046(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 1;
        } else if (((Double) i[8]).doubleValue() <= -35.90006879745341) {
            p = WekaClassifier.N6ffd1e381047(i);
        } else if (((Double) i[8]).doubleValue() > -35.90006879745341) {
            p = 1;
        }
        return p;
    }
    static double N6ffd1e381047(Object []i) {
        double p = Double.NaN;
        if (i[17] == null) {
            p = 0;
        } else if (((Double) i[17]).doubleValue() <= -38.77834820088856) {
            p = WekaClassifier.Na36091a1048(i);
        } else if (((Double) i[17]).doubleValue() > -38.77834820088856) {
            p = 1;
        }
        return p;
    }
    static double Na36091a1048(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 0;
        } else if (((Double) i[9]).doubleValue() <= -28.61104979407977) {
            p = 0;
        } else if (((Double) i[9]).doubleValue() > -28.61104979407977) {
            p = 1;
        }
        return p;
    }
    static double N3afad1651049(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= -14.27161474481344) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() > -14.27161474481344) {
            p = WekaClassifier.N32a4edab1050(i);
        }
        return p;
    }
    static double N32a4edab1050(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() <= -22.937893319678118) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() > -22.937893319678118) {
            p = 1;
        }
        return p;
    }
    static double N352f39191051(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= -30.607229214851174) {
            p = WekaClassifier.Nf6b887f1052(i);
        } else if (((Double) i[2]).doubleValue() > -30.607229214851174) {
            p = WekaClassifier.N16dba33e1060(i);
        }
        return p;
    }
    static double Nf6b887f1052(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 1;
        } else if (((Double) i[12]).doubleValue() <= -30.209037698967308) {
            p = WekaClassifier.N63f6110e1053(i);
        } else if (((Double) i[12]).doubleValue() > -30.209037698967308) {
            p = WekaClassifier.N1f5303691058(i);
        }
        return p;
    }
    static double N63f6110e1053(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= -41.68584894984961) {
            p = WekaClassifier.N762a616e1054(i);
        } else if (((Double) i[4]).doubleValue() > -41.68584894984961) {
            p = WekaClassifier.N3a0179431055(i);
        }
        return p;
    }
    static double N762a616e1054(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -3.9550952036011324) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > -3.9550952036011324) {
            p = 0;
        }
        return p;
    }
    static double N3a0179431055(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= -34.06645187111317) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() > -34.06645187111317) {
            p = WekaClassifier.N69fa360c1056(i);
        }
        return p;
    }
    static double N69fa360c1056(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -0.14931145293934378) {
            p = WekaClassifier.N3a57245c1057(i);
        } else if (((Double) i[0]).doubleValue() > -0.14931145293934378) {
            p = 0;
        }
        return p;
    }
    static double N3a57245c1057(Object []i) {
        double p = Double.NaN;
        if (i[19] == null) {
            p = 1;
        } else if (((Double) i[19]).doubleValue() <= -30.140156170775935) {
            p = 1;
        } else if (((Double) i[19]).doubleValue() > -30.140156170775935) {
            p = 0;
        }
        return p;
    }
    static double N1f5303691058(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 0;
        } else if (((Double) i[11]).doubleValue() <= -29.362156791259654) {
            p = WekaClassifier.N2e29baa11059(i);
        } else if (((Double) i[11]).doubleValue() > -29.362156791259654) {
            p = 1;
        }
        return p;
    }
    static double N2e29baa11059(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() <= -41.52274182744924) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() > -41.52274182744924) {
            p = 0;
        }
        return p;
    }
    static double N16dba33e1060(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= -21.273033369379192) {
            p = WekaClassifier.N15ad007d1061(i);
        } else if (((Double) i[2]).doubleValue() > -21.273033369379192) {
            p = WekaClassifier.N57aedc2f1081(i);
        }
        return p;
    }
    static double N15ad007d1061(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 0;
        } else if (((Double) i[7]).doubleValue() <= -26.80966992875662) {
            p = WekaClassifier.N12e211ea1062(i);
        } else if (((Double) i[7]).doubleValue() > -26.80966992875662) {
            p = WekaClassifier.N5c4cc1431078(i);
        }
        return p;
    }
    static double N12e211ea1062(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() <= -23.18413844165999) {
            p = WekaClassifier.N717d4da51063(i);
        } else if (((Double) i[3]).doubleValue() > -23.18413844165999) {
            p = WekaClassifier.N11177f891076(i);
        }
        return p;
    }
    static double N717d4da51063(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() <= -33.933351845935164) {
            p = WekaClassifier.N3af4c2e71064(i);
        } else if (((Double) i[7]).doubleValue() > -33.933351845935164) {
            p = WekaClassifier.N398ac6241070(i);
        }
        return p;
    }
    static double N3af4c2e71064(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= -29.44639502741141) {
            p = WekaClassifier.N47a7932c1065(i);
        } else if (((Double) i[4]).doubleValue() > -29.44639502741141) {
            p = WekaClassifier.N42bcd8cf1068(i);
        }
        return p;
    }
    static double N47a7932c1065(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 0;
        } else if (((Double) i[11]).doubleValue() <= -35.03310440105969) {
            p = WekaClassifier.N4548b7731066(i);
        } else if (((Double) i[11]).doubleValue() > -35.03310440105969) {
            p = WekaClassifier.N5e43da1a1067(i);
        }
        return p;
    }
    static double N4548b7731066(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() <= -31.66656585931361) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() > -31.66656585931361) {
            p = 1;
        }
        return p;
    }
    static double N5e43da1a1067(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= -24.13544878491504) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() > -24.13544878491504) {
            p = 0;
        }
        return p;
    }
    static double N42bcd8cf1068(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 0;
        } else if (((Double) i[14]).doubleValue() <= -53.85991092133294) {
            p = WekaClassifier.N39f90d471069(i);
        } else if (((Double) i[14]).doubleValue() > -53.85991092133294) {
            p = 1;
        }
        return p;
    }
    static double N39f90d471069(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= -28.28417699964215) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() > -28.28417699964215) {
            p = 0;
        }
        return p;
    }
    static double N398ac6241070(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() <= -27.669388788276144) {
            p = WekaClassifier.N79d958051071(i);
        } else if (((Double) i[6]).doubleValue() > -27.669388788276144) {
            p = 1;
        }
        return p;
    }
    static double N79d958051071(Object []i) {
        double p = Double.NaN;
        if (i[18] == null) {
            p = 0;
        } else if (((Double) i[18]).doubleValue() <= -34.30798539166935) {
            p = WekaClassifier.N5d879d511072(i);
        } else if (((Double) i[18]).doubleValue() > -34.30798539166935) {
            p = WekaClassifier.N709b19de1075(i);
        }
        return p;
    }
    static double N5d879d511072(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= -27.821315241442605) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() > -27.821315241442605) {
            p = WekaClassifier.N2c6520931073(i);
        }
        return p;
    }
    static double N2c6520931073(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() <= -35.46247403781134) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() > -35.46247403781134) {
            p = WekaClassifier.N43b168dd1074(i);
        }
        return p;
    }
    static double N43b168dd1074(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 0;
        } else if (((Double) i[12]).doubleValue() <= -54.48288951497916) {
            p = 0;
        } else if (((Double) i[12]).doubleValue() > -54.48288951497916) {
            p = 1;
        }
        return p;
    }
    static double N709b19de1075(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() <= -25.347694172376315) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() > -25.347694172376315) {
            p = 1;
        }
        return p;
    }
    static double N11177f891076(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= -2.957754721516878) {
            p = WekaClassifier.N14f3a4801077(i);
        } else if (((Double) i[0]).doubleValue() > -2.957754721516878) {
            p = 0;
        }
        return p;
    }
    static double N14f3a4801077(Object []i) {
        double p = Double.NaN;
        if (i[18] == null) {
            p = 1;
        } else if (((Double) i[18]).doubleValue() <= -30.073558515792875) {
            p = 1;
        } else if (((Double) i[18]).doubleValue() > -30.073558515792875) {
            p = 0;
        }
        return p;
    }
    static double N5c4cc1431078(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= -13.567763579373342) {
            p = WekaClassifier.N743166fd1079(i);
        } else if (((Double) i[1]).doubleValue() > -13.567763579373342) {
            p = 0;
        }
        return p;
    }
    static double N743166fd1079(Object []i) {
        double p = Double.NaN;
        if (i[13] == null) {
            p = 0;
        } else if (((Double) i[13]).doubleValue() <= -40.219587059944246) {
            p = WekaClassifier.N5e70a4c51080(i);
        } else if (((Double) i[13]).doubleValue() > -40.219587059944246) {
            p = 1;
        }
        return p;
    }
    static double N5e70a4c51080(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= -22.43702364144344) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() > -22.43702364144344) {
            p = 0;
        }
        return p;
    }
    static double N57aedc2f1081(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() <= -29.706353145449196) {
            p = WekaClassifier.N6d5249401082(i);
        } else if (((Double) i[10]).doubleValue() > -29.706353145449196) {
            p = WekaClassifier.N17afaa3a1086(i);
        }
        return p;
    }
    static double N6d5249401082(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() <= -34.89643781894974) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() > -34.89643781894974) {
            p = WekaClassifier.N122bdc991083(i);
        }
        return p;
    }
    static double N122bdc991083(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -4.841890488371625) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > -4.841890488371625) {
            p = WekaClassifier.N49a614951084(i);
        }
        return p;
    }
    static double N49a614951084(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 1;
        } else if (((Double) i[14]).doubleValue() <= -37.84781527878661) {
            p = WekaClassifier.N68c8f62a1085(i);
        } else if (((Double) i[14]).doubleValue() > -37.84781527878661) {
            p = 0;
        }
        return p;
    }
    static double N68c8f62a1085(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 1;
        } else if (((Double) i[12]).doubleValue() <= -33.66981717517785) {
            p = 1;
        } else if (((Double) i[12]).doubleValue() > -33.66981717517785) {
            p = 0;
        }
        return p;
    }
    static double N17afaa3a1086(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -7.2218214279477095) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > -7.2218214279477095) {
            p = 0;
        }
        return p;
    }
    static double N5bac73421087(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 1;
        } else if (((Double) i[6]).doubleValue() <= -36.98816376284391) {
            p = WekaClassifier.N22d7d61e1088(i);
        } else if (((Double) i[6]).doubleValue() > -36.98816376284391) {
            p = WekaClassifier.N43e08b301092(i);
        }
        return p;
    }
    static double N22d7d61e1088(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= -23.14651234443368) {
            p = WekaClassifier.Nd811dc81089(i);
        } else if (((Double) i[3]).doubleValue() > -23.14651234443368) {
            p = WekaClassifier.N5f9bc1fb1091(i);
        }
        return p;
    }
    static double Nd811dc81089(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= -26.507118223948993) {
            p = WekaClassifier.N671588381090(i);
        } else if (((Double) i[9]).doubleValue() > -26.507118223948993) {
            p = 0;
        }
        return p;
    }
    static double N671588381090(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() <= -47.154182612958756) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() > -47.154182612958756) {
            p = 1;
        }
        return p;
    }
    static double N5f9bc1fb1091(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= -23.685621794943735) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() > -23.685621794943735) {
            p = 0;
        }
        return p;
    }
    static double N43e08b301092(Object []i) {
        double p = Double.NaN;
        if (i[18] == null) {
            p = 1;
        } else if (((Double) i[18]).doubleValue() <= -32.84826030891604) {
            p = WekaClassifier.N460ab1d91093(i);
        } else if (((Double) i[18]).doubleValue() > -32.84826030891604) {
            p = WekaClassifier.N58e96e4c1097(i);
        }
        return p;
    }
    static double N460ab1d91093(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= -16.186665673070436) {
            p = WekaClassifier.Nd15b5681094(i);
        } else if (((Double) i[1]).doubleValue() > -16.186665673070436) {
            p = 1;
        }
        return p;
    }
    static double Nd15b5681094(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= -23.203009245201876) {
            p = WekaClassifier.Nc0029281095(i);
        } else if (((Double) i[2]).doubleValue() > -23.203009245201876) {
            p = 1;
        }
        return p;
    }
    static double Nc0029281095(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 1;
        } else if (((Double) i[8]).doubleValue() <= -35.01250173371288) {
            p = 1;
        } else if (((Double) i[8]).doubleValue() > -35.01250173371288) {
            p = WekaClassifier.N4bfe9a931096(i);
        }
        return p;
    }
    static double N4bfe9a931096(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= -21.453820203335304) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() > -21.453820203335304) {
            p = 1;
        }
        return p;
    }
    static double N58e96e4c1097(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 1;
        } else if (((Double) i[8]).doubleValue() <= -28.608348705900283) {
            p = 1;
        } else if (((Double) i[8]).doubleValue() > -28.608348705900283) {
            p = 0;
        }
        return p;
    }
    static double N78773ecc1098(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= -26.89148776415933) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() > -26.89148776415933) {
            p = WekaClassifier.N753301831099(i);
        }
        return p;
    }
    static double N753301831099(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -1.9766909486961026) {
            p = WekaClassifier.N4aa637b41100(i);
        } else if (((Double) i[0]).doubleValue() > -1.9766909486961026) {
            p = WekaClassifier.N753c5a921103(i);
        }
        return p;
    }
    static double N4aa637b41100(Object []i) {
        double p = Double.NaN;
        if (i[17] == null) {
            p = 1;
        } else if (((Double) i[17]).doubleValue() <= -30.798571642872414) {
            p = WekaClassifier.N59aeaba21101(i);
        } else if (((Double) i[17]).doubleValue() > -30.798571642872414) {
            p = 1;
        }
        return p;
    }
    static double N59aeaba21101(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -5.087906309988789) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > -5.087906309988789) {
            p = WekaClassifier.N186e6f051102(i);
        }
        return p;
    }
    static double N186e6f051102(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 1;
        } else if (((Double) i[11]).doubleValue() <= -28.58977810911105) {
            p = 1;
        } else if (((Double) i[11]).doubleValue() > -28.58977810911105) {
            p = 0;
        }
        return p;
    }
    static double N753c5a921103(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 1;
        } else if (((Double) i[8]).doubleValue() <= -37.22636159521228) {
            p = 1;
        } else if (((Double) i[8]).doubleValue() > -37.22636159521228) {
            p = WekaClassifier.Ne5cc8161104(i);
        }
        return p;
    }
    static double Ne5cc8161104(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() <= -23.865618194006906) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() > -23.865618194006906) {
            p = WekaClassifier.N220391c41105(i);
        }
        return p;
    }
    static double N220391c41105(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= -1.623502141793871) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() > -1.623502141793871) {
            p = WekaClassifier.N49fec4c61106(i);
        }
        return p;
    }
    static double N49fec4c61106(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 1;
        } else if (((Double) i[11]).doubleValue() <= -26.48280111020028) {
            p = 1;
        } else if (((Double) i[11]).doubleValue() > -26.48280111020028) {
            p = 0;
        }
        return p;
    }
    static double N5e01ffa11107(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() <= -29.230345737976368) {
            p = WekaClassifier.N3675800f1108(i);
        } else if (((Double) i[10]).doubleValue() > -29.230345737976368) {
            p = WekaClassifier.N7834c7731115(i);
        }
        return p;
    }
    static double N3675800f1108(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= -23.783142749488686) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() > -23.783142749488686) {
            p = WekaClassifier.N8c6aab41109(i);
        }
        return p;
    }
    static double N8c6aab41109(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= -22.584333433518214) {
            p = WekaClassifier.N3721979e1110(i);
        } else if (((Double) i[2]).doubleValue() > -22.584333433518214) {
            p = WekaClassifier.N7c630b1a1112(i);
        }
        return p;
    }
    static double N3721979e1110(Object []i) {
        double p = Double.NaN;
        if (i[18] == null) {
            p = 1;
        } else if (((Double) i[18]).doubleValue() <= -35.28475711578607) {
            p = 1;
        } else if (((Double) i[18]).doubleValue() > -35.28475711578607) {
            p = WekaClassifier.N660c8a2c1111(i);
        }
        return p;
    }
    static double N660c8a2c1111(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 0;
        } else if (((Double) i[9]).doubleValue() <= -29.0448471834239) {
            p = 0;
        } else if (((Double) i[9]).doubleValue() > -29.0448471834239) {
            p = 1;
        }
        return p;
    }
    static double N7c630b1a1112(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= -30.98069006799551) {
            p = WekaClassifier.N414d9d281113(i);
        } else if (((Double) i[4]).doubleValue() > -30.98069006799551) {
            p = 0;
        }
        return p;
    }
    static double N414d9d281113(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() <= -21.009124033747202) {
            p = WekaClassifier.N7a6b7ff81114(i);
        } else if (((Double) i[3]).doubleValue() > -21.009124033747202) {
            p = 1;
        }
        return p;
    }
    static double N7a6b7ff81114(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 1;
        } else if (((Double) i[14]).doubleValue() <= -40.15055664322642) {
            p = 1;
        } else if (((Double) i[14]).doubleValue() > -40.15055664322642) {
            p = 0;
        }
        return p;
    }
    static double N7834c7731115(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 0;
        } else if (((Double) i[11]).doubleValue() <= -30.04375618198752) {
            p = WekaClassifier.N1c6b28b41116(i);
        } else if (((Double) i[11]).doubleValue() > -30.04375618198752) {
            p = 1;
        }
        return p;
    }
    static double N1c6b28b41116(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 0;
        } else if (((Double) i[14]).doubleValue() <= -28.721763925844453) {
            p = WekaClassifier.N316252cc1117(i);
        } else if (((Double) i[14]).doubleValue() > -28.721763925844453) {
            p = 1;
        }
        return p;
    }
    static double N316252cc1117(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 1;
        } else if (((Double) i[12]).doubleValue() <= -40.26163443827334) {
            p = 1;
        } else if (((Double) i[12]).doubleValue() > -40.26163443827334) {
            p = 0;
        }
        return p;
    }
    static double N10d76fa71118(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -1.7205639493815852) {
            p = WekaClassifier.N4e062d911119(i);
        } else if (((Double) i[0]).doubleValue() > -1.7205639493815852) {
            p = 1;
        }
        return p;
    }
    static double N4e062d911119(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 1;
        } else if (((Double) i[14]).doubleValue() <= -33.60013328455659) {
            p = WekaClassifier.Nb6d826d1120(i);
        } else if (((Double) i[14]).doubleValue() > -33.60013328455659) {
            p = WekaClassifier.N1bb7f9581124(i);
        }
        return p;
    }
    static double Nb6d826d1120(Object []i) {
        double p = Double.NaN;
        if (i[15] == null) {
            p = 1;
        } else if (((Double) i[15]).doubleValue() <= -30.635683559329976) {
            p = WekaClassifier.N283a45fe1121(i);
        } else if (((Double) i[15]).doubleValue() > -30.635683559329976) {
            p = 0;
        }
        return p;
    }
    static double N283a45fe1121(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() <= -29.830824190805565) {
            p = WekaClassifier.N3bbad091122(i);
        } else if (((Double) i[10]).doubleValue() > -29.830824190805565) {
            p = 0;
        }
        return p;
    }
    static double N3bbad091122(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= -20.005529607486793) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() > -20.005529607486793) {
            p = WekaClassifier.N7cae724a1123(i);
        }
        return p;
    }
    static double N7cae724a1123(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 0;
        } else if (((Double) i[5]).doubleValue() <= -30.556239980562328) {
            p = 0;
        } else if (((Double) i[5]).doubleValue() > -30.556239980562328) {
            p = 1;
        }
        return p;
    }
    static double N1bb7f9581124(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= -19.33498811569149) {
            p = WekaClassifier.N61d84a651125(i);
        } else if (((Double) i[4]).doubleValue() > -19.33498811569149) {
            p = 1;
        }
        return p;
    }
    static double N61d84a651125(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= -29.220681142721084) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() > -29.220681142721084) {
            p = 0;
        }
        return p;
    }
    static double N3f5560b21126(Object []i) {
        double p = Double.NaN;
        if (i[19] == null) {
            p = 1;
        } else if (((Double) i[19]).doubleValue() <= -53.46871285360183) {
            p = WekaClassifier.N30e669301127(i);
        } else if (((Double) i[19]).doubleValue() > -53.46871285360183) {
            p = 1;
        }
        return p;
    }
    static double N30e669301127(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= -19.90841112589273) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() > -19.90841112589273) {
            p = 0;
        }
        return p;
    }
    static double N14bf2b4d1128(Object []i) {
        double p = Double.NaN;
        if (i[15] == null) {
            p = 1;
        } else if (((Double) i[15]).doubleValue() <= -33.493214902736256) {
            p = WekaClassifier.N3717c0dd1129(i);
        } else if (((Double) i[15]).doubleValue() > -33.493214902736256) {
            p = 1;
        }
        return p;
    }
    static double N3717c0dd1129(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= -30.78223792885023) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() > -30.78223792885023) {
            p = WekaClassifier.N2353667d1130(i);
        }
        return p;
    }
    static double N2353667d1130(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= -27.164569296684224) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() > -27.164569296684224) {
            p = WekaClassifier.N20ff24ce1131(i);
        }
        return p;
    }
    static double N20ff24ce1131(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= -23.003735297783575) {
            p = WekaClassifier.N4df786df1132(i);
        } else if (((Double) i[1]).doubleValue() > -23.003735297783575) {
            p = WekaClassifier.N446fa6941133(i);
        }
        return p;
    }
    static double N4df786df1132(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() <= -19.462448797102027) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() > -19.462448797102027) {
            p = 1;
        }
        return p;
    }
    static double N446fa6941133(Object []i) {
        double p = Double.NaN;
        if (i[13] == null) {
            p = 1;
        } else if (((Double) i[13]).doubleValue() <= -34.16930674637112) {
            p = 1;
        } else if (((Double) i[13]).doubleValue() > -34.16930674637112) {
            p = WekaClassifier.N7cb740ea1134(i);
        }
        return p;
    }
    static double N7cb740ea1134(Object []i) {
        double p = Double.NaN;
        if (i[15] == null) {
            p = 1;
        } else if (((Double) i[15]).doubleValue() <= -35.11604798239064) {
            p = WekaClassifier.N25b7d2e61135(i);
        } else if (((Double) i[15]).doubleValue() > -35.11604798239064) {
            p = 0;
        }
        return p;
    }
    static double N25b7d2e61135(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 1;
        } else if (((Double) i[12]).doubleValue() <= -38.77977008408985) {
            p = WekaClassifier.N540769f11136(i);
        } else if (((Double) i[12]).doubleValue() > -38.77977008408985) {
            p = 1;
        }
        return p;
    }
    static double N540769f11136(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= -20.31359461260604) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() > -20.31359461260604) {
            p = 0;
        }
        return p;
    }
    static double N6d653ee31137(Object []i) {
        double p = Double.NaN;
        if (i[17] == null) {
            p = 1;
        } else if (((Double) i[17]).doubleValue() <= -30.29908144889737) {
            p = WekaClassifier.N2b9393b51138(i);
        } else if (((Double) i[17]).doubleValue() > -30.29908144889737) {
            p = 1;
        }
        return p;
    }
    static double N2b9393b51138(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() <= -22.697430750777304) {
            p = WekaClassifier.N302854c31139(i);
        } else if (((Double) i[10]).doubleValue() > -22.697430750777304) {
            p = WekaClassifier.N58bbabcc1197(i);
        }
        return p;
    }
    static double N302854c31139(Object []i) {
        double p = Double.NaN;
        if (i[13] == null) {
            p = 1;
        } else if (((Double) i[13]).doubleValue() <= -27.002698116576997) {
            p = WekaClassifier.N5f0febd61140(i);
        } else if (((Double) i[13]).doubleValue() > -27.002698116576997) {
            p = WekaClassifier.N606c722f1190(i);
        }
        return p;
    }
    static double N5f0febd61140(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= -21.96476410667934) {
            p = WekaClassifier.N1bd944f21141(i);
        } else if (((Double) i[5]).doubleValue() > -21.96476410667934) {
            p = 1;
        }
        return p;
    }
    static double N1bd944f21141(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -2.2131664496360415) {
            p = WekaClassifier.N2c6062071142(i);
        } else if (((Double) i[0]).doubleValue() > -2.2131664496360415) {
            p = WekaClassifier.N3cb626bf1173(i);
        }
        return p;
    }
    static double N2c6062071142(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= -25.13949248209036) {
            p = WekaClassifier.N5e1ca5041143(i);
        } else if (((Double) i[2]).doubleValue() > -25.13949248209036) {
            p = WekaClassifier.N667a7c8d1164(i);
        }
        return p;
    }
    static double N5e1ca5041143(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 1;
        } else if (((Double) i[11]).doubleValue() <= -34.71525656124501) {
            p = WekaClassifier.N7eedb44a1144(i);
        } else if (((Double) i[11]).doubleValue() > -34.71525656124501) {
            p = WekaClassifier.N3ce1f0121158(i);
        }
        return p;
    }
    static double N7eedb44a1144(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= -28.58175433613745) {
            p = WekaClassifier.N2f4291b11145(i);
        } else if (((Double) i[5]).doubleValue() > -28.58175433613745) {
            p = WekaClassifier.N876e27e1152(i);
        }
        return p;
    }
    static double N2f4291b11145(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= -13.884520893550537) {
            p = WekaClassifier.N1dbe041146(i);
        } else if (((Double) i[1]).doubleValue() > -13.884520893550537) {
            p = WekaClassifier.N7eba01061150(i);
        }
        return p;
    }
    static double N1dbe041146(Object []i) {
        double p = Double.NaN;
        if (i[18] == null) {
            p = 1;
        } else if (((Double) i[18]).doubleValue() <= -32.465606704206465) {
            p = WekaClassifier.N3b120f861147(i);
        } else if (((Double) i[18]).doubleValue() > -32.465606704206465) {
            p = WekaClassifier.N13ba70eb1149(i);
        }
        return p;
    }
    static double N3b120f861147(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() <= -27.88169488751193) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() > -27.88169488751193) {
            p = WekaClassifier.N284ea34a1148(i);
        }
        return p;
    }
    static double N284ea34a1148(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 0;
        } else if (((Double) i[12]).doubleValue() <= -43.917811324097144) {
            p = 0;
        } else if (((Double) i[12]).doubleValue() > -43.917811324097144) {
            p = 1;
        }
        return p;
    }
    static double N13ba70eb1149(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 0;
        } else if (((Double) i[14]).doubleValue() <= -34.8669758949617) {
            p = 0;
        } else if (((Double) i[14]).doubleValue() > -34.8669758949617) {
            p = 1;
        }
        return p;
    }
    static double N7eba01061150(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -7.603443080463222) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > -7.603443080463222) {
            p = WekaClassifier.N557f4f681151(i);
        }
        return p;
    }
    static double N557f4f681151(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() <= -28.329823057226232) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() > -28.329823057226232) {
            p = 1;
        }
        return p;
    }
    static double N876e27e1152(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= -27.940042296852365) {
            p = WekaClassifier.N488bf6b31153(i);
        } else if (((Double) i[4]).doubleValue() > -27.940042296852365) {
            p = WekaClassifier.N61cf4b7a1157(i);
        }
        return p;
    }
    static double N488bf6b31153(Object []i) {
        double p = Double.NaN;
        if (i[17] == null) {
            p = 0;
        } else if (((Double) i[17]).doubleValue() <= -41.435964390072364) {
            p = 0;
        } else if (((Double) i[17]).doubleValue() > -41.435964390072364) {
            p = WekaClassifier.N66176c951154(i);
        }
        return p;
    }
    static double N66176c951154(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= -43.94723265257507) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() > -43.94723265257507) {
            p = WekaClassifier.N49bc7b301155(i);
        }
        return p;
    }
    static double N49bc7b301155(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() <= -26.64183129525407) {
            p = WekaClassifier.N7666056b1156(i);
        } else if (((Double) i[6]).doubleValue() > -26.64183129525407) {
            p = 1;
        }
        return p;
    }
    static double N7666056b1156(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= -28.103703016842488) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() > -28.103703016842488) {
            p = 0;
        }
        return p;
    }
    static double N61cf4b7a1157(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= -7.672583822932758) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() > -7.672583822932758) {
            p = 1;
        }
        return p;
    }
    static double N3ce1f0121158(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 1;
        } else if (((Double) i[14]).doubleValue() <= -29.645694553383287) {
            p = WekaClassifier.N162e69451159(i);
        } else if (((Double) i[14]).doubleValue() > -29.645694553383287) {
            p = WekaClassifier.N787866541162(i);
        }
        return p;
    }
    static double N162e69451159(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() <= -29.678754900267386) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() > -29.678754900267386) {
            p = WekaClassifier.N50a56bb61160(i);
        }
        return p;
    }
    static double N50a56bb61160(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= -4.179636443851713) {
            p = WekaClassifier.N4b2a6e431161(i);
        } else if (((Double) i[0]).doubleValue() > -4.179636443851713) {
            p = 1;
        }
        return p;
    }
    static double N4b2a6e431161(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -8.428282713243256) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > -8.428282713243256) {
            p = 0;
        }
        return p;
    }
    static double N787866541162(Object []i) {
        double p = Double.NaN;
        if (i[16] == null) {
            p = 1;
        } else if (((Double) i[16]).doubleValue() <= -31.989167653179223) {
            p = 1;
        } else if (((Double) i[16]).doubleValue() > -31.989167653179223) {
            p = WekaClassifier.N1df94c5f1163(i);
        }
        return p;
    }
    static double N1df94c5f1163(Object []i) {
        double p = Double.NaN;
        if (i[15] == null) {
            p = 0;
        } else if (((Double) i[15]).doubleValue() <= -35.31939691629239) {
            p = 0;
        } else if (((Double) i[15]).doubleValue() > -35.31939691629239) {
            p = 1;
        }
        return p;
    }
    static double N667a7c8d1164(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -4.425280440657524) {
            p = WekaClassifier.N7e3a4e771165(i);
        } else if (((Double) i[0]).doubleValue() > -4.425280440657524) {
            p = WekaClassifier.N1207fa701167(i);
        }
        return p;
    }
    static double N7e3a4e771165(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= -23.805632616995936) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() > -23.805632616995936) {
            p = WekaClassifier.N45cbdd221166(i);
        }
        return p;
    }
    static double N45cbdd221166(Object []i) {
        double p = Double.NaN;
        if (i[19] == null) {
            p = 0;
        } else if (((Double) i[19]).doubleValue() <= -39.99072690401992) {
            p = 0;
        } else if (((Double) i[19]).doubleValue() > -39.99072690401992) {
            p = 1;
        }
        return p;
    }
    static double N1207fa701167(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= -16.8852421966278) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() > -16.8852421966278) {
            p = WekaClassifier.N27ac72a91168(i);
        }
        return p;
    }
    static double N27ac72a91168(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 0;
        } else if (((Double) i[9]).doubleValue() <= -44.25797934529209) {
            p = 0;
        } else if (((Double) i[9]).doubleValue() > -44.25797934529209) {
            p = WekaClassifier.Nbc9c9dd1169(i);
        }
        return p;
    }
    static double Nbc9c9dd1169(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() <= -30.269159538818) {
            p = WekaClassifier.N10f0274b1170(i);
        } else if (((Double) i[6]).doubleValue() > -30.269159538818) {
            p = 1;
        }
        return p;
    }
    static double N10f0274b1170(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 0;
        } else if (((Double) i[7]).doubleValue() <= -32.35821436692787) {
            p = WekaClassifier.N3d098b5f1171(i);
        } else if (((Double) i[7]).doubleValue() > -32.35821436692787) {
            p = 1;
        }
        return p;
    }
    static double N3d098b5f1171(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() <= -25.5231581401611) {
            p = WekaClassifier.N79748f6d1172(i);
        } else if (((Double) i[3]).doubleValue() > -25.5231581401611) {
            p = 0;
        }
        return p;
    }
    static double N79748f6d1172(Object []i) {
        double p = Double.NaN;
        if (i[19] == null) {
            p = 1;
        } else if (((Double) i[19]).doubleValue() <= -38.428811443660074) {
            p = 1;
        } else if (((Double) i[19]).doubleValue() > -38.428811443660074) {
            p = 0;
        }
        return p;
    }
    static double N3cb626bf1173(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= -18.181924434551206) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() > -18.181924434551206) {
            p = WekaClassifier.N2ded941d1174(i);
        }
        return p;
    }
    static double N2ded941d1174(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 1;
        } else if (((Double) i[6]).doubleValue() <= -34.359149802273464) {
            p = WekaClassifier.N5ccfa18c1175(i);
        } else if (((Double) i[6]).doubleValue() > -34.359149802273464) {
            p = WekaClassifier.N5dd952411184(i);
        }
        return p;
    }
    static double N5ccfa18c1175(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= -34.13060252873702) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() > -34.13060252873702) {
            p = WekaClassifier.N11d529f1176(i);
        }
        return p;
    }
    static double N11d529f1176(Object []i) {
        double p = Double.NaN;
        if (i[16] == null) {
            p = 1;
        } else if (((Double) i[16]).doubleValue() <= -35.16713204764834) {
            p = WekaClassifier.Nc130fdd1177(i);
        } else if (((Double) i[16]).doubleValue() > -35.16713204764834) {
            p = 1;
        }
        return p;
    }
    static double Nc130fdd1177(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= -31.153118446448218) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() > -31.153118446448218) {
            p = WekaClassifier.N4d9f2f3e1178(i);
        }
        return p;
    }
    static double N4d9f2f3e1178(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= -29.305920992558896) {
            p = WekaClassifier.N6cfd24c01179(i);
        } else if (((Double) i[4]).doubleValue() > -29.305920992558896) {
            p = WekaClassifier.N27b4ab3e1182(i);
        }
        return p;
    }
    static double N6cfd24c01179(Object []i) {
        double p = Double.NaN;
        if (i[18] == null) {
            p = 0;
        } else if (((Double) i[18]).doubleValue() <= -30.961099739078744) {
            p = WekaClassifier.N79f1a6a1180(i);
        } else if (((Double) i[18]).doubleValue() > -30.961099739078744) {
            p = 1;
        }
        return p;
    }
    static double N79f1a6a1180(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 0;
        } else if (((Double) i[12]).doubleValue() <= -30.649355211390816) {
            p = WekaClassifier.N13e690a31181(i);
        } else if (((Double) i[12]).doubleValue() > -30.649355211390816) {
            p = 1;
        }
        return p;
    }
    static double N13e690a31181(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 1;
        } else if (((Double) i[6]).doubleValue() <= -51.748901919571416) {
            p = 1;
        } else if (((Double) i[6]).doubleValue() > -51.748901919571416) {
            p = 0;
        }
        return p;
    }
    static double N27b4ab3e1182(Object []i) {
        double p = Double.NaN;
        if (i[15] == null) {
            p = 0;
        } else if (((Double) i[15]).doubleValue() <= -38.61370263196473) {
            p = WekaClassifier.N226a402c1183(i);
        } else if (((Double) i[15]).doubleValue() > -38.61370263196473) {
            p = 1;
        }
        return p;
    }
    static double N226a402c1183(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -0.9310090409680569) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > -0.9310090409680569) {
            p = 0;
        }
        return p;
    }
    static double N5dd952411184(Object []i) {
        double p = Double.NaN;
        if (i[13] == null) {
            p = 1;
        } else if (((Double) i[13]).doubleValue() <= -28.983897201681636) {
            p = WekaClassifier.N7a9db2d11185(i);
        } else if (((Double) i[13]).doubleValue() > -28.983897201681636) {
            p = 1;
        }
        return p;
    }
    static double N7a9db2d11185(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() <= -27.825107915641834) {
            p = WekaClassifier.N78720be71186(i);
        } else if (((Double) i[7]).doubleValue() > -27.825107915641834) {
            p = 1;
        }
        return p;
    }
    static double N78720be71186(Object []i) {
        double p = Double.NaN;
        if (i[16] == null) {
            p = 1;
        } else if (((Double) i[16]).doubleValue() <= -31.000919972046987) {
            p = WekaClassifier.N8e94fe51187(i);
        } else if (((Double) i[16]).doubleValue() > -31.000919972046987) {
            p = WekaClassifier.N8a97dee1189(i);
        }
        return p;
    }
    static double N8e94fe51187(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 1;
        } else if (((Double) i[12]).doubleValue() <= -40.93815499280825) {
            p = WekaClassifier.N1f354fe31188(i);
        } else if (((Double) i[12]).doubleValue() > -40.93815499280825) {
            p = 1;
        }
        return p;
    }
    static double N1f354fe31188(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -0.45031674202238037) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > -0.45031674202238037) {
            p = 0;
        }
        return p;
    }
    static double N8a97dee1189(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= -13.25744273363626) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() > -13.25744273363626) {
            p = 1;
        }
        return p;
    }
    static double N606c722f1190(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 1;
        } else if (((Double) i[11]).doubleValue() <= -36.40761385217088) {
            p = WekaClassifier.N22388fa01191(i);
        } else if (((Double) i[11]).doubleValue() > -36.40761385217088) {
            p = 1;
        }
        return p;
    }
    static double N22388fa01191(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 1;
        } else if (((Double) i[12]).doubleValue() <= -38.312079361968586) {
            p = WekaClassifier.N17c786531192(i);
        } else if (((Double) i[12]).doubleValue() > -38.312079361968586) {
            p = WekaClassifier.N57bc22e51194(i);
        }
        return p;
    }
    static double N17c786531192(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() <= -31.99260513955768) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() > -31.99260513955768) {
            p = WekaClassifier.N5442cf481193(i);
        }
        return p;
    }
    static double N5442cf481193(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= -13.235430967255972) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() > -13.235430967255972) {
            p = 1;
        }
        return p;
    }
    static double N57bc22e51194(Object []i) {
        double p = Double.NaN;
        if (i[17] == null) {
            p = 1;
        } else if (((Double) i[17]).doubleValue() <= -36.606413428487954) {
            p = 1;
        } else if (((Double) i[17]).doubleValue() > -36.606413428487954) {
            p = WekaClassifier.N319ff23d1195(i);
        }
        return p;
    }
    static double N319ff23d1195(Object []i) {
        double p = Double.NaN;
        if (i[17] == null) {
            p = 0;
        } else if (((Double) i[17]).doubleValue() <= -36.13731393288046) {
            p = 0;
        } else if (((Double) i[17]).doubleValue() > -36.13731393288046) {
            p = WekaClassifier.N1a410f431196(i);
        }
        return p;
    }
    static double N1a410f431196(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= -46.03627732898292) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() > -46.03627732898292) {
            p = 1;
        }
        return p;
    }
    static double N58bbabcc1197(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 0;
        } else if (((Double) i[11]).doubleValue() <= -29.63642374938492) {
            p = WekaClassifier.N6e2601341198(i);
        } else if (((Double) i[11]).doubleValue() > -29.63642374938492) {
            p = 1;
        }
        return p;
    }
    static double N6e2601341198(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() <= -25.477934892863594) {
            p = WekaClassifier.N206618d71199(i);
        } else if (((Double) i[6]).doubleValue() > -25.477934892863594) {
            p = 1;
        }
        return p;
    }
    static double N206618d71199(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= -25.703408742515585) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() > -25.703408742515585) {
            p = 1;
        }
        return p;
    }
    static double N32cf308f1200(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() <= -25.670653822233987) {
            p = WekaClassifier.N37af08d11201(i);
        } else if (((Double) i[4]).doubleValue() > -25.670653822233987) {
            p = WekaClassifier.N4db07bf91221(i);
        }
        return p;
    }
    static double N37af08d11201(Object []i) {
        double p = Double.NaN;
        if (i[17] == null) {
            p = 1;
        } else if (((Double) i[17]).doubleValue() <= -34.20607820303276) {
            p = WekaClassifier.N69de80b11202(i);
        } else if (((Double) i[17]).doubleValue() > -34.20607820303276) {
            p = 1;
        }
        return p;
    }
    static double N69de80b11202(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= -23.680239798957526) {
            p = WekaClassifier.N796e8dfd1203(i);
        } else if (((Double) i[3]).doubleValue() > -23.680239798957526) {
            p = WekaClassifier.N112003451209(i);
        }
        return p;
    }
    static double N796e8dfd1203(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -3.687134378582101) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > -3.687134378582101) {
            p = WekaClassifier.N32ee81171204(i);
        }
        return p;
    }
    static double N32ee81171204(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= -30.94391831025689) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() > -30.94391831025689) {
            p = WekaClassifier.N7d48fe1b1205(i);
        }
        return p;
    }
    static double N7d48fe1b1205(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= -17.89443608684622) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() > -17.89443608684622) {
            p = WekaClassifier.N600e320b1206(i);
        }
        return p;
    }
    static double N600e320b1206(Object []i) {
        double p = Double.NaN;
        if (i[16] == null) {
            p = 0;
        } else if (((Double) i[16]).doubleValue() <= -30.327692257941756) {
            p = WekaClassifier.N6d025a921207(i);
        } else if (((Double) i[16]).doubleValue() > -30.327692257941756) {
            p = 1;
        }
        return p;
    }
    static double N6d025a921207(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() <= -25.600521017195852) {
            p = WekaClassifier.N2b22881c1208(i);
        } else if (((Double) i[7]).doubleValue() > -25.600521017195852) {
            p = 0;
        }
        return p;
    }
    static double N2b22881c1208(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= -25.862872532060795) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() > -25.862872532060795) {
            p = 0;
        }
        return p;
    }
    static double N112003451209(Object []i) {
        double p = Double.NaN;
        if (i[13] == null) {
            p = 0;
        } else if (((Double) i[13]).doubleValue() <= -28.950810710569577) {
            p = WekaClassifier.Naff5001210(i);
        } else if (((Double) i[13]).doubleValue() > -28.950810710569577) {
            p = 1;
        }
        return p;
    }
    static double Naff5001210(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() <= -16.927197742396984) {
            p = WekaClassifier.N7f06e94d1211(i);
        } else if (((Double) i[3]).doubleValue() > -16.927197742396984) {
            p = 1;
        }
        return p;
    }
    static double N7f06e94d1211(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 1;
        } else if (((Double) i[14]).doubleValue() <= -50.966172475877485) {
            p = 1;
        } else if (((Double) i[14]).doubleValue() > -50.966172475877485) {
            p = WekaClassifier.N40dbecd91212(i);
        }
        return p;
    }
    static double N40dbecd91212(Object []i) {
        double p = Double.NaN;
        if (i[19] == null) {
            p = 0;
        } else if (((Double) i[19]).doubleValue() <= -27.825222994402516) {
            p = WekaClassifier.N51f0e5ac1213(i);
        } else if (((Double) i[19]).doubleValue() > -27.825222994402516) {
            p = 1;
        }
        return p;
    }
    static double N51f0e5ac1213(Object []i) {
        double p = Double.NaN;
        if (i[15] == null) {
            p = 0;
        } else if (((Double) i[15]).doubleValue() <= -39.88873229872074) {
            p = WekaClassifier.N2e880d671214(i);
        } else if (((Double) i[15]).doubleValue() > -39.88873229872074) {
            p = WekaClassifier.N41a8d4fc1218(i);
        }
        return p;
    }
    static double N2e880d671214(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() <= -29.003430824642976) {
            p = WekaClassifier.N668cd57a1215(i);
        } else if (((Double) i[10]).doubleValue() > -29.003430824642976) {
            p = WekaClassifier.N2fa5175a1217(i);
        }
        return p;
    }
    static double N668cd57a1215(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 0;
        } else if (((Double) i[5]).doubleValue() <= -29.460161879331757) {
            p = WekaClassifier.N792e50561216(i);
        } else if (((Double) i[5]).doubleValue() > -29.460161879331757) {
            p = 0;
        }
        return p;
    }
    static double N792e50561216(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= -31.953741960211048) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() > -31.953741960211048) {
            p = 1;
        }
        return p;
    }
    static double N2fa5175a1217(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() <= -24.851996304807585) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() > -24.851996304807585) {
            p = 0;
        }
        return p;
    }
    static double N41a8d4fc1218(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= -28.016161186093264) {
            p = WekaClassifier.N410ffeb61219(i);
        } else if (((Double) i[4]).doubleValue() > -28.016161186093264) {
            p = 1;
        }
        return p;
    }
    static double N410ffeb61219(Object []i) {
        double p = Double.NaN;
        if (i[18] == null) {
            p = 0;
        } else if (((Double) i[18]).doubleValue() <= -31.787997045864365) {
            p = 0;
        } else if (((Double) i[18]).doubleValue() > -31.787997045864365) {
            p = WekaClassifier.N4a28aa211220(i);
        }
        return p;
    }
    static double N4a28aa211220(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 1;
        } else if (((Double) i[6]).doubleValue() <= -28.315639277467564) {
            p = 1;
        } else if (((Double) i[6]).doubleValue() > -28.315639277467564) {
            p = 0;
        }
        return p;
    }
    static double N4db07bf91221(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() <= -38.99173995868513) {
            p = WekaClassifier.N4ab859871222(i);
        } else if (((Double) i[10]).doubleValue() > -38.99173995868513) {
            p = 1;
        }
        return p;
    }
    static double N4ab859871222(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= -32.38245791386704) {
            p = WekaClassifier.N74fcf4281223(i);
        } else if (((Double) i[9]).doubleValue() > -32.38245791386704) {
            p = 1;
        }
        return p;
    }
    static double N74fcf4281223(Object []i) {
        double p = Double.NaN;
        if (i[15] == null) {
            p = 1;
        } else if (((Double) i[15]).doubleValue() <= -27.349197190895516) {
            p = WekaClassifier.N7b8a21341224(i);
        } else if (((Double) i[15]).doubleValue() > -27.349197190895516) {
            p = WekaClassifier.N4b0180c1228(i);
        }
        return p;
    }
    static double N7b8a21341224(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 1;
        } else if (((Double) i[14]).doubleValue() <= -26.120625663764322) {
            p = WekaClassifier.N35abf20f1225(i);
        } else if (((Double) i[14]).doubleValue() > -26.120625663764322) {
            p = WekaClassifier.N2e190f7a1227(i);
        }
        return p;
    }
    static double N35abf20f1225(Object []i) {
        double p = Double.NaN;
        if (i[18] == null) {
            p = 0;
        } else if (((Double) i[18]).doubleValue() <= -50.51009834231191) {
            p = WekaClassifier.N3dd7e15c1226(i);
        } else if (((Double) i[18]).doubleValue() > -50.51009834231191) {
            p = 1;
        }
        return p;
    }
    static double N3dd7e15c1226(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() <= -32.455756660750914) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() > -32.455756660750914) {
            p = 1;
        }
        return p;
    }
    static double N2e190f7a1227(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= -17.466068643792426) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() > -17.466068643792426) {
            p = 1;
        }
        return p;
    }
    static double N4b0180c1228(Object []i) {
        double p = Double.NaN;
        if (i[17] == null) {
            p = 0;
        } else if (((Double) i[17]).doubleValue() <= -26.935395637529737) {
            p = 0;
        } else if (((Double) i[17]).doubleValue() > -26.935395637529737) {
            p = 1;
        }
        return p;
    }
    static double N6ee1b91f1229(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= -10.674710035130474) {
            p = WekaClassifier.N6cbe789e1230(i);
        } else if (((Double) i[1]).doubleValue() > -10.674710035130474) {
            p = WekaClassifier.N79444b1e1310(i);
        }
        return p;
    }
    static double N6cbe789e1230(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= -24.06686223064949) {
            p = WekaClassifier.Nabac8ac1231(i);
        } else if (((Double) i[3]).doubleValue() > -24.06686223064949) {
            p = WekaClassifier.N34f6b32d1262(i);
        }
        return p;
    }
    static double Nabac8ac1231(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 1;
        } else if (((Double) i[8]).doubleValue() <= -30.65627233958605) {
            p = WekaClassifier.Necec18f1232(i);
        } else if (((Double) i[8]).doubleValue() > -30.65627233958605) {
            p = WekaClassifier.N42a1dbb51245(i);
        }
        return p;
    }
    static double Necec18f1232(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 1;
        } else if (((Double) i[12]).doubleValue() <= -35.06452635457019) {
            p = WekaClassifier.N6d04a8081233(i);
        } else if (((Double) i[12]).doubleValue() > -35.06452635457019) {
            p = WekaClassifier.N567870081236(i);
        }
        return p;
    }
    static double N6d04a8081233(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() <= -24.09690102608038) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() > -24.09690102608038) {
            p = WekaClassifier.N72e147be1234(i);
        }
        return p;
    }
    static double N72e147be1234(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() <= -40.64991463910454) {
            p = WekaClassifier.N2ec21ee61235(i);
        } else if (((Double) i[10]).doubleValue() > -40.64991463910454) {
            p = 1;
        }
        return p;
    }
    static double N2ec21ee61235(Object []i) {
        double p = Double.NaN;
        if (i[17] == null) {
            p = 1;
        } else if (((Double) i[17]).doubleValue() <= -34.88618020349503) {
            p = 1;
        } else if (((Double) i[17]).doubleValue() > -34.88618020349503) {
            p = 0;
        }
        return p;
    }
    static double N567870081236(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 1;
        } else if (((Double) i[11]).doubleValue() <= -30.793216116265942) {
            p = WekaClassifier.N1ef4c6271237(i);
        } else if (((Double) i[11]).doubleValue() > -30.793216116265942) {
            p = 1;
        }
        return p;
    }
    static double N1ef4c6271237(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() <= -26.75393922578416) {
            p = WekaClassifier.N6650aef01238(i);
        } else if (((Double) i[10]).doubleValue() > -26.75393922578416) {
            p = WekaClassifier.N754b48ae1241(i);
        }
        return p;
    }
    static double N6650aef01238(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= -11.697901645619638) {
            p = WekaClassifier.N58dbb9f21239(i);
        } else if (((Double) i[1]).doubleValue() > -11.697901645619638) {
            p = 1;
        }
        return p;
    }
    static double N58dbb9f21239(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -7.21849422815346) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > -7.21849422815346) {
            p = WekaClassifier.N4d366ad11240(i);
        }
        return p;
    }
    static double N4d366ad11240(Object []i) {
        double p = Double.NaN;
        if (i[13] == null) {
            p = 0;
        } else if (((Double) i[13]).doubleValue() <= -50.2237525024406) {
            p = 0;
        } else if (((Double) i[13]).doubleValue() > -50.2237525024406) {
            p = 1;
        }
        return p;
    }
    static double N754b48ae1241(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 1;
        } else if (((Double) i[12]).doubleValue() <= -31.32912839884493) {
            p = 1;
        } else if (((Double) i[12]).doubleValue() > -31.32912839884493) {
            p = WekaClassifier.N168f4fd91242(i);
        }
        return p;
    }
    static double N168f4fd91242(Object []i) {
        double p = Double.NaN;
        if (i[15] == null) {
            p = 0;
        } else if (((Double) i[15]).doubleValue() <= -29.887277087945847) {
            p = WekaClassifier.N139e60d31243(i);
        } else if (((Double) i[15]).doubleValue() > -29.887277087945847) {
            p = 1;
        }
        return p;
    }
    static double N139e60d31243(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= -26.886901352508183) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() > -26.886901352508183) {
            p = WekaClassifier.N6d80f0931244(i);
        }
        return p;
    }
    static double N6d80f0931244(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= -11.68143367887766) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() > -11.68143367887766) {
            p = 1;
        }
        return p;
    }
    static double N42a1dbb51245(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() <= -34.35622822496929) {
            p = WekaClassifier.N2ebcb5bf1246(i);
        } else if (((Double) i[4]).doubleValue() > -34.35622822496929) {
            p = WekaClassifier.N25ddd9171258(i);
        }
        return p;
    }
    static double N2ebcb5bf1246(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= -33.645381303116906) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() > -33.645381303116906) {
            p = WekaClassifier.N4e44d0431247(i);
        }
        return p;
    }
    static double N4e44d0431247(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() <= -38.5742840890108) {
            p = WekaClassifier.N24aab5701248(i);
        } else if (((Double) i[10]).doubleValue() > -38.5742840890108) {
            p = WekaClassifier.N23d2539b1254(i);
        }
        return p;
    }
    static double N24aab5701248(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() <= -39.41333768542531) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() > -39.41333768542531) {
            p = WekaClassifier.N681aae231249(i);
        }
        return p;
    }
    static double N681aae231249(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() <= -32.35622567272611) {
            p = WekaClassifier.N23c0ffd21250(i);
        } else if (((Double) i[6]).doubleValue() > -32.35622567272611) {
            p = 1;
        }
        return p;
    }
    static double N23c0ffd21250(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 1;
        } else if (((Double) i[12]).doubleValue() <= -48.267091572088844) {
            p = 1;
        } else if (((Double) i[12]).doubleValue() > -48.267091572088844) {
            p = WekaClassifier.N4b6ee5211251(i);
        }
        return p;
    }
    static double N4b6ee5211251(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 0;
        } else if (((Double) i[11]).doubleValue() <= -29.26368555777951) {
            p = WekaClassifier.N3a9ec8091252(i);
        } else if (((Double) i[11]).doubleValue() > -29.26368555777951) {
            p = 1;
        }
        return p;
    }
    static double N3a9ec8091252(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 0;
        } else if (((Double) i[9]).doubleValue() <= -32.48679050924217) {
            p = 0;
        } else if (((Double) i[9]).doubleValue() > -32.48679050924217) {
            p = WekaClassifier.N74812cf1253(i);
        }
        return p;
    }
    static double N74812cf1253(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -2.183662049447477) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > -2.183662049447477) {
            p = 0;
        }
        return p;
    }
    static double N23d2539b1254(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -0.38411603390763815) {
            p = WekaClassifier.N1f29fd2d1255(i);
        } else if (((Double) i[0]).doubleValue() > -0.38411603390763815) {
            p = 0;
        }
        return p;
    }
    static double N1f29fd2d1255(Object []i) {
        double p = Double.NaN;
        if (i[18] == null) {
            p = 1;
        } else if (((Double) i[18]).doubleValue() <= -41.37846900448539) {
            p = WekaClassifier.N533bb0411256(i);
        } else if (((Double) i[18]).doubleValue() > -41.37846900448539) {
            p = 1;
        }
        return p;
    }
    static double N533bb0411256(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= -10.88241175861171) {
            p = WekaClassifier.N14220e831257(i);
        } else if (((Double) i[1]).doubleValue() > -10.88241175861171) {
            p = 0;
        }
        return p;
    }
    static double N14220e831257(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= -25.71002270833023) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() > -25.71002270833023) {
            p = 0;
        }
        return p;
    }
    static double N25ddd9171258(Object []i) {
        double p = Double.NaN;
        if (i[13] == null) {
            p = 1;
        } else if (((Double) i[13]).doubleValue() <= -24.602413739810906) {
            p = 1;
        } else if (((Double) i[13]).doubleValue() > -24.602413739810906) {
            p = WekaClassifier.N75cd88141259(i);
        }
        return p;
    }
    static double N75cd88141259(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 0;
        } else if (((Double) i[14]).doubleValue() <= -43.87242084949818) {
            p = 0;
        } else if (((Double) i[14]).doubleValue() > -43.87242084949818) {
            p = WekaClassifier.N7bfa97541260(i);
        }
        return p;
    }
    static double N7bfa97541260(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() <= -30.04914733155411) {
            p = WekaClassifier.N7f28d8be1261(i);
        } else if (((Double) i[7]).doubleValue() > -30.04914733155411) {
            p = 1;
        }
        return p;
    }
    static double N7f28d8be1261(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -5.89445615965554) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > -5.89445615965554) {
            p = 0;
        }
        return p;
    }
    static double N34f6b32d1262(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -1.2317994486323514) {
            p = WekaClassifier.N2de2108f1263(i);
        } else if (((Double) i[0]).doubleValue() > -1.2317994486323514) {
            p = WekaClassifier.N1d1cab471304(i);
        }
        return p;
    }
    static double N2de2108f1263(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() <= -22.958678962630827) {
            p = WekaClassifier.N20d72501264(i);
        } else if (((Double) i[10]).doubleValue() > -22.958678962630827) {
            p = 1;
        }
        return p;
    }
    static double N20d72501264(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -7.52116642254942) {
            p = WekaClassifier.N3b59b7871265(i);
        } else if (((Double) i[0]).doubleValue() > -7.52116642254942) {
            p = WekaClassifier.N76c1dab1267(i);
        }
        return p;
    }
    static double N3b59b7871265(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() <= -43.06574735575543) {
            p = WekaClassifier.N3ab7141a1266(i);
        } else if (((Double) i[4]).doubleValue() > -43.06574735575543) {
            p = 1;
        }
        return p;
    }
    static double N3ab7141a1266(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() <= -45.217369972961706) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() > -45.217369972961706) {
            p = 0;
        }
        return p;
    }
    static double N76c1dab1267(Object []i) {
        double p = Double.NaN;
        if (i[16] == null) {
            p = 0;
        } else if (((Double) i[16]).doubleValue() <= -29.844891787413125) {
            p = WekaClassifier.N6e9a60e41268(i);
        } else if (((Double) i[16]).doubleValue() > -29.844891787413125) {
            p = WekaClassifier.N72dfda141302(i);
        }
        return p;
    }
    static double N6e9a60e41268(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= -42.52998355249001) {
            p = WekaClassifier.N1809173f1269(i);
        } else if (((Double) i[4]).doubleValue() > -42.52998355249001) {
            p = WekaClassifier.N7dfa105d1271(i);
        }
        return p;
    }
    static double N1809173f1269(Object []i) {
        double p = Double.NaN;
        if (i[18] == null) {
            p = 1;
        } else if (((Double) i[18]).doubleValue() <= -40.57080076857123) {
            p = WekaClassifier.N1a9cd7e01270(i);
        } else if (((Double) i[18]).doubleValue() > -40.57080076857123) {
            p = 0;
        }
        return p;
    }
    static double N1a9cd7e01270(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= -12.056117098980138) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() > -12.056117098980138) {
            p = 1;
        }
        return p;
    }
    static double N7dfa105d1271(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 0;
        } else if (((Double) i[5]).doubleValue() <= -27.37326692551931) {
            p = WekaClassifier.N405ad2461272(i);
        } else if (((Double) i[5]).doubleValue() > -27.37326692551931) {
            p = WekaClassifier.N682f82301293(i);
        }
        return p;
    }
    static double N405ad2461272(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 1;
        } else if (((Double) i[14]).doubleValue() <= -40.78778675039166) {
            p = WekaClassifier.N103a959d1273(i);
        } else if (((Double) i[14]).doubleValue() > -40.78778675039166) {
            p = WekaClassifier.N1201cc801279(i);
        }
        return p;
    }
    static double N103a959d1273(Object []i) {
        double p = Double.NaN;
        if (i[15] == null) {
            p = 1;
        } else if (((Double) i[15]).doubleValue() <= -33.39761793719548) {
            p = WekaClassifier.N6ce563ad1274(i);
        } else if (((Double) i[15]).doubleValue() > -33.39761793719548) {
            p = WekaClassifier.N133c3d0b1277(i);
        }
        return p;
    }
    static double N6ce563ad1274(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -2.4453640568226405) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > -2.4453640568226405) {
            p = WekaClassifier.N41b0fe941275(i);
        }
        return p;
    }
    static double N41b0fe941275(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= -30.95534436199172) {
            p = WekaClassifier.N576ecc061276(i);
        } else if (((Double) i[4]).doubleValue() > -30.95534436199172) {
            p = 1;
        }
        return p;
    }
    static double N576ecc061276(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= -20.87992402529447) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() > -20.87992402529447) {
            p = 1;
        }
        return p;
    }
    static double N133c3d0b1277(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() <= -32.63795490595682) {
            p = WekaClassifier.N5403ccca1278(i);
        } else if (((Double) i[10]).doubleValue() > -32.63795490595682) {
            p = 1;
        }
        return p;
    }
    static double N5403ccca1278(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= -22.210372346416605) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() > -22.210372346416605) {
            p = 1;
        }
        return p;
    }
    static double N1201cc801279(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 0;
        } else if (((Double) i[12]).doubleValue() <= -32.54515236007052) {
            p = WekaClassifier.N33ae2c3a1280(i);
        } else if (((Double) i[12]).doubleValue() > -32.54515236007052) {
            p = WekaClassifier.N4beddf861288(i);
        }
        return p;
    }
    static double N33ae2c3a1280(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 1;
        } else if (((Double) i[8]).doubleValue() <= -47.78230303860721) {
            p = WekaClassifier.N41889b211281(i);
        } else if (((Double) i[8]).doubleValue() > -47.78230303860721) {
            p = WekaClassifier.Nb277a461282(i);
        }
        return p;
    }
    static double N41889b211281(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= -21.209179685356858) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() > -21.209179685356858) {
            p = 0;
        }
        return p;
    }
    static double Nb277a461282(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() <= -19.228481402163098) {
            p = WekaClassifier.N17ded26e1283(i);
        } else if (((Double) i[3]).doubleValue() > -19.228481402163098) {
            p = WekaClassifier.N16e7d931287(i);
        }
        return p;
    }
    static double N17ded26e1283(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 0;
        } else if (((Double) i[9]).doubleValue() <= -28.196964534598475) {
            p = WekaClassifier.N5553f3531284(i);
        } else if (((Double) i[9]).doubleValue() > -28.196964534598475) {
            p = WekaClassifier.N60429e571286(i);
        }
        return p;
    }
    static double N5553f3531284(Object []i) {
        double p = Double.NaN;
        if (i[19] == null) {
            p = 0;
        } else if (((Double) i[19]).doubleValue() <= -33.61810552748088) {
            p = 0;
        } else if (((Double) i[19]).doubleValue() > -33.61810552748088) {
            p = WekaClassifier.N50872b4b1285(i);
        }
        return p;
    }
    static double N50872b4b1285(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -3.1604916733949793) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > -3.1604916733949793) {
            p = 0;
        }
        return p;
    }
    static double N60429e571286(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 0;
        } else if (((Double) i[5]).doubleValue() <= -33.79944735183594) {
            p = 0;
        } else if (((Double) i[5]).doubleValue() > -33.79944735183594) {
            p = 1;
        }
        return p;
    }
    static double N16e7d931287(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() <= -27.930468418767752) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() > -27.930468418767752) {
            p = 0;
        }
        return p;
    }
    static double N4beddf861288(Object []i) {
        double p = Double.NaN;
        if (i[15] == null) {
            p = 0;
        } else if (((Double) i[15]).doubleValue() <= -47.32510377314014) {
            p = 0;
        } else if (((Double) i[15]).doubleValue() > -47.32510377314014) {
            p = WekaClassifier.N225978c31289(i);
        }
        return p;
    }
    static double N225978c31289(Object []i) {
        double p = Double.NaN;
        if (i[19] == null) {
            p = 0;
        } else if (((Double) i[19]).doubleValue() <= -41.56597881921469) {
            p = WekaClassifier.N569deaf91290(i);
        } else if (((Double) i[19]).doubleValue() > -41.56597881921469) {
            p = WekaClassifier.N246d875c1291(i);
        }
        return p;
    }
    static double N569deaf91290(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 1;
        } else if (((Double) i[6]).doubleValue() <= -32.61939694048136) {
            p = 1;
        } else if (((Double) i[6]).doubleValue() > -32.61939694048136) {
            p = 0;
        }
        return p;
    }
    static double N246d875c1291(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= -5.592918826944228) {
            p = WekaClassifier.N1597db81292(i);
        } else if (((Double) i[0]).doubleValue() > -5.592918826944228) {
            p = 1;
        }
        return p;
    }
    static double N1597db81292(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= -20.968104831237667) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() > -20.968104831237667) {
            p = 0;
        }
        return p;
    }
    static double N682f82301293(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() <= -35.73177526723387) {
            p = WekaClassifier.N515c77ee1294(i);
        } else if (((Double) i[6]).doubleValue() > -35.73177526723387) {
            p = WekaClassifier.N479761861297(i);
        }
        return p;
    }
    static double N515c77ee1294(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= -23.523593492498478) {
            p = WekaClassifier.N19434dfe1295(i);
        } else if (((Double) i[2]).doubleValue() > -23.523593492498478) {
            p = WekaClassifier.N533d47d31296(i);
        }
        return p;
    }
    static double N19434dfe1295(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= -26.24442516389913) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() > -26.24442516389913) {
            p = 0;
        }
        return p;
    }
    static double N533d47d31296(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 0;
        } else if (((Double) i[9]).doubleValue() <= -26.211725353180967) {
            p = 0;
        } else if (((Double) i[9]).doubleValue() > -26.211725353180967) {
            p = 1;
        }
        return p;
    }
    static double N479761861297(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= -20.12260705099237) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() > -20.12260705099237) {
            p = WekaClassifier.N75c68d9d1298(i);
        }
        return p;
    }
    static double N75c68d9d1298(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= -2.317936885075497) {
            p = WekaClassifier.N76e902661299(i);
        } else if (((Double) i[0]).doubleValue() > -2.317936885075497) {
            p = 1;
        }
        return p;
    }
    static double N76e902661299(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= -11.816035144443525) {
            p = WekaClassifier.N4fd3c0b71300(i);
        } else if (((Double) i[1]).doubleValue() > -11.816035144443525) {
            p = WekaClassifier.N33b4139a1301(i);
        }
        return p;
    }
    static double N4fd3c0b71300(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 1;
        } else if (((Double) i[11]).doubleValue() <= -31.955773982140283) {
            p = 1;
        } else if (((Double) i[11]).doubleValue() > -31.955773982140283) {
            p = 0;
        }
        return p;
    }
    static double N33b4139a1301(Object []i) {
        double p = Double.NaN;
        if (i[16] == null) {
            p = 0;
        } else if (((Double) i[16]).doubleValue() <= -42.46529565050847) {
            p = 0;
        } else if (((Double) i[16]).doubleValue() > -42.46529565050847) {
            p = 1;
        }
        return p;
    }
    static double N72dfda141302(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= -18.64704134998371) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() > -18.64704134998371) {
            p = WekaClassifier.N4c9b0c1b1303(i);
        }
        return p;
    }
    static double N4c9b0c1b1303(Object []i) {
        double p = Double.NaN;
        if (i[13] == null) {
            p = 0;
        } else if (((Double) i[13]).doubleValue() <= -30.664480626539916) {
            p = 0;
        } else if (((Double) i[13]).doubleValue() > -30.664480626539916) {
            p = 1;
        }
        return p;
    }
    static double N1d1cab471304(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 1;
        } else if (((Double) i[6]).doubleValue() <= -34.23029205135289) {
            p = WekaClassifier.Nea743bd1305(i);
        } else if (((Double) i[6]).doubleValue() > -34.23029205135289) {
            p = 1;
        }
        return p;
    }
    static double Nea743bd1305(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= -24.92611907735258) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() > -24.92611907735258) {
            p = WekaClassifier.N2a427071306(i);
        }
        return p;
    }
    static double N2a427071306(Object []i) {
        double p = Double.NaN;
        if (i[15] == null) {
            p = 1;
        } else if (((Double) i[15]).doubleValue() <= -30.9063251454778) {
            p = WekaClassifier.N16cb189c1307(i);
        } else if (((Double) i[15]).doubleValue() > -30.9063251454778) {
            p = 1;
        }
        return p;
    }
    static double N16cb189c1307(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 1;
        } else if (((Double) i[8]).doubleValue() <= -33.2934693947499) {
            p = 1;
        } else if (((Double) i[8]).doubleValue() > -33.2934693947499) {
            p = WekaClassifier.N6e75cf911308(i);
        }
        return p;
    }
    static double N6e75cf911308(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 0;
        } else if (((Double) i[5]).doubleValue() <= -24.331746855140366) {
            p = WekaClassifier.N5a7bc3491309(i);
        } else if (((Double) i[5]).doubleValue() > -24.331746855140366) {
            p = 1;
        }
        return p;
    }
    static double N5a7bc3491309(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= -33.677952735232424) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() > -33.677952735232424) {
            p = 0;
        }
        return p;
    }
    static double N79444b1e1310(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() <= -15.960560905788153) {
            p = WekaClassifier.N3705a3521311(i);
        } else if (((Double) i[7]).doubleValue() > -15.960560905788153) {
            p = WekaClassifier.N18608fca1370(i);
        }
        return p;
    }
    static double N3705a3521311(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= -17.299829447172637) {
            p = WekaClassifier.N774cfb641312(i);
        } else if (((Double) i[9]).doubleValue() > -17.299829447172637) {
            p = WekaClassifier.N4f9a3f851368(i);
        }
        return p;
    }
    static double N774cfb641312(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= -6.4277165303622255) {
            p = WekaClassifier.N73a90f4f1313(i);
        } else if (((Double) i[1]).doubleValue() > -6.4277165303622255) {
            p = WekaClassifier.N47b505b11361(i);
        }
        return p;
    }
    static double N73a90f4f1313(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= -20.090099204043582) {
            p = WekaClassifier.N286ea69f1314(i);
        } else if (((Double) i[3]).doubleValue() > -20.090099204043582) {
            p = WekaClassifier.N75e209f51342(i);
        }
        return p;
    }
    static double N286ea69f1314(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= -26.133526800222285) {
            p = WekaClassifier.N32eb9ff31315(i);
        } else if (((Double) i[3]).doubleValue() > -26.133526800222285) {
            p = WekaClassifier.N54ec829c1321(i);
        }
        return p;
    }
    static double N32eb9ff31315(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= -9.796365191068766) {
            p = WekaClassifier.N22ecd5111316(i);
        } else if (((Double) i[1]).doubleValue() > -9.796365191068766) {
            p = 1;
        }
        return p;
    }
    static double N22ecd5111316(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -3.113063865567355) {
            p = WekaClassifier.N190465741317(i);
        } else if (((Double) i[0]).doubleValue() > -3.113063865567355) {
            p = 1;
        }
        return p;
    }
    static double N190465741317(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= -31.04737757806333) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() > -31.04737757806333) {
            p = WekaClassifier.N448372951318(i);
        }
        return p;
    }
    static double N448372951318(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -5.876385299549405) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > -5.876385299549405) {
            p = WekaClassifier.N2af969f11319(i);
        }
        return p;
    }
    static double N2af969f11319(Object []i) {
        double p = Double.NaN;
        if (i[16] == null) {
            p = 1;
        } else if (((Double) i[16]).doubleValue() <= -36.10104968830666) {
            p = 1;
        } else if (((Double) i[16]).doubleValue() > -36.10104968830666) {
            p = WekaClassifier.N6e7975e21320(i);
        }
        return p;
    }
    static double N6e7975e21320(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 0;
        } else if (((Double) i[7]).doubleValue() <= -37.37193327074657) {
            p = 0;
        } else if (((Double) i[7]).doubleValue() > -37.37193327074657) {
            p = 1;
        }
        return p;
    }
    static double N54ec829c1321(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= -9.167958772115014) {
            p = WekaClassifier.Nba4454e1322(i);
        } else if (((Double) i[1]).doubleValue() > -9.167958772115014) {
            p = WekaClassifier.N4cbd8b941340(i);
        }
        return p;
    }
    static double Nba4454e1322(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -1.012254788669658) {
            p = WekaClassifier.N6af3132a1323(i);
        } else if (((Double) i[0]).doubleValue() > -1.012254788669658) {
            p = 1;
        }
        return p;
    }
    static double N6af3132a1323(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -7.849052321714915) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > -7.849052321714915) {
            p = WekaClassifier.N4f00bdf31324(i);
        }
        return p;
    }
    static double N4f00bdf31324(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() <= -30.44882999293556) {
            p = WekaClassifier.N7fc83eed1325(i);
        } else if (((Double) i[4]).doubleValue() > -30.44882999293556) {
            p = WekaClassifier.N6e5277931328(i);
        }
        return p;
    }
    static double N7fc83eed1325(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -5.529271717170488) {
            p = WekaClassifier.N566f9a6f1326(i);
        } else if (((Double) i[0]).doubleValue() > -5.529271717170488) {
            p = 1;
        }
        return p;
    }
    static double N566f9a6f1326(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() <= -33.73657085837689) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() > -33.73657085837689) {
            p = WekaClassifier.N2477a9cb1327(i);
        }
        return p;
    }
    static double N2477a9cb1327(Object []i) {
        double p = Double.NaN;
        if (i[17] == null) {
            p = 0;
        } else if (((Double) i[17]).doubleValue() <= -34.471441474697556) {
            p = 0;
        } else if (((Double) i[17]).doubleValue() > -34.471441474697556) {
            p = 1;
        }
        return p;
    }
    static double N6e5277931328(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 1;
        } else if (((Double) i[8]).doubleValue() <= -35.92321409698233) {
            p = WekaClassifier.N50d313e21329(i);
        } else if (((Double) i[8]).doubleValue() > -35.92321409698233) {
            p = WekaClassifier.N1ef69d171332(i);
        }
        return p;
    }
    static double N50d313e21329(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 1;
        } else if (((Double) i[11]).doubleValue() <= -35.17998628662481) {
            p = 1;
        } else if (((Double) i[11]).doubleValue() > -35.17998628662481) {
            p = WekaClassifier.N7ac557751330(i);
        }
        return p;
    }
    static double N7ac557751330(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() <= -29.465272067327497) {
            p = WekaClassifier.N63e590171331(i);
        } else if (((Double) i[10]).doubleValue() > -29.465272067327497) {
            p = 1;
        }
        return p;
    }
    static double N63e590171331(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 0;
        } else if (((Double) i[5]).doubleValue() <= -23.99987466098526) {
            p = 0;
        } else if (((Double) i[5]).doubleValue() > -23.99987466098526) {
            p = 1;
        }
        return p;
    }
    static double N1ef69d171332(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() <= -36.10129462569566) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() > -36.10129462569566) {
            p = WekaClassifier.N56f2c1281333(i);
        }
        return p;
    }
    static double N56f2c1281333(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() <= -31.40358378669866) {
            p = WekaClassifier.N6dc5a7c1334(i);
        } else if (((Double) i[7]).doubleValue() > -31.40358378669866) {
            p = WekaClassifier.N4712e2ec1338(i);
        }
        return p;
    }
    static double N6dc5a7c1334(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 1;
        } else if (((Double) i[6]).doubleValue() <= -29.88654892979158) {
            p = 1;
        } else if (((Double) i[6]).doubleValue() > -29.88654892979158) {
            p = WekaClassifier.N49f607981335(i);
        }
        return p;
    }
    static double N49f607981335(Object []i) {
        double p = Double.NaN;
        if (i[16] == null) {
            p = 0;
        } else if (((Double) i[16]).doubleValue() <= -26.854324956029238) {
            p = WekaClassifier.N63c225941336(i);
        } else if (((Double) i[16]).doubleValue() > -26.854324956029238) {
            p = 1;
        }
        return p;
    }
    static double N63c225941336(Object []i) {
        double p = Double.NaN;
        if (i[18] == null) {
            p = 0;
        } else if (((Double) i[18]).doubleValue() <= -38.95322472587685) {
            p = WekaClassifier.N237943451337(i);
        } else if (((Double) i[18]).doubleValue() > -38.95322472587685) {
            p = 0;
        }
        return p;
    }
    static double N237943451337(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() <= -24.67023912776854) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() > -24.67023912776854) {
            p = 0;
        }
        return p;
    }
    static double N4712e2ec1338(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= -18.420322974618383) {
            p = WekaClassifier.N3ea1f7511339(i);
        } else if (((Double) i[5]).doubleValue() > -18.420322974618383) {
            p = 0;
        }
        return p;
    }
    static double N3ea1f7511339(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() <= -40.55798695729574) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() > -40.55798695729574) {
            p = 1;
        }
        return p;
    }
    static double N4cbd8b941340(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 1;
        } else if (((Double) i[6]).doubleValue() <= -40.52903159351973) {
            p = WekaClassifier.N25b78a2d1341(i);
        } else if (((Double) i[6]).doubleValue() > -40.52903159351973) {
            p = 1;
        }
        return p;
    }
    static double N25b78a2d1341(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 1;
        } else if (((Double) i[14]).doubleValue() <= -23.888572304957933) {
            p = 1;
        } else if (((Double) i[14]).doubleValue() > -23.888572304957933) {
            p = 0;
        }
        return p;
    }
    static double N75e209f51342(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() <= -23.38867473844592) {
            p = WekaClassifier.N444863671343(i);
        } else if (((Double) i[4]).doubleValue() > -23.38867473844592) {
            p = 1;
        }
        return p;
    }
    static double N444863671343(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 1;
        } else if (((Double) i[14]).doubleValue() <= -29.758611146796902) {
            p = WekaClassifier.N6409b1511344(i);
        } else if (((Double) i[14]).doubleValue() > -29.758611146796902) {
            p = WekaClassifier.N591cb2151351(i);
        }
        return p;
    }
    static double N6409b1511344(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= -8.577123429310383) {
            p = WekaClassifier.N7d76b91f1345(i);
        } else if (((Double) i[1]).doubleValue() > -8.577123429310383) {
            p = 1;
        }
        return p;
    }
    static double N7d76b91f1345(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= -6.019186774314825) {
            p = WekaClassifier.N18beaae51346(i);
        } else if (((Double) i[0]).doubleValue() > -6.019186774314825) {
            p = WekaClassifier.N36c0084b1348(i);
        }
        return p;
    }
    static double N18beaae51346(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() <= -30.793031787217807) {
            p = WekaClassifier.N1f6ab1ce1347(i);
        } else if (((Double) i[10]).doubleValue() > -30.793031787217807) {
            p = 1;
        }
        return p;
    }
    static double N1f6ab1ce1347(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() <= -34.01126683250559) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() > -34.01126683250559) {
            p = 0;
        }
        return p;
    }
    static double N36c0084b1348(Object []i) {
        double p = Double.NaN;
        if (i[16] == null) {
            p = 1;
        } else if (((Double) i[16]).doubleValue() <= -40.65416059045495) {
            p = WekaClassifier.N7e36f1cd1349(i);
        } else if (((Double) i[16]).doubleValue() > -40.65416059045495) {
            p = 1;
        }
        return p;
    }
    static double N7e36f1cd1349(Object []i) {
        double p = Double.NaN;
        if (i[13] == null) {
            p = 1;
        } else if (((Double) i[13]).doubleValue() <= -29.46701528579684) {
            p = WekaClassifier.N13b2956c1350(i);
        } else if (((Double) i[13]).doubleValue() > -29.46701528579684) {
            p = 0;
        }
        return p;
    }
    static double N13b2956c1350(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() <= -42.25634118405445) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() > -42.25634118405445) {
            p = 1;
        }
        return p;
    }
    static double N591cb2151351(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() <= -29.008332769549924) {
            p = WekaClassifier.N6fa86b2d1352(i);
        } else if (((Double) i[10]).doubleValue() > -29.008332769549924) {
            p = WekaClassifier.N65ba10ee1359(i);
        }
        return p;
    }
    static double N6fa86b2d1352(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -6.204459309190597) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > -6.204459309190597) {
            p = WekaClassifier.N26d9478c1353(i);
        }
        return p;
    }
    static double N26d9478c1353(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() <= -23.30148927885695) {
            p = WekaClassifier.N2147bfce1354(i);
        } else if (((Double) i[6]).doubleValue() > -23.30148927885695) {
            p = 1;
        }
        return p;
    }
    static double N2147bfce1354(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= -1.735551197420186) {
            p = WekaClassifier.N1d772de91355(i);
        } else if (((Double) i[0]).doubleValue() > -1.735551197420186) {
            p = WekaClassifier.N5d2318f71357(i);
        }
        return p;
    }
    static double N1d772de91355(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() <= -34.43252424329501) {
            p = WekaClassifier.N31aacc691356(i);
        } else if (((Double) i[8]).doubleValue() > -34.43252424329501) {
            p = 0;
        }
        return p;
    }
    static double N31aacc691356(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= -23.4562119806489) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() > -23.4562119806489) {
            p = 0;
        }
        return p;
    }
    static double N5d2318f71357(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() <= -24.709285487375112) {
            p = WekaClassifier.N418675521358(i);
        } else if (((Double) i[7]).doubleValue() > -24.709285487375112) {
            p = 0;
        }
        return p;
    }
    static double N418675521358(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() <= -25.04600712482134) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() > -25.04600712482134) {
            p = 0;
        }
        return p;
    }
    static double N65ba10ee1359(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 1;
        } else if (((Double) i[6]).doubleValue() <= -40.72354024243759) {
            p = WekaClassifier.N29441b41360(i);
        } else if (((Double) i[6]).doubleValue() > -40.72354024243759) {
            p = 1;
        }
        return p;
    }
    static double N29441b41360(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= -8.483388652344345) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() > -8.483388652344345) {
            p = 1;
        }
        return p;
    }
    static double N47b505b11361(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() <= -16.816112397325025) {
            p = WekaClassifier.N356bd4f01362(i);
        } else if (((Double) i[7]).doubleValue() > -16.816112397325025) {
            p = WekaClassifier.N380b69a91367(i);
        }
        return p;
    }
    static double N356bd4f01362(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 1;
        } else if (((Double) i[8]).doubleValue() <= -24.678923452133773) {
            p = 1;
        } else if (((Double) i[8]).doubleValue() > -24.678923452133773) {
            p = WekaClassifier.N638fd31363(i);
        }
        return p;
    }
    static double N638fd31363(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() <= -28.542742684158057) {
            p = WekaClassifier.N205af78a1364(i);
        } else if (((Double) i[4]).doubleValue() > -28.542742684158057) {
            p = 1;
        }
        return p;
    }
    static double N205af78a1364(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= -18.05611950585218) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() > -18.05611950585218) {
            p = WekaClassifier.N4fadf6bd1365(i);
        }
        return p;
    }
    static double N4fadf6bd1365(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= -3.778275384365891) {
            p = WekaClassifier.N240a77ec1366(i);
        } else if (((Double) i[1]).doubleValue() > -3.778275384365891) {
            p = 1;
        }
        return p;
    }
    static double N240a77ec1366(Object []i) {
        double p = Double.NaN;
        if (i[18] == null) {
            p = 0;
        } else if (((Double) i[18]).doubleValue() <= -35.15578521634295) {
            p = 0;
        } else if (((Double) i[18]).doubleValue() > -35.15578521634295) {
            p = 1;
        }
        return p;
    }
    static double N380b69a91367(Object []i) {
        double p = Double.NaN;
        if (i[16] == null) {
            p = 1;
        } else if (((Double) i[16]).doubleValue() <= -21.420572272760204) {
            p = 1;
        } else if (((Double) i[16]).doubleValue() > -21.420572272760204) {
            p = 0;
        }
        return p;
    }
    static double N4f9a3f851368(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() <= -25.48841571733205) {
            p = WekaClassifier.N6f2220d51369(i);
        } else if (((Double) i[4]).doubleValue() > -25.48841571733205) {
            p = 1;
        }
        return p;
    }
    static double N6f2220d51369(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= -15.94854823815745) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() > -15.94854823815745) {
            p = 0;
        }
        return p;
    }
    static double N18608fca1370(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() <= -30.970589614334568) {
            p = WekaClassifier.N7bc5fb4e1371(i);
        } else if (((Double) i[8]).doubleValue() > -30.970589614334568) {
            p = 1;
        }
        return p;
    }
    static double N7bc5fb4e1371(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= -23.108185775701287) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() > -23.108185775701287) {
            p = 0;
        }
        return p;
    }
    static double N65bd85a41372(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= -17.153790491653794) {
            p = WekaClassifier.N1be7254e1373(i);
        } else if (((Double) i[2]).doubleValue() > -17.153790491653794) {
            p = WekaClassifier.N58a557121433(i);
        }
        return p;
    }
    static double N1be7254e1373(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= -23.50724659049147) {
            p = WekaClassifier.N765e7271374(i);
        } else if (((Double) i[5]).doubleValue() > -23.50724659049147) {
            p = WekaClassifier.N7fc87bce1428(i);
        }
        return p;
    }
    static double N765e7271374(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= -17.56211193756362) {
            p = WekaClassifier.N532e630e1375(i);
        } else if (((Double) i[9]).doubleValue() > -17.56211193756362) {
            p = WekaClassifier.N33d870881427(i);
        }
        return p;
    }
    static double N532e630e1375(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -10.448887969075294) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > -10.448887969075294) {
            p = WekaClassifier.N5a374c6a1376(i);
        }
        return p;
    }
    static double N5a374c6a1376(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= -23.391377298917032) {
            p = WekaClassifier.N78d8df371377(i);
        } else if (((Double) i[3]).doubleValue() > -23.391377298917032) {
            p = WekaClassifier.N2c4145ea1392(i);
        }
        return p;
    }
    static double N78d8df371377(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= -11.56871956376677) {
            p = WekaClassifier.N502c53d41378(i);
        } else if (((Double) i[1]).doubleValue() > -11.56871956376677) {
            p = 1;
        }
        return p;
    }
    static double N502c53d41378(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= -18.704943052512377) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() > -18.704943052512377) {
            p = WekaClassifier.N70ba6ccc1379(i);
        }
        return p;
    }
    static double N70ba6ccc1379(Object []i) {
        double p = Double.NaN;
        if (i[19] == null) {
            p = 0;
        } else if (((Double) i[19]).doubleValue() <= -53.23311961460914) {
            p = WekaClassifier.N100e2aad1380(i);
        } else if (((Double) i[19]).doubleValue() > -53.23311961460914) {
            p = WekaClassifier.N3feef95b1383(i);
        }
        return p;
    }
    static double N100e2aad1380(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 0;
        } else if (((Double) i[9]).doubleValue() <= -33.48648880072884) {
            p = WekaClassifier.N2e917efc1381(i);
        } else if (((Double) i[9]).doubleValue() > -33.48648880072884) {
            p = 1;
        }
        return p;
    }
    static double N2e917efc1381(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= -6.398034868678877) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() > -6.398034868678877) {
            p = WekaClassifier.N1c913a091382(i);
        }
        return p;
    }
    static double N1c913a091382(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -3.855201671339465) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > -3.855201671339465) {
            p = 0;
        }
        return p;
    }
    static double N3feef95b1383(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -3.7890905637124064) {
            p = WekaClassifier.N5e54e7491384(i);
        } else if (((Double) i[0]).doubleValue() > -3.7890905637124064) {
            p = WekaClassifier.N6ec338e81386(i);
        }
        return p;
    }
    static double N5e54e7491384(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= -18.215787834518927) {
            p = WekaClassifier.N7b9704e11385(i);
        } else if (((Double) i[1]).doubleValue() > -18.215787834518927) {
            p = 1;
        }
        return p;
    }
    static double N7b9704e11385(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 0;
        } else if (((Double) i[9]).doubleValue() <= -30.700707671044896) {
            p = 0;
        } else if (((Double) i[9]).doubleValue() > -30.700707671044896) {
            p = 1;
        }
        return p;
    }
    static double N6ec338e81386(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() <= -31.033205289867787) {
            p = WekaClassifier.N26af304a1387(i);
        } else if (((Double) i[4]).doubleValue() > -31.033205289867787) {
            p = WekaClassifier.N6bb82d6a1390(i);
        }
        return p;
    }
    static double N26af304a1387(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 0;
        } else if (((Double) i[14]).doubleValue() <= -28.782680531605852) {
            p = WekaClassifier.N5fb8f5791388(i);
        } else if (((Double) i[14]).doubleValue() > -28.782680531605852) {
            p = 1;
        }
        return p;
    }
    static double N5fb8f5791388(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() <= -40.681044725378136) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() > -40.681044725378136) {
            p = WekaClassifier.N1ccb42631389(i);
        }
        return p;
    }
    static double N1ccb42631389(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() <= -34.76410070019746) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() > -34.76410070019746) {
            p = 1;
        }
        return p;
    }
    static double N6bb82d6a1390(Object []i) {
        double p = Double.NaN;
        if (i[19] == null) {
            p = 1;
        } else if (((Double) i[19]).doubleValue() <= -37.01658991441674) {
            p = WekaClassifier.N34ca7d371391(i);
        } else if (((Double) i[19]).doubleValue() > -37.01658991441674) {
            p = 1;
        }
        return p;
    }
    static double N34ca7d371391(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() <= -29.249368603860603) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() > -29.249368603860603) {
            p = 0;
        }
        return p;
    }
    static double N2c4145ea1392(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= -6.96460456851144) {
            p = WekaClassifier.N6a5fc25b1393(i);
        } else if (((Double) i[1]).doubleValue() > -6.96460456851144) {
            p = WekaClassifier.N6e49631a1425(i);
        }
        return p;
    }
    static double N6a5fc25b1393(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() <= -21.642285114161346) {
            p = WekaClassifier.N40a671071394(i);
        } else if (((Double) i[4]).doubleValue() > -21.642285114161346) {
            p = 1;
        }
        return p;
    }
    static double N40a671071394(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() <= -24.178637506428856) {
            p = WekaClassifier.N27628fe11395(i);
        } else if (((Double) i[10]).doubleValue() > -24.178637506428856) {
            p = 1;
        }
        return p;
    }
    static double N27628fe11395(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -1.1343139530856092) {
            p = WekaClassifier.N12af0f21396(i);
        } else if (((Double) i[0]).doubleValue() > -1.1343139530856092) {
            p = WekaClassifier.N396947db1422(i);
        }
        return p;
    }
    static double N12af0f21396(Object []i) {
        double p = Double.NaN;
        if (i[19] == null) {
            p = 0;
        } else if (((Double) i[19]).doubleValue() <= -45.798332340925455) {
            p = WekaClassifier.N1573a7961397(i);
        } else if (((Double) i[19]).doubleValue() > -45.798332340925455) {
            p = WekaClassifier.N4ce0cca11403(i);
        }
        return p;
    }
    static double N1573a7961397(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= -38.78314344483215) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() > -38.78314344483215) {
            p = WekaClassifier.N66aec2761398(i);
        }
        return p;
    }
    static double N66aec2761398(Object []i) {
        double p = Double.NaN;
        if (i[16] == null) {
            p = 1;
        } else if (((Double) i[16]).doubleValue() <= -42.97045521386565) {
            p = 1;
        } else if (((Double) i[16]).doubleValue() > -42.97045521386565) {
            p = WekaClassifier.N558044c51399(i);
        }
        return p;
    }
    static double N558044c51399(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= -2.7986568319671363) {
            p = WekaClassifier.N37b93e71400(i);
        } else if (((Double) i[0]).doubleValue() > -2.7986568319671363) {
            p = WekaClassifier.Nbbcdb091401(i);
        }
        return p;
    }
    static double N37b93e71400(Object []i) {
        double p = Double.NaN;
        if (i[15] == null) {
            p = 0;
        } else if (((Double) i[15]).doubleValue() <= -29.736634096977376) {
            p = 0;
        } else if (((Double) i[15]).doubleValue() > -29.736634096977376) {
            p = 1;
        }
        return p;
    }
    static double Nbbcdb091401(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= -18.379635846504215) {
            p = WekaClassifier.N1b91157a1402(i);
        } else if (((Double) i[3]).doubleValue() > -18.379635846504215) {
            p = 0;
        }
        return p;
    }
    static double N1b91157a1402(Object []i) {
        double p = Double.NaN;
        if (i[18] == null) {
            p = 0;
        } else if (((Double) i[18]).doubleValue() <= -40.5099036009848) {
            p = 0;
        } else if (((Double) i[18]).doubleValue() > -40.5099036009848) {
            p = 1;
        }
        return p;
    }
    static double N4ce0cca11403(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= -17.59450212126883) {
            p = WekaClassifier.N135b8a711404(i);
        } else if (((Double) i[1]).doubleValue() > -17.59450212126883) {
            p = WekaClassifier.N6dfb9fe51406(i);
        }
        return p;
    }
    static double N135b8a711404(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 1;
        } else if (((Double) i[14]).doubleValue() <= -31.496863195691894) {
            p = 1;
        } else if (((Double) i[14]).doubleValue() > -31.496863195691894) {
            p = WekaClassifier.N7ed27f801405(i);
        }
        return p;
    }
    static double N7ed27f801405(Object []i) {
        double p = Double.NaN;
        if (i[17] == null) {
            p = 0;
        } else if (((Double) i[17]).doubleValue() <= -37.841688049851754) {
            p = 0;
        } else if (((Double) i[17]).doubleValue() > -37.841688049851754) {
            p = 1;
        }
        return p;
    }
    static double N6dfb9fe51406(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() <= -33.9269333041518) {
            p = WekaClassifier.N2734c33f1407(i);
        } else if (((Double) i[7]).doubleValue() > -33.9269333041518) {
            p = WekaClassifier.N4341b7a91412(i);
        }
        return p;
    }
    static double N2734c33f1407(Object []i) {
        double p = Double.NaN;
        if (i[19] == null) {
            p = 1;
        } else if (((Double) i[19]).doubleValue() <= -41.92623789264887) {
            p = WekaClassifier.N68f3ddaa1408(i);
        } else if (((Double) i[19]).doubleValue() > -41.92623789264887) {
            p = WekaClassifier.N348532af1410(i);
        }
        return p;
    }
    static double N68f3ddaa1408(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= -33.52582760489375) {
            p = WekaClassifier.N5b0814b1409(i);
        } else if (((Double) i[4]).doubleValue() > -33.52582760489375) {
            p = 1;
        }
        return p;
    }
    static double N5b0814b1409(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -3.2567173530040634) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > -3.2567173530040634) {
            p = 0;
        }
        return p;
    }
    static double N348532af1410(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= -24.629639409424165) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() > -24.629639409424165) {
            p = WekaClassifier.N35a9223b1411(i);
        }
        return p;
    }
    static double N35a9223b1411(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= -3.342630613657292) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() > -3.342630613657292) {
            p = 1;
        }
        return p;
    }
    static double N4341b7a91412(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() <= -25.486499549777513) {
            p = WekaClassifier.N427acc531413(i);
        } else if (((Double) i[8]).doubleValue() > -25.486499549777513) {
            p = 1;
        }
        return p;
    }
    static double N427acc531413(Object []i) {
        double p = Double.NaN;
        if (i[15] == null) {
            p = 0;
        } else if (((Double) i[15]).doubleValue() <= -27.46243244194848) {
            p = WekaClassifier.N5f779ef91414(i);
        } else if (((Double) i[15]).doubleValue() > -27.46243244194848) {
            p = 1;
        }
        return p;
    }
    static double N5f779ef91414(Object []i) {
        double p = Double.NaN;
        if (i[19] == null) {
            p = 0;
        } else if (((Double) i[19]).doubleValue() <= -26.506705823728485) {
            p = WekaClassifier.N23b3d7d61415(i);
        } else if (((Double) i[19]).doubleValue() > -26.506705823728485) {
            p = 1;
        }
        return p;
    }
    static double N23b3d7d61415(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 1;
        } else if (((Double) i[11]).doubleValue() <= -33.767061381874576) {
            p = WekaClassifier.N6d81d0f61416(i);
        } else if (((Double) i[11]).doubleValue() > -33.767061381874576) {
            p = WekaClassifier.N27de21331419(i);
        }
        return p;
    }
    static double N6d81d0f61416(Object []i) {
        double p = Double.NaN;
        if (i[15] == null) {
            p = 0;
        } else if (((Double) i[15]).doubleValue() <= -33.10304331407536) {
            p = WekaClassifier.N790d81411417(i);
        } else if (((Double) i[15]).doubleValue() > -33.10304331407536) {
            p = 1;
        }
        return p;
    }
    static double N790d81411417(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= -30.802176541809466) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() > -30.802176541809466) {
            p = WekaClassifier.N1a6e58cf1418(i);
        }
        return p;
    }
    static double N1a6e58cf1418(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= -18.377095501233107) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() > -18.377095501233107) {
            p = 0;
        }
        return p;
    }
    static double N27de21331419(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 0;
        } else if (((Double) i[5]).doubleValue() <= -28.245484801916287) {
            p = WekaClassifier.N443b435e1420(i);
        } else if (((Double) i[5]).doubleValue() > -28.245484801916287) {
            p = 0;
        }
        return p;
    }
    static double N443b435e1420(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= -38.21194218332244) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() > -38.21194218332244) {
            p = WekaClassifier.N5129d5111421(i);
        }
        return p;
    }
    static double N5129d5111421(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= -22.60944045696133) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() > -22.60944045696133) {
            p = 0;
        }
        return p;
    }
    static double N396947db1422(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() <= -33.714900426371194) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() > -33.714900426371194) {
            p = WekaClassifier.N6f682e7c1423(i);
        }
        return p;
    }
    static double N6f682e7c1423(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 0;
        } else if (((Double) i[14]).doubleValue() <= -42.82571423369712) {
            p = 0;
        } else if (((Double) i[14]).doubleValue() > -42.82571423369712) {
            p = WekaClassifier.N7157a17c1424(i);
        }
        return p;
    }
    static double N7157a17c1424(Object []i) {
        double p = Double.NaN;
        if (i[17] == null) {
            p = 0;
        } else if (((Double) i[17]).doubleValue() <= -46.814654630041474) {
            p = 0;
        } else if (((Double) i[17]).doubleValue() > -46.814654630041474) {
            p = 1;
        }
        return p;
    }
    static double N6e49631a1425(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() <= -20.615238345689384) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() > -20.615238345689384) {
            p = WekaClassifier.N1d6da6971426(i);
        }
        return p;
    }
    static double N1d6da6971426(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() <= -15.851866258870732) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() > -15.851866258870732) {
            p = 0;
        }
        return p;
    }
    static double N33d870881427(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= -25.81195690764464) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() > -25.81195690764464) {
            p = 1;
        }
        return p;
    }
    static double N7fc87bce1428(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= -30.812533085648216) {
            p = WekaClassifier.N5abc869e1429(i);
        } else if (((Double) i[9]).doubleValue() > -30.812533085648216) {
            p = 1;
        }
        return p;
    }
    static double N5abc869e1429(Object []i) {
        double p = Double.NaN;
        if (i[17] == null) {
            p = 1;
        } else if (((Double) i[17]).doubleValue() <= -29.446769573831688) {
            p = 1;
        } else if (((Double) i[17]).doubleValue() > -29.446769573831688) {
            p = WekaClassifier.N2a95da401430(i);
        }
        return p;
    }
    static double N2a95da401430(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 1;
        } else if (((Double) i[14]).doubleValue() <= -31.059593116358702) {
            p = WekaClassifier.N5ab9a3aa1431(i);
        } else if (((Double) i[14]).doubleValue() > -31.059593116358702) {
            p = 1;
        }
        return p;
    }
    static double N5ab9a3aa1431(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() <= -22.796791441906016) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() > -22.796791441906016) {
            p = WekaClassifier.N6613a5381432(i);
        }
        return p;
    }
    static double N6613a5381432(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= -1.968639995725617) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() > -1.968639995725617) {
            p = 1;
        }
        return p;
    }
    static double N58a557121433(Object []i) {
        double p = Double.NaN;
        if (i[17] == null) {
            p = 1;
        } else if (((Double) i[17]).doubleValue() <= -19.5383042283706) {
            p = WekaClassifier.N5ce6c19c1434(i);
        } else if (((Double) i[17]).doubleValue() > -19.5383042283706) {
            p = WekaClassifier.N10715b791456(i);
        }
        return p;
    }
    static double N5ce6c19c1434(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= -14.60304844212937) {
            p = WekaClassifier.N4b559d591435(i);
        } else if (((Double) i[2]).doubleValue() > -14.60304844212937) {
            p = WekaClassifier.N49ed626c1451(i);
        }
        return p;
    }
    static double N4b559d591435(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= -15.805722287256856) {
            p = WekaClassifier.N3094cb6e1436(i);
        } else if (((Double) i[9]).doubleValue() > -15.805722287256856) {
            p = WekaClassifier.N74553afa1449(i);
        }
        return p;
    }
    static double N3094cb6e1436(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= -27.150343698722295) {
            p = WekaClassifier.N42fb07a91437(i);
        } else if (((Double) i[5]).doubleValue() > -27.150343698722295) {
            p = 1;
        }
        return p;
    }
    static double N42fb07a91437(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() <= -15.639771694302446) {
            p = WekaClassifier.N287bd44b1438(i);
        } else if (((Double) i[7]).doubleValue() > -15.639771694302446) {
            p = WekaClassifier.N79a918691448(i);
        }
        return p;
    }
    static double N287bd44b1438(Object []i) {
        double p = Double.NaN;
        if (i[19] == null) {
            p = 1;
        } else if (((Double) i[19]).doubleValue() <= -41.061762956580964) {
            p = WekaClassifier.N4f232b481439(i);
        } else if (((Double) i[19]).doubleValue() > -41.061762956580964) {
            p = 1;
        }
        return p;
    }
    static double N4f232b481439(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() <= -34.44700943603852) {
            p = WekaClassifier.N59fa56791440(i);
        } else if (((Double) i[10]).doubleValue() > -34.44700943603852) {
            p = 1;
        }
        return p;
    }
    static double N59fa56791440(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= -38.90078422715881) {
            p = WekaClassifier.N4326d4a01441(i);
        } else if (((Double) i[9]).doubleValue() > -38.90078422715881) {
            p = WekaClassifier.N1d920c7a1445(i);
        }
        return p;
    }
    static double N4326d4a01441(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 1;
        } else if (((Double) i[12]).doubleValue() <= -38.84714491584327) {
            p = 1;
        } else if (((Double) i[12]).doubleValue() > -38.84714491584327) {
            p = WekaClassifier.N358989031442(i);
        }
        return p;
    }
    static double N358989031442(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() <= -33.2713525561356) {
            p = WekaClassifier.N63a69d911443(i);
        } else if (((Double) i[6]).doubleValue() > -33.2713525561356) {
            p = WekaClassifier.N686446021444(i);
        }
        return p;
    }
    static double N63a69d911443(Object []i) {
        double p = Double.NaN;
        if (i[15] == null) {
            p = 1;
        } else if (((Double) i[15]).doubleValue() <= -42.610455535880355) {
            p = 1;
        } else if (((Double) i[15]).doubleValue() > -42.610455535880355) {
            p = 0;
        }
        return p;
    }
    static double N686446021444(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -1.615883285619752) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > -1.615883285619752) {
            p = 0;
        }
        return p;
    }
    static double N1d920c7a1445(Object []i) {
        double p = Double.NaN;
        if (i[16] == null) {
            p = 1;
        } else if (((Double) i[16]).doubleValue() <= -47.319339908580986) {
            p = WekaClassifier.N642a4f5a1446(i);
        } else if (((Double) i[16]).doubleValue() > -47.319339908580986) {
            p = 1;
        }
        return p;
    }
    static double N642a4f5a1446(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 0;
        } else if (((Double) i[14]).doubleValue() <= -45.16870954364656) {
            p = 0;
        } else if (((Double) i[14]).doubleValue() > -45.16870954364656) {
            p = WekaClassifier.N33370c5b1447(i);
        }
        return p;
    }
    static double N33370c5b1447(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 1;
        } else if (((Double) i[14]).doubleValue() <= -31.95836917204324) {
            p = 1;
        } else if (((Double) i[14]).doubleValue() > -31.95836917204324) {
            p = 0;
        }
        return p;
    }
    static double N79a918691448(Object []i) {
        double p = Double.NaN;
        if (i[13] == null) {
            p = 0;
        } else if (((Double) i[13]).doubleValue() <= -31.10963092930663) {
            p = 0;
        } else if (((Double) i[13]).doubleValue() > -31.10963092930663) {
            p = 1;
        }
        return p;
    }
    static double N74553afa1449(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= -27.67016074632552) {
            p = WekaClassifier.N42b3fbb51450(i);
        } else if (((Double) i[4]).doubleValue() > -27.67016074632552) {
            p = 1;
        }
        return p;
    }
    static double N42b3fbb51450(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 0;
        } else if (((Double) i[5]).doubleValue() <= -23.466897383428545) {
            p = 0;
        } else if (((Double) i[5]).doubleValue() > -23.466897383428545) {
            p = 1;
        }
        return p;
    }
    static double N49ed626c1451(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -2.4203081655998204) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > -2.4203081655998204) {
            p = WekaClassifier.N78b641681452(i);
        }
        return p;
    }
    static double N78b641681452(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= -4.123585181922934) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() > -4.123585181922934) {
            p = WekaClassifier.N25e9366e1453(i);
        }
        return p;
    }
    static double N25e9366e1453(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= -2.8124654411330923) {
            p = WekaClassifier.N78da0f351454(i);
        } else if (((Double) i[1]).doubleValue() > -2.8124654411330923) {
            p = 1;
        }
        return p;
    }
    static double N78da0f351454(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 1;
        } else if (((Double) i[11]).doubleValue() <= -20.73254160921948) {
            p = 1;
        } else if (((Double) i[11]).doubleValue() > -20.73254160921948) {
            p = WekaClassifier.N5a86fc401455(i);
        }
        return p;
    }
    static double N5a86fc401455(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() <= -29.0808666920639) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() > -29.0808666920639) {
            p = 1;
        }
        return p;
    }
    static double N10715b791456(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() <= -25.56029168107021) {
            p = WekaClassifier.N7c47555f1457(i);
        } else if (((Double) i[4]).doubleValue() > -25.56029168107021) {
            p = 1;
        }
        return p;
    }
    static double N7c47555f1457(Object []i) {
        double p = Double.NaN;
        if (i[15] == null) {
            p = 1;
        } else if (((Double) i[15]).doubleValue() <= -21.955218462895694) {
            p = 1;
        } else if (((Double) i[15]).doubleValue() > -21.955218462895694) {
            p = WekaClassifier.N544c4e451458(i);
        }
        return p;
    }
    static double N544c4e451458(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() <= -23.105701250689915) {
            p = WekaClassifier.N39c5dc701459(i);
        } else if (((Double) i[8]).doubleValue() > -23.105701250689915) {
            p = 1;
        }
        return p;
    }
    static double N39c5dc701459(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 1;
        } else if (((Double) i[11]).doubleValue() <= -23.10077597707829) {
            p = 1;
        } else if (((Double) i[11]).doubleValue() > -23.10077597707829) {
            p = WekaClassifier.N2375f2a21460(i);
        }
        return p;
    }
    static double N2375f2a21460(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -5.034837371353603) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > -5.034837371353603) {
            p = 0;
        }
        return p;
    }
}
